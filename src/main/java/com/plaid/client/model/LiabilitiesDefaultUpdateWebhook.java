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
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The webhook of type &#x60;LIABILITIES&#x60; and code &#x60;DEFAULT_UPDATE&#x60; will be fired when new or updated liabilities have been detected on a liabilities item.
 */
@ApiModel(description = "The webhook of type `LIABILITIES` and code `DEFAULT_UPDATE` will be fired when new or updated liabilities have been detected on a liabilities item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T18:37:44.071415Z[Etc/UTC]")
public class LiabilitiesDefaultUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS_WITH_NEW_LIABILITIES = "account_ids_with_new_liabilities";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS_WITH_NEW_LIABILITIES)
  private List<String> accountIdsWithNewLiabilities = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_IDS_WITH_UPDATED_LIABILITIES = "account_ids_with_updated_liabilities";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS_WITH_UPDATED_LIABILITIES)
  private Map<String, List<String>> accountIdsWithUpdatedLiabilities = new HashMap<>();

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public LiabilitiesDefaultUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;LIABILITIES&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`LIABILITIES`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public LiabilitiesDefaultUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;DEFAULT_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`DEFAULT_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public LiabilitiesDefaultUpdateWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public LiabilitiesDefaultUpdateWebhook error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public LiabilitiesDefaultUpdateWebhook accountIdsWithNewLiabilities(List<String> accountIdsWithNewLiabilities) {
    
    this.accountIdsWithNewLiabilities = accountIdsWithNewLiabilities;
    return this;
  }

  public LiabilitiesDefaultUpdateWebhook addAccountIdsWithNewLiabilitiesItem(String accountIdsWithNewLiabilitiesItem) {
    this.accountIdsWithNewLiabilities.add(accountIdsWithNewLiabilitiesItem);
    return this;
  }

   /**
   * An array of &#x60;account_id&#x60;&#39;s for accounts that contain new liabilities.&#39;
   * @return accountIdsWithNewLiabilities
  **/
  @ApiModelProperty(required = true, value = "An array of `account_id`'s for accounts that contain new liabilities.'")

  public List<String> getAccountIdsWithNewLiabilities() {
    return accountIdsWithNewLiabilities;
  }


  public void setAccountIdsWithNewLiabilities(List<String> accountIdsWithNewLiabilities) {
    this.accountIdsWithNewLiabilities = accountIdsWithNewLiabilities;
  }


  public LiabilitiesDefaultUpdateWebhook accountIdsWithUpdatedLiabilities(Map<String, List<String>> accountIdsWithUpdatedLiabilities) {
    
    this.accountIdsWithUpdatedLiabilities = accountIdsWithUpdatedLiabilities;
    return this;
  }

  public LiabilitiesDefaultUpdateWebhook putAccountIdsWithUpdatedLiabilitiesItem(String key, List<String> accountIdsWithUpdatedLiabilitiesItem) {
    this.accountIdsWithUpdatedLiabilities.put(key, accountIdsWithUpdatedLiabilitiesItem);
    return this;
  }

   /**
   * An object with keys of &#x60;account_id&#x60;&#39;s that are mapped to their respective liabilities fields that changed.  Example: &#x60;{ \&quot;XMBvvyMGQ1UoLbKByoMqH3nXMj84ALSdE5B58\&quot;: [\&quot;past_amount_due\&quot;] }&#x60; 
   * @return accountIdsWithUpdatedLiabilities
  **/
  @ApiModelProperty(required = true, value = "An object with keys of `account_id`'s that are mapped to their respective liabilities fields that changed.  Example: `{ \"XMBvvyMGQ1UoLbKByoMqH3nXMj84ALSdE5B58\": [\"past_amount_due\"] }` ")

  public Map<String, List<String>> getAccountIdsWithUpdatedLiabilities() {
    return accountIdsWithUpdatedLiabilities;
  }


  public void setAccountIdsWithUpdatedLiabilities(Map<String, List<String>> accountIdsWithUpdatedLiabilities) {
    this.accountIdsWithUpdatedLiabilities = accountIdsWithUpdatedLiabilities;
  }


  public LiabilitiesDefaultUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
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
    LiabilitiesDefaultUpdateWebhook liabilitiesDefaultUpdateWebhook = (LiabilitiesDefaultUpdateWebhook) o;
    return Objects.equals(this.webhookType, liabilitiesDefaultUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, liabilitiesDefaultUpdateWebhook.webhookCode) &&
        Objects.equals(this.itemId, liabilitiesDefaultUpdateWebhook.itemId) &&
        Objects.equals(this.error, liabilitiesDefaultUpdateWebhook.error) &&
        Objects.equals(this.accountIdsWithNewLiabilities, liabilitiesDefaultUpdateWebhook.accountIdsWithNewLiabilities) &&
        Objects.equals(this.accountIdsWithUpdatedLiabilities, liabilitiesDefaultUpdateWebhook.accountIdsWithUpdatedLiabilities) &&
        Objects.equals(this.environment, liabilitiesDefaultUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, error, accountIdsWithNewLiabilities, accountIdsWithUpdatedLiabilities, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiabilitiesDefaultUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    accountIdsWithNewLiabilities: ").append(toIndentedString(accountIdsWithNewLiabilities)).append("\n");
    sb.append("    accountIdsWithUpdatedLiabilities: ").append(toIndentedString(accountIdsWithUpdatedLiabilities)).append("\n");
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

