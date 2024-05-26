package com.plaid.client.model.kotlin

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

abstract class EnumAdapter<E> : TypeAdapter<E>() {
    abstract fun fromString(value: String): E

    override fun write(jsonWriter: JsonWriter, value: E) {
        jsonWriter.value(value.toString())
    }

    override fun read(`in`: JsonReader): E {
        return fromString(`in`.nextString())
    }
}