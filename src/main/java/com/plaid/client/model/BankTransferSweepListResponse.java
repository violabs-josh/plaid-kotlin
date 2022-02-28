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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.BankTransferSweep;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BankTransferSweepListResponse defines the response schema for &#x60;/bank_transfer/sweep/list&#x60;
 */
@ApiModel(description = "BankTransferSweepListResponse defines the response schema for `/bank_transfer/sweep/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T21:01:48.207Z[GMT]")
public class BankTransferSweepListResponse {
  public static final String SERIALIZED_NAME_SWEEPS = "sweeps";
  @SerializedName(SERIALIZED_NAME_SWEEPS)
  private List<BankTransferSweep> sweeps = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public BankTransferSweepListResponse sweeps(List<BankTransferSweep> sweeps) {
    
    this.sweeps = sweeps;
    return this;
  }

  public BankTransferSweepListResponse addSweepsItem(BankTransferSweep sweepsItem) {
    this.sweeps.add(sweepsItem);
    return this;
  }

   /**
   * Get sweeps
   * @return sweeps
  **/
  @ApiModelProperty(required = true, value = "")

  public List<BankTransferSweep> getSweeps() {
    return sweeps;
  }


  public void setSweeps(List<BankTransferSweep> sweeps) {
    this.sweeps = sweeps;
  }


  public BankTransferSweepListResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferSweepListResponse bankTransferSweepListResponse = (BankTransferSweepListResponse) o;
    return Objects.equals(this.sweeps, bankTransferSweepListResponse.sweeps) &&
        Objects.equals(this.requestId, bankTransferSweepListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sweeps, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferSweepListResponse {\n");
    sb.append("    sweeps: ").append(toIndentedString(sweeps)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

