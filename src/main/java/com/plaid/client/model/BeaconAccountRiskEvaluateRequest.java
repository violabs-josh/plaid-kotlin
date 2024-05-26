/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
import com.plaid.client.model.BeaconAccountRiskEvaluateEvaluationReason;
import com.plaid.client.model.BeaconAccountRiskEvaluateRequestOptions;
import com.plaid.client.model.SignalDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BeaconAccountRiskEvaluateRequest defines the request schema for &#x60;/v1/beacon/account_risk/risk/evaluate&#x60;
 */
@ApiModel(description = "BeaconAccountRiskEvaluateRequest defines the request schema for `/v1/beacon/account_risk/risk/evaluate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class BeaconAccountRiskEvaluateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private BeaconAccountRiskEvaluateRequestOptions options;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_CLIENT_EVALUATION_ID = "client_evaluation_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_EVALUATION_ID)
  private String clientEvaluationId;

  public static final String SERIALIZED_NAME_EVALUATION_REASON = "evaluation_reason";
  @SerializedName(SERIALIZED_NAME_EVALUATION_REASON)
  private BeaconAccountRiskEvaluateEvaluationReason evaluationReason;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private SignalDevice device;

  public static final String SERIALIZED_NAME_EVALUATE_TIME = "evaluate_time";
  @SerializedName(SERIALIZED_NAME_EVALUATE_TIME)
  private String evaluateTime;


  public BeaconAccountRiskEvaluateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public BeaconAccountRiskEvaluateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public BeaconAccountRiskEvaluateRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token associated with the Item data is being requested for.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access token associated with the Item data is being requested for.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public BeaconAccountRiskEvaluateRequest options(BeaconAccountRiskEvaluateRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BeaconAccountRiskEvaluateRequestOptions getOptions() {
    return options;
  }


  public void setOptions(BeaconAccountRiskEvaluateRequestOptions options) {
    this.options = options;
  }


  public BeaconAccountRiskEvaluateRequest clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID that identifies the end user in your system. This ID is used to correlate requests by a user with multiple evaluations and/or multiple linked accounts. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.
   * @return clientUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID that identifies the end user in your system. This ID is used to correlate requests by a user with multiple evaluations and/or multiple linked accounts. Personally identifiable information, such as an email address or phone number, should not be used in the client_user_id.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public BeaconAccountRiskEvaluateRequest clientEvaluationId(String clientEvaluationId) {
    
    this.clientEvaluationId = clientEvaluationId;
    return this;
  }

   /**
   * Unique identifier of what you are looking to evaluate (account add, information change, etc.) to allow us to tie the activity to the decisions and possible fraud outcome sent via our feedback endpoints. You can use your internal request ID or similar.
   * @return clientEvaluationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of what you are looking to evaluate (account add, information change, etc.) to allow us to tie the activity to the decisions and possible fraud outcome sent via our feedback endpoints. You can use your internal request ID or similar.")

  public String getClientEvaluationId() {
    return clientEvaluationId;
  }


  public void setClientEvaluationId(String clientEvaluationId) {
    this.clientEvaluationId = clientEvaluationId;
  }


  public BeaconAccountRiskEvaluateRequest evaluationReason(BeaconAccountRiskEvaluateEvaluationReason evaluationReason) {
    
    this.evaluationReason = evaluationReason;
    return this;
  }

   /**
   * Get evaluationReason
   * @return evaluationReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BeaconAccountRiskEvaluateEvaluationReason getEvaluationReason() {
    return evaluationReason;
  }


  public void setEvaluationReason(BeaconAccountRiskEvaluateEvaluationReason evaluationReason) {
    this.evaluationReason = evaluationReason;
  }


  public BeaconAccountRiskEvaluateRequest device(SignalDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignalDevice getDevice() {
    return device;
  }


  public void setDevice(SignalDevice device) {
    this.device = device;
  }


  public BeaconAccountRiskEvaluateRequest evaluateTime(String evaluateTime) {
    
    this.evaluateTime = evaluateTime;
    return this;
  }

   /**
   * The time the event for evaluation has occurred. Populate this field for backfilling data. If you don’t populate this field, we’ll use the timestamp at the time of receipt. Use ISO 8601 format (YYYY-MM-DDTHH:mm:ssZ).
   * @return evaluateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the event for evaluation has occurred. Populate this field for backfilling data. If you don’t populate this field, we’ll use the timestamp at the time of receipt. Use ISO 8601 format (YYYY-MM-DDTHH:mm:ssZ).")

  public String getEvaluateTime() {
    return evaluateTime;
  }


  public void setEvaluateTime(String evaluateTime) {
    this.evaluateTime = evaluateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconAccountRiskEvaluateRequest beaconAccountRiskEvaluateRequest = (BeaconAccountRiskEvaluateRequest) o;
    return Objects.equals(this.clientId, beaconAccountRiskEvaluateRequest.clientId) &&
        Objects.equals(this.secret, beaconAccountRiskEvaluateRequest.secret) &&
        Objects.equals(this.accessToken, beaconAccountRiskEvaluateRequest.accessToken) &&
        Objects.equals(this.options, beaconAccountRiskEvaluateRequest.options) &&
        Objects.equals(this.clientUserId, beaconAccountRiskEvaluateRequest.clientUserId) &&
        Objects.equals(this.clientEvaluationId, beaconAccountRiskEvaluateRequest.clientEvaluationId) &&
        Objects.equals(this.evaluationReason, beaconAccountRiskEvaluateRequest.evaluationReason) &&
        Objects.equals(this.device, beaconAccountRiskEvaluateRequest.device) &&
        Objects.equals(this.evaluateTime, beaconAccountRiskEvaluateRequest.evaluateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accessToken, options, clientUserId, clientEvaluationId, evaluationReason, device, evaluateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconAccountRiskEvaluateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    clientEvaluationId: ").append(toIndentedString(clientEvaluationId)).append("\n");
    sb.append("    evaluationReason: ").append(toIndentedString(evaluationReason)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    evaluateTime: ").append(toIndentedString(evaluateTime)).append("\n");
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
