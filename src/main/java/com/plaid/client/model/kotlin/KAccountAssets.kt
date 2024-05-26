package com.plaid.client.model.kotlin

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

data class KAccountAssets(
    @SerializedName("account_id")
    val accountId: String,
    @SerializedName("balances")
    val balances: KAssetReportAccountBalance,
    @SerializedName("mask")
    val mask: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("official_name")
    val officialName: String,
    @SerializedName("type")
    val type: KAccountType,
    @SerializedName("subtype")
    val subtype: KAccountSubtype,
    @SerializedName("verification_status")
    val verificationStatus: VerificationStatus,
    @SerializedName("persistent_account_id")
    val persistentAccountId: String,
    @SerializedName("days_available")
    val daysAvailable: String,
    @SerializedName("transactions")
    val transactions: List<KAssetReportTransaction>,
    @SerializedName("investments")
    val investments: KAssetReportInvestments,
    @SerializedName("owners")
    val owners: List<KOwner>,
    @SerializedName("ownership_type")
    val ownershipType: KOwnershipType,
    @SerializedName("historical_balances")
    val historicalBalances: List<KHistoricalBalance>
) {
    @JsonAdapter(VerificationStatus.Adapter::class)
    enum class VerificationStatus {
        AUTOMATICALLY_VERIFIED,
        PENDING_AUTOMATIC_VERIFICATION,
        PENDING_MANUAL_VERIFICATION,
        MANUALLY_VERIFIED,
        VERIFICATION_EXPIRED,
        VERIFICATION_FAILED,
        DATABASE_MATCH;

        override fun toString(): String {
            return this.name.toLowerCase()
        }

        companion object {
            fun fromString(value: String): VerificationStatus {
                return valueOf(value.toUpperCase())
            }
        }

        class Adapter : EnumAdapter<VerificationStatus>() {
            override fun fromString(value: String): VerificationStatus = VerificationStatus.fromString(value)
        }
    }
}