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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when the status of an income verification instance has changed. It will typically take several minutes for this webhook to fire after the end user has uploaded their documents in the Document Income flow.
 */
@ApiModel(description = "Fired when the status of an income verification instance has changed. It will typically take several minutes for this webhook to fire after the end user has uploaded their documents in the Document Income flow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T18:37:44.071415Z[Etc/UTC]")
public class IncomeVerificationStatusWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private String verificationStatus;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public IncomeVerificationStatusWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;\&quot;INCOME\&quot;&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`\"INCOME\"`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public IncomeVerificationStatusWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;INCOME_VERIFICATION&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`INCOME_VERIFICATION`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public IncomeVerificationStatusWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The Item ID associated with the verification.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The Item ID associated with the verification.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public IncomeVerificationStatusWebhook userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The Plaid &#x60;user_id&#x60; of the User associated with this webhook, warning, or error.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid `user_id` of the User associated with this webhook, warning, or error.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public IncomeVerificationStatusWebhook verificationStatus(String verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * &#x60;VERIFICATION_STATUS_PROCESSING_COMPLETE&#x60;: The income verification status processing has completed. If the user uploaded multiple documents, this webhook will fire when all documents have finished processing. Call the &#x60;/income/verification/paystubs/get&#x60; endpoint and check the document metadata to see which documents were successfully parsed.  &#x60;VERIFICATION_STATUS_PROCESSING_FAILED&#x60;: A failure occurred when attempting to process the verification documentation.  &#x60;VERIFICATION_STATUS_PENDING_APPROVAL&#x60;: (deprecated) The income verification has been sent to the user for review.
   * @return verificationStatus
  **/
  @ApiModelProperty(required = true, value = "`VERIFICATION_STATUS_PROCESSING_COMPLETE`: The income verification status processing has completed. If the user uploaded multiple documents, this webhook will fire when all documents have finished processing. Call the `/income/verification/paystubs/get` endpoint and check the document metadata to see which documents were successfully parsed.  `VERIFICATION_STATUS_PROCESSING_FAILED`: A failure occurred when attempting to process the verification documentation.  `VERIFICATION_STATUS_PENDING_APPROVAL`: (deprecated) The income verification has been sent to the user for review.")

  public String getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public IncomeVerificationStatusWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationStatusWebhook incomeVerificationStatusWebhook = (IncomeVerificationStatusWebhook) o;
    return Objects.equals(this.webhookType, incomeVerificationStatusWebhook.webhookType) &&
        Objects.equals(this.webhookCode, incomeVerificationStatusWebhook.webhookCode) &&
        Objects.equals(this.itemId, incomeVerificationStatusWebhook.itemId) &&
        Objects.equals(this.userId, incomeVerificationStatusWebhook.userId) &&
        Objects.equals(this.verificationStatus, incomeVerificationStatusWebhook.verificationStatus) &&
        Objects.equals(this.environment, incomeVerificationStatusWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, userId, verificationStatus, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationStatusWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

