/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.431.7
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A client-provided transaction for Plaid to enhance.
 */
@ApiModel(description = "A client-provided transaction for Plaid to enhance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T21:11:51.636755Z[Etc/UTC]")
public class ClientProvidedRawTransaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;


  public ClientProvidedRawTransaction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique ID for the transaction used to help you tie data back to your systems.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "A unique ID for the transaction used to help you tie data back to your systems.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ClientProvidedRawTransaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The raw description of the transaction.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The raw description of the transaction.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ClientProvidedRawTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The value of the transaction with direction. (NOTE: this will affect enrichment results, so directions are important):.   Negative (-) for credits (e.g., incoming transfers, refunds)   Positive (+) for debits (e.g., purchases, fees, outgoing transfers)
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The value of the transaction with direction. (NOTE: this will affect enrichment results, so directions are important):.   Negative (-) for credits (e.g., incoming transfers, refunds)   Positive (+) for debits (e.g., purchases, fees, outgoing transfers)")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public ClientProvidedRawTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction e.g. USD.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction e.g. USD.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientProvidedRawTransaction clientProvidedRawTransaction = (ClientProvidedRawTransaction) o;
    return Objects.equals(this.id, clientProvidedRawTransaction.id) &&
        Objects.equals(this.description, clientProvidedRawTransaction.description) &&
        Objects.equals(this.amount, clientProvidedRawTransaction.amount) &&
        Objects.equals(this.isoCurrencyCode, clientProvidedRawTransaction.isoCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, amount, isoCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientProvidedRawTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
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

