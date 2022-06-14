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
 * AssetReportRelayRefreshResponse defines the response schema for &#x60;/asset_report/relay/refresh&#x60;
 */
@ApiModel(description = "AssetReportRelayRefreshResponse defines the response schema for `/asset_report/relay/refresh`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-14T04:41:23.248820Z[Etc/UTC]")
public class AssetReportRelayRefreshResponse {
  public static final String SERIALIZED_NAME_ASSET_RELAY_TOKEN = "asset_relay_token";
  @SerializedName(SERIALIZED_NAME_ASSET_RELAY_TOKEN)
  private String assetRelayToken;

  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public AssetReportRelayRefreshResponse assetRelayToken(String assetRelayToken) {
    
    this.assetRelayToken = assetRelayToken;
    return this;
  }

   /**
   * Get assetRelayToken
   * @return assetRelayToken
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAssetRelayToken() {
    return assetRelayToken;
  }


  public void setAssetRelayToken(String assetRelayToken) {
    this.assetRelayToken = assetRelayToken;
  }


  public AssetReportRelayRefreshResponse assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID is case sensitive.
   * @return assetReportId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID is case sensitive.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  public AssetReportRelayRefreshResponse requestId(String requestId) {
    
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
    AssetReportRelayRefreshResponse assetReportRelayRefreshResponse = (AssetReportRelayRefreshResponse) o;
    return Objects.equals(this.assetRelayToken, assetReportRelayRefreshResponse.assetRelayToken) &&
        Objects.equals(this.assetReportId, assetReportRelayRefreshResponse.assetReportId) &&
        Objects.equals(this.requestId, assetReportRelayRefreshResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetRelayToken, assetReportId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportRelayRefreshResponse {\n");
    sb.append("    assetRelayToken: ").append(toIndentedString(assetRelayToken)).append("\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
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

