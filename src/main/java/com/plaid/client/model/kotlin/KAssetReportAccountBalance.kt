package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal
import java.time.OffsetDateTime

data class KAssetReportAccountBalance(
    @SerializedName("available")
    val available: BigDecimal,
    @SerializedName("current")
    val current: BigDecimal,
    @SerializedName("limit")
    val limit: BigDecimal,
    @SerializedName("margin_loan_amount")
    val marginLoanAmount: BigDecimal,
    @SerializedName("iso_currency_code")
    val isoCurrencyCode: String,
    @SerializedName("unofficial_currency_code")
    val unofficialCurrencyCode: String,
    @SerializedName("last_updated_datetime")
    val lastUpdatedDatetime: OffsetDateTime
)