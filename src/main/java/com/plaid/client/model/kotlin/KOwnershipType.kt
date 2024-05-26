package com.plaid.client.model.kotlin

enum class KOwnershipType : IEnum {
    INDIVIDUAL,
    JOINT,
    ASSOCIATION,
    TRUST,
    NULL,
    ENUM_UNKNOWN;

    override fun toString(): String {
        return this.name.toLowerCase()
    }

    companion object {
        fun fromString(value: String): KOwnershipType = IEnum.fromString(value, ENUM_UNKNOWN, ::valueOf)
    }

    class Adapter : EnumAdapter<KOwnershipType>() {
        override fun fromString(value: String): KOwnershipType = KOwnershipType.fromString(value)
    }
}