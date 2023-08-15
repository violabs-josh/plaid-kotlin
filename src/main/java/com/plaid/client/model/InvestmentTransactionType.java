/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.410.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Value is one of the following: &#x60;buy&#x60;: Buying an investment &#x60;sell&#x60;: Selling an investment &#x60;cancel&#x60;: A cancellation of a pending transaction &#x60;cash&#x60;: Activity that modifies a cash position &#x60;fee&#x60;: A fee on the account &#x60;transfer&#x60;: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer  For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).
 */
@JsonAdapter(InvestmentTransactionType.Adapter.class)
public enum InvestmentTransactionType {
  
  BUY("buy"),
  
  SELL("sell"),
  
  CANCEL("cancel"),
  
  CASH("cash"),
  
  FEE("fee"),
  
  TRANSFER("transfer"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  InvestmentTransactionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvestmentTransactionType fromValue(String value) {
    for (InvestmentTransactionType b : InvestmentTransactionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return InvestmentTransactionType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<InvestmentTransactionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvestmentTransactionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InvestmentTransactionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InvestmentTransactionType.fromValue(value);
    }
  }
}

