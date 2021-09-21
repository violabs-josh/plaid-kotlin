/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.34.1
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * We use standard HTTP response codes for success and failure notifications, and our errors are further classified by &#x60;error_type&#x60;. In general, 200 HTTP codes correspond to success, 40X codes are for developer- or user-related failures, and 50X codes are for Plaid-related issues.  Error fields will be &#x60;null&#x60; if no error has occurred.
 */
@ApiModel(description = "We use standard HTTP response codes for success and failure notifications, and our errors are further classified by `error_type`. In general, 200 HTTP codes correspond to success, 40X codes are for developer- or user-related failures, and 50X codes are for Plaid-related issues.  Error fields will be `null` if no error has occurred.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-21T23:03:50.146Z[GMT]")
public class Error {
  /**
   * A broad categorization of the error. Safe for programatic use.
   */
  @JsonAdapter(ErrorTypeEnum.Adapter.class)
  public enum ErrorTypeEnum {
    INVALID_REQUEST("INVALID_REQUEST"),
    
    INVALID_RESULT("INVALID_RESULT"),
    
    INVALID_INPUT("INVALID_INPUT"),
    
    INSTITUTION_ERROR("INSTITUTION_ERROR"),
    
    RATE_LIMIT_EXCEEDED("RATE_LIMIT_EXCEEDED"),
    
    API_ERROR("API_ERROR"),
    
    ITEM_ERROR("ITEM_ERROR"),
    
    ASSET_REPORT_ERROR("ASSET_REPORT_ERROR"),
    
    RECAPTCHA_ERROR("RECAPTCHA_ERROR"),
    
    OAUTH_ERROR("OAUTH_ERROR"),
    
    PAYMENT_ERROR("PAYMENT_ERROR"),
    
    BANK_TRANSFER_ERROR("BANK_TRANSFER_ERROR");

    private String value;

    ErrorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorTypeEnum fromValue(String value) {
      for (ErrorTypeEnum b : ErrorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR_TYPE = "error_type";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private ErrorTypeEnum errorType;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_DISPLAY_MESSAGE = "display_message";
  @SerializedName(SERIALIZED_NAME_DISPLAY_MESSAGE)
  private String displayMessage;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_CAUSES = "causes";
  @SerializedName(SERIALIZED_NAME_CAUSES)
  private List<Object> causes = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Double status;

  public static final String SERIALIZED_NAME_DOCUMENTATION_URL = "documentation_url";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION_URL)
  private String documentationUrl;

  public static final String SERIALIZED_NAME_SUGGESTED_ACTION = "suggested_action";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_ACTION)
  private String suggestedAction;


  public Error errorType(ErrorTypeEnum errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * A broad categorization of the error. Safe for programatic use.
   * @return errorType
  **/
  @ApiModelProperty(required = true, value = "A broad categorization of the error. Safe for programatic use.")

  public ErrorTypeEnum getErrorType() {
    return errorType;
  }


  public void setErrorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
  }


  public Error errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The particular error code. Safe for programmatic use.
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "The particular error code. Safe for programmatic use.")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public Error errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * A developer-friendly representation of the error code. This may change over time and is not safe for programmatic use.
   * @return errorMessage
  **/
  @ApiModelProperty(required = true, value = "A developer-friendly representation of the error code. This may change over time and is not safe for programmatic use.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public Error displayMessage(String displayMessage) {
    
    this.displayMessage = displayMessage;
    return this;
  }

   /**
   * A user-friendly representation of the error code. &#x60;null&#x60; if the error is not related to user action.  This may change over time and is not safe for programmatic use.
   * @return displayMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A user-friendly representation of the error code. `null` if the error is not related to user action.  This may change over time and is not safe for programmatic use.")

  public String getDisplayMessage() {
    return displayMessage;
  }


  public void setDisplayMessage(String displayMessage) {
    this.displayMessage = displayMessage;
  }


  public Error requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique ID identifying the request, to be used for troubleshooting purposes. This field will be omitted in errors provided by webhooks.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique ID identifying the request, to be used for troubleshooting purposes. This field will be omitted in errors provided by webhooks.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public Error causes(List<Object> causes) {
    
    this.causes = causes;
    return this;
  }

  public Error addCausesItem(Object causesItem) {
    if (this.causes == null) {
      this.causes = new ArrayList<>();
    }
    this.causes.add(causesItem);
    return this;
  }

   /**
   * In the Assets product, a request can pertain to more than one Item. If an error is returned for such a request, &#x60;causes&#x60; will return an array of errors containing a breakdown of these errors on the individual Item level, if any can be identified.  &#x60;causes&#x60; will only be provided for the &#x60;error_type&#x60; &#x60;ASSET_REPORT_ERROR&#x60;.
   * @return causes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In the Assets product, a request can pertain to more than one Item. If an error is returned for such a request, `causes` will return an array of errors containing a breakdown of these errors on the individual Item level, if any can be identified.  `causes` will only be provided for the `error_type` `ASSET_REPORT_ERROR`.")

  public List<Object> getCauses() {
    return causes;
  }


  public void setCauses(List<Object> causes) {
    this.causes = causes;
  }


  public Error status(Double status) {
    
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code associated with the error. This will only be returned in the response body when the error information is provided via a webhook.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP status code associated with the error. This will only be returned in the response body when the error information is provided via a webhook.")

  public Double getStatus() {
    return status;
  }


  public void setStatus(Double status) {
    this.status = status;
  }


  public Error documentationUrl(String documentationUrl) {
    
    this.documentationUrl = documentationUrl;
    return this;
  }

   /**
   * The URL of a Plaid documentation page with more information about the error
   * @return documentationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of a Plaid documentation page with more information about the error")

  public String getDocumentationUrl() {
    return documentationUrl;
  }


  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }


  public Error suggestedAction(String suggestedAction) {
    
    this.suggestedAction = suggestedAction;
    return this;
  }

   /**
   * Suggested steps for resolving the error
   * @return suggestedAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suggested steps for resolving the error")

  public String getSuggestedAction() {
    return suggestedAction;
  }


  public void setSuggestedAction(String suggestedAction) {
    this.suggestedAction = suggestedAction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorType, error.errorType) &&
        Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.errorMessage, error.errorMessage) &&
        Objects.equals(this.displayMessage, error.displayMessage) &&
        Objects.equals(this.requestId, error.requestId) &&
        Objects.equals(this.causes, error.causes) &&
        Objects.equals(this.status, error.status) &&
        Objects.equals(this.documentationUrl, error.documentationUrl) &&
        Objects.equals(this.suggestedAction, error.suggestedAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, errorCode, errorMessage, displayMessage, requestId, causes, status, documentationUrl, suggestedAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    displayMessage: ").append(toIndentedString(displayMessage)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    suggestedAction: ").append(toIndentedString(suggestedAction)).append("\n");
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

