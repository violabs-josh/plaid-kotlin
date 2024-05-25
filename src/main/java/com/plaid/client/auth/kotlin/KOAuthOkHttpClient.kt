package com.plaid.client.auth.kotlin

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.apache.oltu.oauth2.client.HttpClient
import org.apache.oltu.oauth2.client.request.OAuthClientRequest
import org.apache.oltu.oauth2.client.response.OAuthClientResponse
import org.apache.oltu.oauth2.client.response.OAuthClientResponseFactory
import org.apache.oltu.oauth2.common.exception.OAuthSystemException
import java.io.IOException

private val MEDIA_TYPE = "application/json".toMediaTypeOrNull()

class KOAuthOkHttpClient(
    private val client: OkHttpClient = OkHttpClient()
) : HttpClient {

    override fun <T : OAuthClientResponse?> execute(
        request: OAuthClientRequest,
        headers: MutableMap<String, String>?,
        requestMethod: String,
        responseClass: Class<T>
    ): T {
        val requestBuilder = Request.Builder().url(request.locationUri)

        val mediaType = headers?.get("Content-Type")?.toMediaTypeOrNull() ?: MEDIA_TYPE

        headers?.remove("Content-Type")

        headers?.forEach { (key, value) ->
            requestBuilder.addHeader(key, value)
        }

        val body: RequestBody? = request.body?.toRequestBody(mediaType)

        requestBuilder.method(requestMethod, body)

        return try {
            val response: Response = client.newCall(requestBuilder.build()).execute()

            OAuthClientResponseFactory.createCustomResponse(
                response.body?.string(),
                response.body?.contentType()?.toString(),
                response.code,
                responseClass
            )
        } catch (e: IOException) {
            throw OAuthSystemException(e)
        }
    }

    override fun shutdown() {

    }
}