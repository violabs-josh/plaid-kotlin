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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.Loans;
import com.plaid.client.model.Parties;
import com.plaid.client.model.Services;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing an Asset Report with Freddie Mac schema.
 */
@ApiModel(description = "An object representing an Asset Report with Freddie Mac schema.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class AssetReportFreddie {
  public static final String SERIALIZED_NAME_L_O_A_N_S = "LOANS";
  @SerializedName(SERIALIZED_NAME_L_O_A_N_S)
  private Loans LOANS;

  public static final String SERIALIZED_NAME_P_A_R_T_I_E_S = "PARTIES";
  @SerializedName(SERIALIZED_NAME_P_A_R_T_I_E_S)
  private Parties PARTIES;

  public static final String SERIALIZED_NAME_S_E_R_V_I_C_E_S = "SERVICES";
  @SerializedName(SERIALIZED_NAME_S_E_R_V_I_C_E_S)
  private Services SERVICES;


  public AssetReportFreddie LOANS(Loans LOANS) {
    
    this.LOANS = LOANS;
    return this;
  }

   /**
   * Get LOANS
   * @return LOANS
  **/
  @ApiModelProperty(required = true, value = "")

  public Loans getLOANS() {
    return LOANS;
  }


  public void setLOANS(Loans LOANS) {
    this.LOANS = LOANS;
  }


  public AssetReportFreddie PARTIES(Parties PARTIES) {
    
    this.PARTIES = PARTIES;
    return this;
  }

   /**
   * Get PARTIES
   * @return PARTIES
  **/
  @ApiModelProperty(required = true, value = "")

  public Parties getPARTIES() {
    return PARTIES;
  }


  public void setPARTIES(Parties PARTIES) {
    this.PARTIES = PARTIES;
  }


  public AssetReportFreddie SERVICES(Services SERVICES) {
    
    this.SERVICES = SERVICES;
    return this;
  }

   /**
   * Get SERVICES
   * @return SERVICES
  **/
  @ApiModelProperty(required = true, value = "")

  public Services getSERVICES() {
    return SERVICES;
  }


  public void setSERVICES(Services SERVICES) {
    this.SERVICES = SERVICES;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportFreddie assetReportFreddie = (AssetReportFreddie) o;
    return Objects.equals(this.LOANS, assetReportFreddie.LOANS) &&
        Objects.equals(this.PARTIES, assetReportFreddie.PARTIES) &&
        Objects.equals(this.SERVICES, assetReportFreddie.SERVICES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOANS, PARTIES, SERVICES);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportFreddie {\n");
    sb.append("    LOANS: ").append(toIndentedString(LOANS)).append("\n");
    sb.append("    PARTIES: ").append(toIndentedString(PARTIES)).append("\n");
    sb.append("    SERVICES: ").append(toIndentedString(SERVICES)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

