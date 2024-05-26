package com.plaid.client.model.kotlin

import com.google.gson.annotations.JsonAdapter

@JsonAdapter(KAssetReportTransactionType.Adapter::class)
enum class KAssetReportTransactionType : IEnum {
    DIGITAL,

    PLACE,

    SPECIAL,

    UNRESOLVED,

    ENUM_UNKNOWN;

    override fun toString(): String {
        return this.name.toLowerCase()
    }

    companion object {
        fun fromString(value: String): KAssetReportTransactionType = IEnum.fromString(value, ENUM_UNKNOWN, ::valueOf)
    }

    class Adapter : EnumAdapter<KAssetReportTransactionType>() {
        override fun fromString(value: String): KAssetReportTransactionType =
            KAssetReportTransactionType.fromString(value)
    }
}
