package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName

data class KOwner(
    @SerializedName("names")
    val names: List<String>,
    @SerializedName("phone_numbers")
    val phoneNumbers: List<KPhoneNumber>,
    @SerializedName("emails")
    val emails: List<KEmail>,
    @SerializedName("addresses")
    val addresses: List<KAddress>,
    @SerializedName("document_id")
    val documentId: String
)
