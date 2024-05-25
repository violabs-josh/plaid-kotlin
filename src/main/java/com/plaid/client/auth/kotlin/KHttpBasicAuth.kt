package com.plaid.client.auth.kotlin

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class KHttpBasicAuth(
    private val username: String,
    private val password: String
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()

        if (request.header("Authorization") == null) {
            request = setCredentials(request)
        }

        return chain.proceed(request)
    }

    private fun setCredentials(request: Request): Request {
        val credentials = Credentials.basic(username, password)
        return request.newBuilder()
            .header("Authorization", credentials)
            .build()
    }
}