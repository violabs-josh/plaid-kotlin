/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.413.0
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
 * The kind of official document represented by this object.  &#x60;bik&#x60; - Russian bank code  &#x60;business_number&#x60; - A number that uniquely identifies the business within a category of businesses  &#x60;imo&#x60; - Number assigned to the entity by the International Maritime Organization  &#x60;other&#x60; - Any document not covered by other categories  &#x60;swift&#x60; - Number identifying a bank and branch.  &#x60;tax_id&#x60; - Identification issued for the purpose of collecting taxes
 */
@JsonAdapter(EntityDocumentType.Adapter.class)
public enum EntityDocumentType {
  
  BIK("bik"),
  
  BUSINESS_NUMBER("business_number"),
  
  IMO("imo"),
  
  OTHER("other"),
  
  SWIFT("swift"),
  
  TAX_ID("tax_id"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  EntityDocumentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EntityDocumentType fromValue(String value) {
    for (EntityDocumentType b : EntityDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return EntityDocumentType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<EntityDocumentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EntityDocumentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EntityDocumentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EntityDocumentType.fromValue(value);
    }
  }
}

