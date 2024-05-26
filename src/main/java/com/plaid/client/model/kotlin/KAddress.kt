package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName

data class KAddress(
    @SerializedName("data")
    val data: Data,
    @SerializedName("primary")
    val primary: Boolean,
) {
    data class Data(
        @SerializedName("street")
        val street: String,
        @SerializedName("city")
        val city: String,
        @SerializedName("region")
        val region: String,
        @SerializedName("postal_code")
        val postalCode: String,
        @SerializedName("country")
        val country: String
    )
}
