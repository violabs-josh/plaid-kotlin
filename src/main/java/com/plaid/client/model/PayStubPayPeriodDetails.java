/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.128.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.PayStubDistributionBreakdown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Details about the pay period.
 */
@ApiModel(description = "Details about the pay period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-14T04:41:23.248820Z[Etc/UTC]")
public class PayStubPayPeriodDetails {
  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private Double payAmount;

  public static final String SERIALIZED_NAME_DISTRIBUTION_BREAKDOWN = "distribution_breakdown";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_BREAKDOWN)
  private List<PayStubDistributionBreakdown> distributionBreakdown = new ArrayList<>();

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_GROSS_EARNINGS = "gross_earnings";
  @SerializedName(SERIALIZED_NAME_GROSS_EARNINGS)
  private Double grossEarnings;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_PAY_DATE = "pay_date";
  @SerializedName(SERIALIZED_NAME_PAY_DATE)
  private LocalDate payDate;

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private String payFrequency;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;


  public PayStubPayPeriodDetails payAmount(Double payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * The amount of the paycheck.
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The amount of the paycheck.")

  public Double getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
  }


  public PayStubPayPeriodDetails distributionBreakdown(List<PayStubDistributionBreakdown> distributionBreakdown) {
    
    this.distributionBreakdown = distributionBreakdown;
    return this;
  }

  public PayStubPayPeriodDetails addDistributionBreakdownItem(PayStubDistributionBreakdown distributionBreakdownItem) {
    this.distributionBreakdown.add(distributionBreakdownItem);
    return this;
  }

   /**
   * Get distributionBreakdown
   * @return distributionBreakdown
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PayStubDistributionBreakdown> getDistributionBreakdown() {
    return distributionBreakdown;
  }


  public void setDistributionBreakdown(List<PayStubDistributionBreakdown> distributionBreakdown) {
    this.distributionBreakdown = distributionBreakdown;
  }


  public PayStubPayPeriodDetails endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The date on which the pay period ended, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date on which the pay period ended, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public PayStubPayPeriodDetails grossEarnings(Double grossEarnings) {
    
    this.grossEarnings = grossEarnings;
    return this;
  }

   /**
   * Total earnings before tax/deductions.
   * @return grossEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Total earnings before tax/deductions.")

  public Double getGrossEarnings() {
    return grossEarnings;
  }


  public void setGrossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
  }


  public PayStubPayPeriodDetails isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the net pay. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-null.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the net pay. Always `null` if `unofficial_currency_code` is non-null.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public PayStubPayPeriodDetails payDate(LocalDate payDate) {
    
    this.payDate = payDate;
    return this;
  }

   /**
   * The date on which the pay stub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return payDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date on which the pay stub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getPayDate() {
    return payDate;
  }


  public void setPayDate(LocalDate payDate) {
    this.payDate = payDate;
  }


  public PayStubPayPeriodDetails payFrequency(String payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * The frequency at which an individual is paid.
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The frequency at which an individual is paid.")

  public String getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(String payFrequency) {
    this.payFrequency = payFrequency;
  }


  public PayStubPayPeriodDetails startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The date on which the pay period started, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date on which the pay period started, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public PayStubPayPeriodDetails unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the net pay. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the net pay. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayStubPayPeriodDetails payStubPayPeriodDetails = (PayStubPayPeriodDetails) o;
    return Objects.equals(this.payAmount, payStubPayPeriodDetails.payAmount) &&
        Objects.equals(this.distributionBreakdown, payStubPayPeriodDetails.distributionBreakdown) &&
        Objects.equals(this.endDate, payStubPayPeriodDetails.endDate) &&
        Objects.equals(this.grossEarnings, payStubPayPeriodDetails.grossEarnings) &&
        Objects.equals(this.isoCurrencyCode, payStubPayPeriodDetails.isoCurrencyCode) &&
        Objects.equals(this.payDate, payStubPayPeriodDetails.payDate) &&
        Objects.equals(this.payFrequency, payStubPayPeriodDetails.payFrequency) &&
        Objects.equals(this.startDate, payStubPayPeriodDetails.startDate) &&
        Objects.equals(this.unofficialCurrencyCode, payStubPayPeriodDetails.unofficialCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payAmount, distributionBreakdown, endDate, grossEarnings, isoCurrencyCode, payDate, payFrequency, startDate, unofficialCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayStubPayPeriodDetails {\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    distributionBreakdown: ").append(toIndentedString(distributionBreakdown)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

