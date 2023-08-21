/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.419.0
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
 * ProcessorSignalReturnReportRequest defines the request schema for &#x60;/processor/signal/return/report&#x60;
 */
@ApiModel(description = "ProcessorSignalReturnReportRequest defines the request schema for `/processor/signal/return/report`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class ProcessorSignalReturnReportRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_PROCESSOR_TOKEN = "processor_token";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TOKEN)
  private String processorToken;

  public static final String SERIALIZED_NAME_CLIENT_TRANSACTION_ID = "client_transaction_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_TRANSACTION_ID)
  private String clientTransactionId;

  public static final String SERIALIZED_NAME_RETURN_CODE = "return_code";
  @SerializedName(SERIALIZED_NAME_RETURN_CODE)
  private String returnCode;

  public static final String SERIALIZED_NAME_RETURNED_AT = "returned_at";
  @SerializedName(SERIALIZED_NAME_RETURNED_AT)
  private OffsetDateTime returnedAt;


  public ProcessorSignalReturnReportRequest clientId(String clientId) {
    
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


  public ProcessorSignalReturnReportRequest secret(String secret) {
    
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


  public ProcessorSignalReturnReportRequest processorToken(String processorToken) {
    
    this.processorToken = processorToken;
    return this;
  }

   /**
   * The processor token obtained from the Plaid integration partner. Processor tokens are in the format: &#x60;processor-&lt;environment&gt;-&lt;identifier&gt;&#x60;
   * @return processorToken
  **/
  @ApiModelProperty(required = true, value = "The processor token obtained from the Plaid integration partner. Processor tokens are in the format: `processor-<environment>-<identifier>`")

  public String getProcessorToken() {
    return processorToken;
  }


  public void setProcessorToken(String processorToken) {
    this.processorToken = processorToken;
  }


  public ProcessorSignalReturnReportRequest clientTransactionId(String clientTransactionId) {
    
    this.clientTransactionId = clientTransactionId;
    return this;
  }

   /**
   * Must be the same as the &#x60;client_transaction_id&#x60; supplied when calling &#x60;/processor/signal/evaluate&#x60;
   * @return clientTransactionId
  **/
  @ApiModelProperty(required = true, value = "Must be the same as the `client_transaction_id` supplied when calling `/processor/signal/evaluate`")

  public String getClientTransactionId() {
    return clientTransactionId;
  }


  public void setClientTransactionId(String clientTransactionId) {
    this.clientTransactionId = clientTransactionId;
  }


  public ProcessorSignalReturnReportRequest returnCode(String returnCode) {
    
    this.returnCode = returnCode;
    return this;
  }

   /**
   * Must be a valid ACH return code (e.g. \&quot;R01\&quot;)  If formatted incorrectly, this will result in an [&#x60;INVALID_FIELD&#x60;](/docs/errors/invalid-request/#invalid_field) error.
   * @return returnCode
  **/
  @ApiModelProperty(required = true, value = "Must be a valid ACH return code (e.g. \"R01\")  If formatted incorrectly, this will result in an [`INVALID_FIELD`](/docs/errors/invalid-request/#invalid_field) error.")

  public String getReturnCode() {
    return returnCode;
  }


  public void setReturnCode(String returnCode) {
    this.returnCode = returnCode;
  }


  public ProcessorSignalReturnReportRequest returnedAt(OffsetDateTime returnedAt) {
    
    this.returnedAt = returnedAt;
    return this;
  }

   /**
   * Date and time when you receive the returns from your payment processors, in ISO 8601 format (&#x60;YYYY-MM-DDTHH:mm:ssZ&#x60;).
   * @return returnedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time when you receive the returns from your payment processors, in ISO 8601 format (`YYYY-MM-DDTHH:mm:ssZ`).")

  public OffsetDateTime getReturnedAt() {
    return returnedAt;
  }


  public void setReturnedAt(OffsetDateTime returnedAt) {
    this.returnedAt = returnedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorSignalReturnReportRequest processorSignalReturnReportRequest = (ProcessorSignalReturnReportRequest) o;
    return Objects.equals(this.clientId, processorSignalReturnReportRequest.clientId) &&
        Objects.equals(this.secret, processorSignalReturnReportRequest.secret) &&
        Objects.equals(this.processorToken, processorSignalReturnReportRequest.processorToken) &&
        Objects.equals(this.clientTransactionId, processorSignalReturnReportRequest.clientTransactionId) &&
        Objects.equals(this.returnCode, processorSignalReturnReportRequest.returnCode) &&
        Objects.equals(this.returnedAt, processorSignalReturnReportRequest.returnedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, processorToken, clientTransactionId, returnCode, returnedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorSignalReturnReportRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    processorToken: ").append(toIndentedString(processorToken)).append("\n");
    sb.append("    clientTransactionId: ").append(toIndentedString(clientTransactionId)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    returnedAt: ").append(toIndentedString(returnedAt)).append("\n");
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
