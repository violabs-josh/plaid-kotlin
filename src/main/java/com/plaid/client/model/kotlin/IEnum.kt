package com.plaid.client.model.kotlin

interface IEnum {
    companion object {
        fun <T : IEnum> fromString(
            value: String,
            default: T? = null,
            valueFn: (String) -> T,
        ): T {
            return try {
                valueFn(value.toUpperCase())
            } catch (e: IllegalArgumentException) {
                default ?: throw e
            }
        }
    }
}