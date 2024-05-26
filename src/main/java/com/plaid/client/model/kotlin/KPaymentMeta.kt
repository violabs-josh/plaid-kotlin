package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName

data class KPaymentMeta(
    @SerializedName("reference_number")
    val referenceNumber: String,
    @SerializedName("ppd_id")
    val ppdId: String,
    @SerializedName("payee")
    val payee: String,
    @SerializedName("by_order_of")
    val byOrderOf: String,
    @SerializedName("payer")
    val payer: String,
    @SerializedName("payment_method")
    val paymentMethod: String,
    @SerializedName("payment_processor")
    val paymentProcessor: String,
    @SerializedName("reason")
    val reason: String
)
