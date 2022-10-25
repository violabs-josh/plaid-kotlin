/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.197.3
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
 * Shorthand identifier for a specific screening list for individuals.
 */
@JsonAdapter(IndividualWatchlistCode.Adapter.class)
public enum IndividualWatchlistCode {
  
  AU_CON("AU_CON"),
  
  CA_CON("CA_CON"),
  
  EU_CON("EU_CON"),
  
  IZ_CIA("IZ_CIA"),
  
  IZ_IPL("IZ_IPL"),
  
  IZ_PEP("IZ_PEP"),
  
  IZ_UNC("IZ_UNC"),
  
  UK_HMC("UK_HMC"),
  
  US_DPL("US_DPL"),
  
  US_DTC("US_DTC"),
  
  US_FBI("US_FBI"),
  
  US_FSE("US_FSE"),
  
  US_ISN("US_ISN"),
  
  US_MBC("US_MBC"),
  
  US_PLC("US_PLC"),
  
  US_SDN("US_SDN"),
  
  US_SSI("US_SSI"),
  
  SG_SOF("SG_SOF"),
  
  TR_TWL("TR_TWL"),
  
  TR_DFD("TR_DFD"),
  
  TR_FOR("TR_FOR"),
  
  TR_WMD("TR_WMD"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  IndividualWatchlistCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IndividualWatchlistCode fromValue(String value) {
    for (IndividualWatchlistCode b : IndividualWatchlistCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return IndividualWatchlistCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<IndividualWatchlistCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final IndividualWatchlistCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IndividualWatchlistCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IndividualWatchlistCode.fromValue(value);
    }
  }
}

