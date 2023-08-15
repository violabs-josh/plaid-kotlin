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
 * The status of the wallet.  &#x60;UNKNOWN&#x60;: The wallet status is unknown.  &#x60;ACTIVE&#x60;: The wallet is active and ready to send money to and receive money from.  &#x60;CLOSED&#x60;: The wallet is closed. Any transactions made to or from this wallet will error.
 */
@JsonAdapter(WalletStatus.Adapter.class)
public enum WalletStatus {
  
  UNKNOWN("UNKNOWN"),
  
  ACTIVE("ACTIVE"),
  
  CLOSED("CLOSED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  WalletStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WalletStatus fromValue(String value) {
    for (WalletStatus b : WalletStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return WalletStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<WalletStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WalletStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WalletStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WalletStatus.fromValue(value);
    }
  }
}

