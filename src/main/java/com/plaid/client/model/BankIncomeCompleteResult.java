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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The result of the bank income report generation  &#x60;SUCCESS&#x60;: The bank income report was successfully generated and can be retrieved via &#x60;/credit/bank_income/get&#x60;.  &#x60;FAILURE&#x60;: The bank income report failed to be generated
 */
@JsonAdapter(BankIncomeCompleteResult.Adapter.class)
public enum BankIncomeCompleteResult {
  
  SUCCESS("SUCCESS"),
  
  FAILURE("FAILURE"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BankIncomeCompleteResult(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BankIncomeCompleteResult fromValue(String value) {
    for (BankIncomeCompleteResult b : BankIncomeCompleteResult.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BankIncomeCompleteResult.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BankIncomeCompleteResult> {
    @Override
    public void write(final JsonWriter jsonWriter, final BankIncomeCompleteResult enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BankIncomeCompleteResult read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BankIncomeCompleteResult.fromValue(value);
    }
  }
}

