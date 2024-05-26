package com.plaid.client.kotlin

object KCollectionFormats {
    abstract class Params(
        val params: List<String>,
        private val separator: String
    ) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || javaClass != other.javaClass) return false
            other as Params
            return params == other.params
        }

        override fun hashCode(): Int {
            return params.hashCode()
        }

        override fun toString(): String {
            return params.joinToString(separator)
        }
    }
    class CsvParams(params: List<String>) : Params(params, ",")
    class SsvParams(params: List<String>) : Params(params, " ")
    class TsvParams(params: List<String>) : Params(params, "\t")
    class PIPESParams(params: List<String>) : Params(params, "|")
    class SPACEParams(params: List<String>) : Params(params, " ")
}