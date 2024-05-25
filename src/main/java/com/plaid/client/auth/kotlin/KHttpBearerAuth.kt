package com.plaid.client.auth.kotlin

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class KHttpBearerAuth(
    private val scheme: String = "",
    private val bearerToken: String? = null
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()

        if (request.header("Authorization") == null && bearerToken != null) {
            request = setBearerToken(request)
        }

        return chain.proceed(request)
    }

    private fun setBearerToken(request: Request): Request {
        val schemePart = if (scheme.equals("bearer", ignoreCase = true)) "Bearer" else scheme

        return request.newBuilder()
            .header("Authorization", "$schemePart $bearerToken")
            .build()
    }
}