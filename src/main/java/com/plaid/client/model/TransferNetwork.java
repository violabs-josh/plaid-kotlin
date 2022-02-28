/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.77.1
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
 * The network or rails used for the transfer. Valid options are &#x60;ach&#x60; or &#x60;same-day-ach&#x60;.
 */
@JsonAdapter(TransferNetwork.Adapter.class)
public enum TransferNetwork {
  
  ACH("ach"),
  
  SAME_DAY_ACH("same-day-ach"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferNetwork(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferNetwork fromValue(String value) {
    for (TransferNetwork b : TransferNetwork.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferNetwork.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferNetwork> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferNetwork enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferNetwork read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferNetwork.fromValue(value);
    }
  }
}

