package com.plaid.client.model.kotlin

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

//public static final String SERIALIZED_NAME_INVESTMENT_TRANSACTION_ID = "investment_transaction_id";
//  @SerializedName(SERIALIZED_NAME_INVESTMENT_TRANSACTION_ID)
//  private String investmentTransactionId;
//
//  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
//  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
//  private String accountId;
//
//  public static final String SERIALIZED_NAME_SECURITY_ID = "security_id";
//  @SerializedName(SERIALIZED_NAME_SECURITY_ID)
//  private String securityId;
//
//  public static final String SERIALIZED_NAME_DATE = "date";
//  @SerializedName(SERIALIZED_NAME_DATE)
//  private LocalDate date;
//
//  public static final String SERIALIZED_NAME_NAME = "name";
//  @SerializedName(SERIALIZED_NAME_NAME)
//  private String name;
//
//  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
//  @SerializedName(SERIALIZED_NAME_QUANTITY)
//  private Double quantity;
//
//  public static final String SERIALIZED_NAME_VESTED_QUANTITY = "vested_quantity";
//  @SerializedName(SERIALIZED_NAME_VESTED_QUANTITY)
//  private Double vestedQuantity;
//
//  public static final String SERIALIZED_NAME_VESTED_VALUE = "vested_value";
//  @SerializedName(SERIALIZED_NAME_VESTED_VALUE)
//  private Double vestedValue;
//
//  public static final String SERIALIZED_NAME_AMOUNT = "amount";
//  @SerializedName(SERIALIZED_NAME_AMOUNT)
//  private Double amount;
//
//  public static final String SERIALIZED_NAME_PRICE = "price";
//  @SerializedName(SERIALIZED_NAME_PRICE)
//  private Double price;
//
//  public static final String SERIALIZED_NAME_FEES = "fees";
//  @SerializedName(SERIALIZED_NAME_FEES)
//  private Double fees;
//
//  public static final String SERIALIZED_NAME_TYPE = "type";
//  @SerializedName(SERIALIZED_NAME_TYPE)
//  private InvestmentTransactionType type;
//
//  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
//  @SerializedName(SERIALIZED_NAME_SUBTYPE)
//  private InvestmentTransactionSubtype subtype;
//
//  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
//  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
//  private String isoCurrencyCode;
//
//  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
//  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
//  private String unofficialCurrencyCode;
data class KAssetReportInvestments(
    @SerializedName("investment_transaction_id")
    val investmentTransactionId: String,
    @SerializedName("account_id")
    val accountId: String,
    @SerializedName("security_id")
    val securityId: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("quantity")
    val quantity: BigDecimal,
    @SerializedName("vested_quantity")
    val vestedQuantity: BigDecimal,
    @SerializedName("vested_value")
    val vestedValue: BigDecimal,
    @SerializedName("amount")
    val amount: BigDecimal,
    @SerializedName("price")
    val price: BigDecimal,
    @SerializedName("fees")
    val fees: BigDecimal,
    @SerializedName("type")
    val type: KInvestmentTransactionType,
    @SerializedName("subtype")
    val subtype: KInvestmentTransactionSubtype,
    @SerializedName("iso_currency_code")
    val isoCurrencyCode: String,
    @SerializedName("unofficial_currency_code")
    val unofficialCurrencyCode: String
)