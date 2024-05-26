package com.plaid.client.model.kotlin

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

data class KEmail(
    @SerializedName("data")
    val data: String,
    @SerializedName("primary")
    val primary: Boolean,
    @SerializedName("type")
    val type: Type
) {

    @JsonAdapter(Type.Adapter::class)
    enum class Type : IEnum {
        PRIMARY,
        SECONDARY,
        OTHER;

        override fun toString(): String {
            return this.name.toLowerCase()
        }

        companion object {
            fun fromString(value: String): Type = IEnum.fromString(value, OTHER, ::valueOf)
        }

        class Adapter : EnumAdapter<Type>() {
            override fun fromString(value: String): Type = Type.fromString(value)
        }
    }
}
