/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.334.0
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
import com.plaid.client.model.EarningsBreakdownCanonicalDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * An object representing the earnings line items for the pay period.
 */
@ApiModel(description = "An object representing the earnings line items for the pay period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T18:37:44.071415Z[Etc/UTC]")
public class EarningsBreakdown {
  public static final String SERIALIZED_NAME_CANONICAL_DESCRIPTION = "canonical_description";
  @SerializedName(SERIALIZED_NAME_CANONICAL_DESCRIPTION)
  private EarningsBreakdownCanonicalDescription canonicalDescription;

  public static final String SERIALIZED_NAME_CURRENT_AMOUNT = "current_amount";
  @SerializedName(SERIALIZED_NAME_CURRENT_AMOUNT)
  private Double currentAmount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Double hours;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_YTD_AMOUNT = "ytd_amount";
  @SerializedName(SERIALIZED_NAME_YTD_AMOUNT)
  private Double ytdAmount;


  public EarningsBreakdown canonicalDescription(EarningsBreakdownCanonicalDescription canonicalDescription) {
    
    this.canonicalDescription = canonicalDescription;
    return this;
  }

   /**
   * Get canonicalDescription
   * @return canonicalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EarningsBreakdownCanonicalDescription getCanonicalDescription() {
    return canonicalDescription;
  }


  public void setCanonicalDescription(EarningsBreakdownCanonicalDescription canonicalDescription) {
    this.canonicalDescription = canonicalDescription;
  }


  public EarningsBreakdown currentAmount(Double currentAmount) {
    
    this.currentAmount = currentAmount;
    return this;
  }

   /**
   * Raw amount of the earning line item.
   * @return currentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw amount of the earning line item.")

  public Double getCurrentAmount() {
    return currentAmount;
  }


  public void setCurrentAmount(Double currentAmount) {
    this.currentAmount = currentAmount;
  }


  public EarningsBreakdown description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the earning line item.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the earning line item.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EarningsBreakdown hours(Double hours) {
    
    this.hours = hours;
    return this;
  }

   /**
   * Number of hours applicable for this earning.
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of hours applicable for this earning.")

  public Double getHours() {
    return hours;
  }


  public void setHours(Double hours) {
    this.hours = hours;
  }


  public EarningsBreakdown isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the line item. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-null.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 currency code of the line item. Always `null` if `unofficial_currency_code` is non-null.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public EarningsBreakdown rate(Double rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Hourly rate applicable for this earning.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hourly rate applicable for this earning.")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    this.rate = rate;
  }


  public EarningsBreakdown unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the line item. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unofficial currency code associated with the line item. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public EarningsBreakdown ytdAmount(Double ytdAmount) {
    
    this.ytdAmount = ytdAmount;
    return this;
  }

   /**
   * The year-to-date amount of the deduction.
   * @return ytdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year-to-date amount of the deduction.")

  public Double getYtdAmount() {
    return ytdAmount;
  }


  public void setYtdAmount(Double ytdAmount) {
    this.ytdAmount = ytdAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsBreakdown earningsBreakdown = (EarningsBreakdown) o;
    return Objects.equals(this.canonicalDescription, earningsBreakdown.canonicalDescription) &&
        Objects.equals(this.currentAmount, earningsBreakdown.currentAmount) &&
        Objects.equals(this.description, earningsBreakdown.description) &&
        Objects.equals(this.hours, earningsBreakdown.hours) &&
        Objects.equals(this.isoCurrencyCode, earningsBreakdown.isoCurrencyCode) &&
        Objects.equals(this.rate, earningsBreakdown.rate) &&
        Objects.equals(this.unofficialCurrencyCode, earningsBreakdown.unofficialCurrencyCode) &&
        Objects.equals(this.ytdAmount, earningsBreakdown.ytdAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalDescription, currentAmount, description, hours, isoCurrencyCode, rate, unofficialCurrencyCode, ytdAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsBreakdown {\n");
    sb.append("    canonicalDescription: ").append(toIndentedString(canonicalDescription)).append("\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    ytdAmount: ").append(toIndentedString(ytdAmount)).append("\n");
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

