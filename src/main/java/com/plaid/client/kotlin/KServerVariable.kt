package com.plaid.client.kotlin

data class KServerVariable(
    val enum: Set<String>,
    val defaultValue: String,
    val description: String
)