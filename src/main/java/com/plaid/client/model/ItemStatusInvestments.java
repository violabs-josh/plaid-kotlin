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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Information about the last successful and failed investments update for the Item.
 */
@ApiModel(description = "Information about the last successful and failed investments update for the Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T18:01:37.538604Z[Etc/UTC]")
public class ItemStatusInvestments {
  public static final String SERIALIZED_NAME_LAST_SUCCESSFUL_UPDATE = "last_successful_update";
  @SerializedName(SERIALIZED_NAME_LAST_SUCCESSFUL_UPDATE)
  private OffsetDateTime lastSuccessfulUpdate;

  public static final String SERIALIZED_NAME_LAST_FAILED_UPDATE = "last_failed_update";
  @SerializedName(SERIALIZED_NAME_LAST_FAILED_UPDATE)
  private OffsetDateTime lastFailedUpdate;


  public ItemStatusInvestments lastSuccessfulUpdate(OffsetDateTime lastSuccessfulUpdate) {
    
    this.lastSuccessfulUpdate = lastSuccessfulUpdate;
    return this;
  }

   /**
   * [ISO 8601](https://wikipedia.org/wiki/ISO_8601) timestamp of the last successful investments update for the Item. The status will update each time Plaid successfully connects with the institution, regardless of whether any new data is available in the update.
   * @return lastSuccessfulUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[ISO 8601](https://wikipedia.org/wiki/ISO_8601) timestamp of the last successful investments update for the Item. The status will update each time Plaid successfully connects with the institution, regardless of whether any new data is available in the update.")

  public OffsetDateTime getLastSuccessfulUpdate() {
    return lastSuccessfulUpdate;
  }


  public void setLastSuccessfulUpdate(OffsetDateTime lastSuccessfulUpdate) {
    this.lastSuccessfulUpdate = lastSuccessfulUpdate;
  }


  public ItemStatusInvestments lastFailedUpdate(OffsetDateTime lastFailedUpdate) {
    
    this.lastFailedUpdate = lastFailedUpdate;
    return this;
  }

   /**
   * [ISO 8601](https://wikipedia.org/wiki/ISO_8601) timestamp of the last failed investments update for the Item. The status will update each time Plaid fails an attempt to connect with the institution, regardless of whether any new data is available in the update.
   * @return lastFailedUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[ISO 8601](https://wikipedia.org/wiki/ISO_8601) timestamp of the last failed investments update for the Item. The status will update each time Plaid fails an attempt to connect with the institution, regardless of whether any new data is available in the update.")

  public OffsetDateTime getLastFailedUpdate() {
    return lastFailedUpdate;
  }


  public void setLastFailedUpdate(OffsetDateTime lastFailedUpdate) {
    this.lastFailedUpdate = lastFailedUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemStatusInvestments itemStatusInvestments = (ItemStatusInvestments) o;
    return Objects.equals(this.lastSuccessfulUpdate, itemStatusInvestments.lastSuccessfulUpdate) &&
        Objects.equals(this.lastFailedUpdate, itemStatusInvestments.lastFailedUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSuccessfulUpdate, lastFailedUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemStatusInvestments {\n");
    sb.append("    lastSuccessfulUpdate: ").append(toIndentedString(lastSuccessfulUpdate)).append("\n");
    sb.append("    lastFailedUpdate: ").append(toIndentedString(lastFailedUpdate)).append("\n");
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

