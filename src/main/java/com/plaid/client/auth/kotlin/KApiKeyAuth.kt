package com.plaid.client.auth.kotlin

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import okio.IOException
import java.net.URI
import java.net.URISyntaxException

class KApiKeyAuth(
    val location: String,
    private val paramName: String,
    private var apiKey: String
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()

        request = when (location) {
            Location.HEADER.toString() -> processBasedOnHeader(request)
            Location.COOKIE.toString() -> processBasedOnCookie(request)
            Location.QUERY.toString() -> processBasedOnQuery(request)
            else -> request
        }

        return chain.proceed(request)
    }

    private fun processBasedOnQuery(request: Request): Request {
        val uri: URI = request.url.toUri()

        val query: String? = uri.query
        val paramValue = "$paramName=$apiKey"
        val newQuery = if (query == null) paramValue else "$query&$paramValue"

        val newUri: URI = try {
            URI(uri.scheme, uri.authority, uri.path, newQuery, uri.fragment)
        } catch (e: URISyntaxException) {
            throw IOException(e)
        }

        return request.newBuilder().url(newUri.toURL()).build()
    }

    private fun processBasedOnHeader(request: Request): Request {
        return request.newBuilder().addHeader(paramName, apiKey).build()
    }

    private fun processBasedOnCookie(request: Request): Request {
        return request.newBuilder().header("Cookie", "$paramName=$apiKey").build()
    }

    enum class Location {
        HEADER,
        COOKIE,
        QUERY;

        override fun toString(): String {
            return this.name.toLowerCase()
        }
    }
}