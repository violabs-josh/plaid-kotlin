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
 * Describes the frequency of the transaction stream.  &#x60;WEEKLY&#x60;: Assigned to a transaction stream that occurs approximately every week.  &#x60;BIWEEKLY&#x60;: Assigned to a transaction stream that occurs approximately every 2 weeks.  &#x60;SEMI_MONTHLY&#x60;: Assigned to a transaction stream that occurs approximately twice per month. This frequency is typically seen for inflow transaction streams.  &#x60;MONTHLY&#x60;: Assigned to a transaction stream that occurs approximately every month.  &#x60;ANNUALLY&#x60;: Assigned to a transaction stream that occurs approximately every year.  &#x60;DAILY&#x60;: Assigned to a transaction stream that occurs approximately every day.  &#x60;DYNAMIC&#x60;: Assigned to a transaction stream that varies in recurrence frequency. This frequency is typically seen for inflow streams in the gig economy.  &#x60;UNKNOWN&#x60;: Assigned to a transaction stream that isn&#39;t recurring in nature.
 */
@JsonAdapter(RecurringFrequency.Adapter.class)
public enum RecurringFrequency {
  
  UNKNOWN("UNKNOWN"),
  
  WEEKLY("WEEKLY"),
  
  BIWEEKLY("BIWEEKLY"),
  
  SEMI_MONTHLY("SEMI_MONTHLY"),
  
  MONTHLY("MONTHLY"),
  
  ANNUALLY("ANNUALLY"),
  
  DAILY("DAILY"),
  
  DYNAMIC("DYNAMIC"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RecurringFrequency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RecurringFrequency fromValue(String value) {
    for (RecurringFrequency b : RecurringFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<RecurringFrequency> {
    @Override
    public void write(final JsonWriter jsonWriter, final RecurringFrequency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RecurringFrequency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RecurringFrequency.fromValue(value);
    }
  }
}

