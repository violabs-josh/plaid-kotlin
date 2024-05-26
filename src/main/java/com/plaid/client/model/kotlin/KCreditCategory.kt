package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName

data class KCreditCategory(
    @SerializedName("primary")
    val primary: String,
    @SerializedName("detailed")
    val detailed: String
)