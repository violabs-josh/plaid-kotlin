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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.TransferBalanceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the balance held with Plaid.
 */
@ApiModel(description = "Information about the balance held with Plaid.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T21:11:51.636755Z[Etc/UTC]")
public class TransferBalance {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private String available;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private String current;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TransferBalanceType type;


  public TransferBalance available(String available) {
    
    this.available = available;
    return this;
  }

   /**
   * The amount of this balance available for use (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return available
  **/
  @ApiModelProperty(required = true, value = "The amount of this balance available for use (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAvailable() {
    return available;
  }


  public void setAvailable(String available) {
    this.available = available;
  }


  public TransferBalance current(String current) {
    
    this.current = current;
    return this;
  }

   /**
   * The available balance, plus amount of pending funds that in processing (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The available balance, plus amount of pending funds that in processing (decimal string with two digits of precision e.g. \"10.00\").")

  public String getCurrent() {
    return current;
  }


  public void setCurrent(String current) {
    this.current = current;
  }


  public TransferBalance type(TransferBalanceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferBalanceType getType() {
    return type;
  }


  public void setType(TransferBalanceType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferBalance transferBalance = (TransferBalance) o;
    return Objects.equals(this.available, transferBalance.available) &&
        Objects.equals(this.current, transferBalance.current) &&
        Objects.equals(this.type, transferBalance.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, current, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferBalance {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

