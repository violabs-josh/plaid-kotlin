package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName

data class KLocation(
    @SerializedName("address")
    val address: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("region")
    val region: String,
    @SerializedName("postal_code")
    val postalCode: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val long: Double,
    @SerializedName("store_number")
    val storeNumber: String
)