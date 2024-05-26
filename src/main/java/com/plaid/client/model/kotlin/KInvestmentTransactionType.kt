package com.plaid.client.model.kotlin

import com.google.gson.annotations.JsonAdapter

@JsonAdapter(KInvestmentTransactionSubtype.Adapter::class)
enum class KInvestmentTransactionType : IEnum {
    BUY,
    SELL,
    CANCEL,
    CASH,
    FEE,
    TRANSFER,
    ENUM_UNKNOWN;

    override fun toString(): String {
        return this.name.toLowerCase()
    }

    companion object {
        fun fromString(value: String): KInvestmentTransactionType = IEnum.fromString(value, ENUM_UNKNOWN, ::valueOf)
    }

    class Adapter : EnumAdapter<KInvestmentTransactionType>() {
        override fun fromString(value: String): KInvestmentTransactionType =
            KInvestmentTransactionType.fromString(value)
    }
}
