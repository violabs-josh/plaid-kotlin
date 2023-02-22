/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.334.0
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
import com.plaid.client.model.EntityWatchlistScreening;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Paginated list of entity watchlist screenings
 */
@ApiModel(description = "Paginated list of entity watchlist screenings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T18:37:44.071415Z[Etc/UTC]")
public class WatchlistScreeningEntityListResponse {
  public static final String SERIALIZED_NAME_ENTITY_WATCHLIST_SCREENINGS = "entity_watchlist_screenings";
  @SerializedName(SERIALIZED_NAME_ENTITY_WATCHLIST_SCREENINGS)
  private List<EntityWatchlistScreening> entityWatchlistScreenings = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public WatchlistScreeningEntityListResponse entityWatchlistScreenings(List<EntityWatchlistScreening> entityWatchlistScreenings) {
    
    this.entityWatchlistScreenings = entityWatchlistScreenings;
    return this;
  }

  public WatchlistScreeningEntityListResponse addEntityWatchlistScreeningsItem(EntityWatchlistScreening entityWatchlistScreeningsItem) {
    this.entityWatchlistScreenings.add(entityWatchlistScreeningsItem);
    return this;
  }

   /**
   * List of entity watchlist screening
   * @return entityWatchlistScreenings
  **/
  @ApiModelProperty(required = true, value = "List of entity watchlist screening")

  public List<EntityWatchlistScreening> getEntityWatchlistScreenings() {
    return entityWatchlistScreenings;
  }


  public void setEntityWatchlistScreenings(List<EntityWatchlistScreening> entityWatchlistScreenings) {
    this.entityWatchlistScreenings = entityWatchlistScreenings;
  }


  public WatchlistScreeningEntityListResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * An identifier that determines which page of results you receive.
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJkaXJlY3Rpb24iOiJuZXh0Iiwib2Zmc2V0IjoiMTU5NDM", required = true, value = "An identifier that determines which page of results you receive.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public WatchlistScreeningEntityListResponse requestId(String requestId) {
    
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
    WatchlistScreeningEntityListResponse watchlistScreeningEntityListResponse = (WatchlistScreeningEntityListResponse) o;
    return Objects.equals(this.entityWatchlistScreenings, watchlistScreeningEntityListResponse.entityWatchlistScreenings) &&
        Objects.equals(this.nextCursor, watchlistScreeningEntityListResponse.nextCursor) &&
        Objects.equals(this.requestId, watchlistScreeningEntityListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityWatchlistScreenings, nextCursor, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningEntityListResponse {\n");
    sb.append("    entityWatchlistScreenings: ").append(toIndentedString(entityWatchlistScreenings)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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

