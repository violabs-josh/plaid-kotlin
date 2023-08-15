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
 * Payment consent scope. Defines possible directions for payments made with the given consent.  &#x60;ME_TO_ME&#x60;: Allows moving money between accounts owned by the same user.  &#x60;EXTERNAL&#x60;: Allows initiating payments from the user&#39;s account to third parties.
 */
@JsonAdapter(PaymentInitiationConsentScope.Adapter.class)
public enum PaymentInitiationConsentScope {
  
  ME_TO_ME("ME_TO_ME"),
  
  EXTERNAL("EXTERNAL"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentInitiationConsentScope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentInitiationConsentScope fromValue(String value) {
    for (PaymentInitiationConsentScope b : PaymentInitiationConsentScope.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PaymentInitiationConsentScope.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PaymentInitiationConsentScope> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentInitiationConsentScope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentInitiationConsentScope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentInitiationConsentScope.fromValue(value);
    }
  }
}

