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
 * An instruction specifying what steps the new Identity Verification attempt should require the user to complete:   &#x60;reset&#x60; - Restart the user at the beginning of the session, regardless of whether they successfully completed part of their previous session.  &#x60;incomplete&#x60; - Start the new session at the step that the user failed in the previous session, skipping steps that have already been successfully completed.  &#x60;infer&#x60; - If the most recent Identity Verification attempt associated with the given &#x60;client_user_id&#x60; has a status of &#x60;failed&#x60; or &#x60;expired&#x60;, retry using the &#x60;incomplete&#x60; strategy. Otherwise, use the &#x60;reset&#x60; strategy.  &#x60;custom&#x60; - Start the new session with a custom configuration, specified by the value of the &#x60;steps&#x60; field  Note:  The &#x60;incomplete&#x60; strategy cannot be applied if the session&#39;s failing step is &#x60;screening&#x60; or &#x60;risk_check&#x60;.  The &#x60;infer&#x60; strategy cannot be applied if the session&#39;s status is still &#x60;active&#x60;
 */
@JsonAdapter(Strategy.Adapter.class)
public enum Strategy {
  
  RESET("reset"),
  
  INCOMPLETE("incomplete"),
  
  INFER("infer"),
  
  CUSTOM("custom"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  Strategy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Strategy fromValue(String value) {
    for (Strategy b : Strategy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return Strategy.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<Strategy> {
    @Override
    public void write(final JsonWriter jsonWriter, final Strategy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Strategy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Strategy.fromValue(value);
    }
  }
}

