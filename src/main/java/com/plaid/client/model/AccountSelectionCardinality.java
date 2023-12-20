/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.482.3
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
 * The application requires that accounts be limited to a specific cardinality. &#x60;MULTI_SELECT&#x60;: indicates that the user should be allowed to pick multiple accounts. &#x60;SINGLE_SELECT&#x60;: indicates that the user should be allowed to pick only a single account. &#x60;ALL&#x60;: indicates that the user must share all of their accounts and should not be given the opportunity to de-select
 */
@JsonAdapter(AccountSelectionCardinality.Adapter.class)
public enum AccountSelectionCardinality {
  
  SINGLE_SELECT("SINGLE_SELECT"),
  
  MULTI_SELECT("MULTI_SELECT"),
  
  ALL("ALL"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  AccountSelectionCardinality(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountSelectionCardinality fromValue(String value) {
    for (AccountSelectionCardinality b : AccountSelectionCardinality.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return AccountSelectionCardinality.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<AccountSelectionCardinality> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountSelectionCardinality enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountSelectionCardinality read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountSelectionCardinality.fromValue(value);
    }
  }
}

