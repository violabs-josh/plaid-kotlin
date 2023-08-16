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
 * Shorthand identifier for a specific screening list for individuals.  &#x60;AU_CON&#x60;: Australia Department of Foreign Affairs and Trade Consolidated List  &#x60;CA_CON&#x60;: Government of Canada Consolidated List of Sanctions  &#x60;EU_CON&#x60;: European External Action Service Consolidated List  &#x60;IZ_CIA&#x60;: CIA List of Chiefs of State and Cabinet Members  &#x60;IZ_IPL&#x60;: Interpol Red Notices for Wanted Persons List  &#x60;IZ_PEP&#x60;: Politically Exposed Persons List  &#x60;IZ_UNC&#x60;: United Nations Consolidated Sanctions  &#x60;IZ_WBK&#x60;: World Bank Listing of Ineligible Firms and Individuals  &#x60;UK_HMC&#x60;: UK HM Treasury Consolidated List  &#x60;US_DPL&#x60;: Bureau of Industry and Security Denied Persons List  &#x60;US_DTC&#x60;: US Department of State AECA Debarred  &#x60;US_FBI&#x60;: US Department of Justice FBI Wanted List  &#x60;US_FSE&#x60;: US OFAC Foreign Sanctions Evaders  &#x60;US_ISN&#x60;: US Department of State Nonproliferation Sanctions  &#x60;US_PLC&#x60;: US OFAC Palestinian Legislative Council  &#x60;US_SDN&#x60;: US OFAC Specially Designated Nationals List  &#x60;US_SSI&#x60;: US OFAC Sectoral Sanctions Identifications  &#x60;SG_SOF&#x60;: Government of Singapore Terrorists and Terrorist Entities  &#x60;TR_TWL&#x60;: Government of Turkey Terrorist Wanted List  &#x60;TR_DFD&#x60;: Government of Turkey Domestic Freezing Decisions  &#x60;TR_FOR&#x60;: Government of Turkey Foreign Freezing Requests   &#x60;TR_WMD&#x60;: Government of Turkey Weapons of Mass Destruction  &#x60;TR_CMB&#x60;: Government of Turkey Capital Markets Board
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
  
  IZ_WBK("IZ_WBK"),
  
  UK_HMC("UK_HMC"),
  
  US_DPL("US_DPL"),
  
  US_DTC("US_DTC"),
  
  US_FBI("US_FBI"),
  
  US_FSE("US_FSE"),
  
  US_ISN("US_ISN"),
  
  US_MBS("US_MBS"),
  
  US_PLC("US_PLC"),
  
  US_SDN("US_SDN"),
  
  US_SSI("US_SSI"),
  
  SG_SOF("SG_SOF"),
  
  TR_TWL("TR_TWL"),
  
  TR_DFD("TR_DFD"),
  
  TR_FOR("TR_FOR"),
  
  TR_WMD("TR_WMD"),
  
  TR_CMB("TR_CMB"),

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

