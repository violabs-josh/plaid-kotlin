package com.plaid.client.kotlin

import com.plaid.client.auth.HttpBasicAuth
import com.plaid.client.auth.HttpBearerAuth
import com.plaid.client.auth.kotlin.KApiKeyAuth
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.text.DateFormat
import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit

private val EXPECTED_HEADERS = listOf("clientId", "plaidVersion", "secret")
private val EXPECTED_HEADER_PARAM_MAP = mapOf(
    "clientId" to "PLAID-CLIENT-ID",
    "plaidVersion" to "Plaid-Version",
    "secret" to "PLAID-SECRET"
)

class KApiClient(
    val apiAuthorizations: MutableMap<String, Interceptor> = mutableMapOf(),
    var okBuilder: OkHttpClient.Builder?,
    val json: KJSON,
    val adapterBuilder: Retrofit.Builder,
    val okHttpClient: OkHttpClient? = null
) {
    constructor(json: KJSON = KJSON()) : this(
        okBuilder = createDefaultOkHttpClient(),
        json = json,
        adapterBuilder = createDefaultAdapter(json)
    )

    constructor(vararg authNames: String) : this() {
        val difference = authNames.toSet() - EXPECTED_HEADERS

        if (difference.isNotEmpty()) {
            throw RuntimeException("authNames $difference not in api authorizations")
        }

        authNames
            .forEach { authName ->
                addAuthorization(authName, KApiKeyAuth(EXPECTED_HEADER_PARAM_MAP[authName]!!))
            }
    }

    constructor(apiKeys: Map<String, String>) : this() {
        val difference = apiKeys.keys - EXPECTED_HEADERS

        if (difference.isNotEmpty()) {
            throw RuntimeException("apiKeys $difference not in api authorizations")
        }

        apiKeys
            .forEach { (key, value) ->
                addAuthorization(key, KApiKeyAuth(EXPECTED_HEADER_PARAM_MAP[key]!!, apiKey = value))
            }
    }

    constructor(authName: String, apiKey: String) : this(mapOf(authName to apiKey))

    constructor(authName: String, username: String, password: String) : this(authName) {
        updateCredentials(username, password)
    }

    fun addAuthorization(authName: String, authorization: Interceptor): KApiClient = apply {
        if (authName in apiAuthorizations) throw RuntimeException("authName $authName already in api authorizations")
        apiAuthorizations[authName] = authorization
        if (okBuilder == null) {
            throw RuntimeException(
                "The ApiClient was created with a built OkHttpClient so it's not " +
                    "possible to add an authorization interceptor to it"
            )
        }
        okBuilder?.addInterceptor(authorization)
    }

    fun updateApiKey(apiKey: String): KApiClient = apply {
        val auth = apiAuthorizations
            .asSequence()
            .filterIsInstance<KApiKeyAuth>()
            .firstOrNull()

        auth?.apiKey = apiKey
    }

    fun updateCredentials(username: String, password: String): KApiClient = apply {
        val auth = apiAuthorizations
            .asSequence()
            .filterIsInstance<HttpBasicAuth>()
            .firstOrNull()

        auth?.setCredentials(username, password)
    }

    fun updateBearerToken(bearerToken: String): KApiClient = apply {
        val auth = apiAuthorizations
            .asSequence()
            .filterIsInstance<HttpBearerAuth>()
            .firstOrNull()

        auth?.bearerToken = bearerToken
    }

    fun addAuthsToOkBuilder(okBuilder: OkHttpClient.Builder): KApiClient = apply {
        apiAuthorizations.values
            .forEach { auth -> okBuilder.addInterceptor(auth) }
    }

    fun configureFromOkClient(okHttpClient: OkHttpClient) {
        okBuilder = okHttpClient.newBuilder()
        addAuthsToOkBuilder(okBuilder!!)
    }

    fun setTimeout(overrideTimeout: Int) {
        okBuilder
            ?.readTimeout(overrideTimeout.toLong(), TimeUnit.SECONDS)
            ?.connectTimeout(overrideTimeout.toLong(), TimeUnit.SECONDS)
    }

    fun <S> createService(serviceClass: Class<S>): S {
        if (okHttpClient == null && okBuilder == null) {
            throw RuntimeException("okHttpClient or okBuilder must be set")
        }

        if (okHttpClient != null) {
            return adapterBuilder.client(okHttpClient).build().create(serviceClass)
        }

        return adapterBuilder.client(okBuilder!!.build()).build().create(serviceClass)
    }

    fun dateFormat(dateFormat: DateFormat): KApiClient = apply {
        json.setDateFormatter(dateFormat)
    }

    fun sqlDateFormat(formatter: DateFormat): KApiClient = apply {
        json.setSqlDateFormatter(formatter)
    }

    fun offsetDateTimeFormat(formatter: DateTimeFormatter): KApiClient = apply {
        json.setOffsetDateTimeFormatter(formatter)
    }

    fun localDateFormat(formatter: DateTimeFormatter): KApiClient = apply {
        json.setLocalDateFormatter(formatter)
    }


    companion object {
        const val PRODUCTION = "https://production.plaid.com"
        const val DEVELOPMENT = "https://development.plaid.com"
        const val SANDBOX = "https://sandbox.plaid.com"
        val ENVIRONMENTS = listOf(PRODUCTION, DEVELOPMENT, SANDBOX)

        fun createDefaultAdapter(json: KJSON): Retrofit.Builder {
            return Retrofit.Builder()
                .baseUrl("$PRODUCTION/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(KGsonCustomConverterFactory.create(json.gson))
        }

        fun createDefaultOkHttpClient(): OkHttpClient.Builder {
            return OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .addInterceptor {
                    val requestWithUserAgent = it
                        .request()
                        .newBuilder()
                        .header("User-Agent", "Plaid Java v23.0.0")
                        .header("Plaid-Version", "2020-09-14")
                        .build()
                    it.proceed(requestWithUserAgent)
                }
        }

        fun createPlaidAdapter(baseUrl: String, json: KJSON): Retrofit.Builder {
            if (baseUrl !in ENVIRONMENTS) {
                throw RuntimeException("Invalid base URL: $baseUrl. Must be one of: $ENVIRONMENTS")
            }

            return createDefaultAdapter(json).baseUrl("$baseUrl/")
        }
    }
}