package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName

// what does nullable mean...
class KAccountProductAccessNullable(
    @SerializedName("account_data")
    val canAccessAccountDate: Boolean = true,
    @SerializedName("statements")
    val canAccessStatements: Boolean = true,
    @SerializedName("tax_documents")
    val canAccessTaxDocuments: Boolean = true
)