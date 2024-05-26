package com.plaid.client.model.kotlin

import com.google.gson.annotations.JsonAdapter

@JsonAdapter(KAccountType.Adapter::class)
enum class KAccountType : IEnum {
    INVESTMENT,
    CREDIT,
    DEPOSITORY,
    LOAD,
    BROKERAGE,
    OTHER,
    ENUM_UNKNOWN;

    override fun toString(): String {
        return this.name.toLowerCase()
    }

    companion object {
        fun fromString(value: String): KAccountType = IEnum.fromString(value, ENUM_UNKNOWN, ::valueOf)
    }

    class Adapter : EnumAdapter<KAccountType>() {
        override fun fromString(value: String): KAccountType = KAccountType.fromString(value)
    }
}