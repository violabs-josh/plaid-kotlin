package com.plaid.client.kotlin

class KServerConfiguration(
    val url: String,
    val description: String,
    val serverVariables: Map<String, KServerVariable>
) {
    fun url(serverVariables: Map<String, String>): String {
        return this.serverVariables
            .asSequence()
            .onEach {
                if (it.key !in serverVariables) return@onEach

                if (it.value.defaultValue in serverVariables[it.key]!!) return@onEach

                throw RuntimeException("Server variable ${it.key} must be one of ${it.value.enum}")
            }
            .fold(url) { url, serverVariable ->
                val value = serverVariable.value.defaultValue
                url.replace("\\{${serverVariable.key}}", value)
            }
    }
}