/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.128.4
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Taxpayer ID of the individual receiving the paystub.
 */
@ApiModel(description = "Taxpayer ID of the individual receiving the paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-14T04:41:23.248820Z[Etc/UTC]")
public class TaxpayerID {
  public static final String SERIALIZED_NAME_ID_TYPE = "id_type";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private String idType;

  public static final String SERIALIZED_NAME_ID_MASK = "id_mask";
  @SerializedName(SERIALIZED_NAME_ID_MASK)
  private String idMask;

  public static final String SERIALIZED_NAME_LAST4_DIGITS = "last_4_digits";
  @SerializedName(SERIALIZED_NAME_LAST4_DIGITS)
  private String last4Digits;


  public TaxpayerID idType(String idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Type of ID, e.g. &#39;SSN&#39;
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of ID, e.g. 'SSN'")

  public String getIdType() {
    return idType;
  }


  public void setIdType(String idType) {
    this.idType = idType;
  }


  public TaxpayerID idMask(String idMask) {
    
    this.idMask = idMask;
    return this;
  }

   /**
   * ID mask; i.e. last 4 digits of the taxpayer ID
   * @return idMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID mask; i.e. last 4 digits of the taxpayer ID")

  public String getIdMask() {
    return idMask;
  }


  public void setIdMask(String idMask) {
    this.idMask = idMask;
  }


  public TaxpayerID last4Digits(String last4Digits) {
    
    this.last4Digits = last4Digits;
    return this;
  }

   /**
   * Last 4 digits of unique number of ID.
   * @return last4Digits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last 4 digits of unique number of ID.")

  public String getLast4Digits() {
    return last4Digits;
  }


  public void setLast4Digits(String last4Digits) {
    this.last4Digits = last4Digits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxpayerID taxpayerID = (TaxpayerID) o;
    return Objects.equals(this.idType, taxpayerID.idType) &&
        Objects.equals(this.idMask, taxpayerID.idMask) &&
        Objects.equals(this.last4Digits, taxpayerID.last4Digits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idType, idMask, last4Digits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxpayerID {\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idMask: ").append(toIndentedString(idMask)).append("\n");
    sb.append("    last4Digits: ").append(toIndentedString(last4Digits)).append("\n");
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

