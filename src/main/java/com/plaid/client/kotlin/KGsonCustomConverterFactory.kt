package com.plaid.client.kotlin

import com.google.gson.Gson
import com.google.gson.JsonParseException
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Type

class KGsonCustomConverterFactory(private val gson: Gson) : Converter.Factory() {
    private val gsonConverterFactory = GsonConverterFactory.create(gson)

    override fun responseBodyConverter(
        type: Type,
        annotations: Array<out Annotation>,
        retrofit: Retrofit
    ): Converter<ResponseBody, *>? {
        return if (type == String::class.java) {
            GsonResponseBodyToStringConverter(gson, type)
        } else {
            gsonConverterFactory.responseBodyConverter(type, annotations, retrofit)
        }
    }

    override fun requestBodyConverter(
        type: Type,
        parameterAnnotations: Array<out Annotation>,
        methodAnnotations: Array<out Annotation>,
        retrofit: Retrofit
    ): Converter<*, RequestBody>? {
        return gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit)
    }

    private class GsonResponseBodyToStringConverter(
        val gson: Gson,
        val type: Type
    ) : Converter<ResponseBody, String> {
        override fun convert(value: ResponseBody): String {
            return try {
                gson.fromJson(value.string(), type)
            } catch (e: JsonParseException) {
                return value.string()
            }
        }
    }

    companion object {
        fun create(gson: Gson): KGsonCustomConverterFactory {
            return KGsonCustomConverterFactory(gson)
        }
    }
}