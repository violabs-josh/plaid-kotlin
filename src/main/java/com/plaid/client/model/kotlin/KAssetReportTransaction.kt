package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal
import java.time.LocalDate

data class KAssetReportTransaction(
    @SerializedName("account_id")
    val accountId: String,
    @SerializedName("amount")
    val amount: BigDecimal,
    @SerializedName("iso_currency_code")
    val isoCurrencyCode: String,
    @SerializedName("unofficial_currency_code")
    val unofficialCurrencyCode: String,
    @SerializedName("original_description")
    val originalDescription: String,
    @SerializedName("category")
    val category: List<String>,
    @SerializedName("category_id")
    val categoryId: String,
    @SerializedName("credit_category")
    val creditCategory: KCreditCategory,
    @SerializedName("check_number")
    val checkNumber: String,
    @SerializedName("date")
    val date: LocalDate,
    @SerializedName("date_transacted")
    val dateTransacted: String,
    @SerializedName("location")
    val location: KLocation,
    @SerializedName("name")
    val name: String,
    @SerializedName("merchant_name")
    val merchantName: String,
    @SerializedName("payment_meta")
    val paymentMeta: KPaymentMeta,
    @SerializedName("pending")
    val pending: Boolean,
    @SerializedName("pending_transaction_id")
    val pendingTransactionId: String,
    @SerializedName("account_owner")
    val accountOwner: String,
    @SerializedName("transaction_id")
    val transactionId: String,
    @SerializedName("transaction_type")
    val transactionType: KAssetReportTransactionType,
    @SerializedName("income_source_id")
    val incomeSourceId: String
)
