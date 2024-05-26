package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class KHistoricalBalance(
    @SerializedName("date")
    val date: String,
    @SerializedName("current")
    val current: BigDecimal,
    @SerializedName("iso_currency_code")
    val isoCurrencyCode: String,
    @SerializedName("unofficial_currency_code")
    val unofficialCurrencyCode: String
)