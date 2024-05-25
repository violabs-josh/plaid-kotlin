package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName

class KAccountAccess(
    @field:SerializedName("unique_id")
    val uniqueId: String,
    @field:SerializedName("authorized")
    val authorized: Boolean = true,
    @field:SerializedName("account_product_access")
    val accountProductAccess: List<KAccountProductAccessNullable>
)