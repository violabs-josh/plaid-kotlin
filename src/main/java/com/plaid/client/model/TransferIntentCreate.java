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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.TransferIntentCreateMode;
import com.plaid.client.model.TransferIntentCreateNetwork;
import com.plaid.client.model.TransferIntentStatus;
import com.plaid.client.model.TransferUserInResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a transfer intent within Transfer UI.
 */
@ApiModel(description = "Represents a transfer intent within Transfer UI.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T21:11:51.636755Z[Etc/UTC]")
public class TransferIntentCreate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransferIntentStatus status;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private TransferIntentCreateMode mode;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private TransferIntentCreateNetwork network = TransferIntentCreateNetwork.SAME_DAY_ACH;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TransferUserInResponse user;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_REQUIRE_GUARANTEE = "require_guarantee";
  @SerializedName(SERIALIZED_NAME_REQUIRE_GUARANTEE)
  private Boolean requireGuarantee;


  public TransferIntentCreate id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the transfer intent object.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for the transfer intent object.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferIntentCreate created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime the transfer was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime the transfer was created. This will be of the form `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferIntentCreate status(TransferIntentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferIntentStatus getStatus() {
    return status;
  }


  public void setStatus(TransferIntentStatus status) {
    this.status = status;
  }


  public TransferIntentCreate accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; corresponding to the end-user account that will be debited or credited. Returned only if &#x60;account_id&#x60; was set on intent creation.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid `account_id` corresponding to the end-user account that will be debited or credited. Returned only if `account_id` was set on intent creation.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferIntentCreate originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the origination account for the intent. If not provided, the default account will be used.
   * @return originationAccountId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for the origination account for the intent. If not provided, the default account will be used.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public TransferIntentCreate fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * The id of the funding account to use, available in the Plaid Dashboard. This determines which of your business checking accounts will be credited or debited.
   * @return fundingAccountId
  **/
  @ApiModelProperty(required = true, value = "The id of the funding account to use, available in the Plaid Dashboard. This determines which of your business checking accounts will be credited or debited.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
  }


  public TransferIntentCreate amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferIntentCreate mode(TransferIntentCreateMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferIntentCreateMode getMode() {
    return mode;
  }


  public void setMode(TransferIntentCreateMode mode) {
    this.mode = mode;
  }


  public TransferIntentCreate network(TransferIntentCreateNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferIntentCreateNetwork getNetwork() {
    return network;
  }


  public void setNetwork(TransferIntentCreateNetwork network) {
    this.network = network;
  }


  public TransferIntentCreate achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ACHClass getAchClass() {
    return achClass;
  }


  public void setAchClass(ACHClass achClass) {
    this.achClass = achClass;
  }


  public TransferIntentCreate user(TransferUserInResponse user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferUserInResponse getUser() {
    return user;
  }


  public void setUser(TransferUserInResponse user) {
    this.user = user;
  }


  public TransferIntentCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the underlying transfer. Maximum of 8 characters.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description for the underlying transfer. Maximum of 8 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransferIntentCreate metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public TransferIntentCreate putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: The JSON values must be Strings (no nested JSON objects allowed) Only ASCII characters may be used Maximum of 50 key/value pairs Maximum key length of 40 characters Maximum value length of 500 characters 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: The JSON values must be Strings (no nested JSON objects allowed) Only ASCII characters may be used Maximum of 50 key/value pairs Maximum key length of 40 characters Maximum value length of 500 characters ")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public TransferIntentCreate isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the transfer amount, e.g. \&quot;USD\&quot;
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the transfer amount, e.g. \"USD\"")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public TransferIntentCreate requireGuarantee(Boolean requireGuarantee) {
    
    this.requireGuarantee = requireGuarantee;
    return this;
  }

   /**
   * When &#x60;true&#x60;, the transfer requires a &#x60;GUARANTEED&#x60; decision by Plaid to proceed (Guarantee customers only).
   * @return requireGuarantee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, the transfer requires a `GUARANTEED` decision by Plaid to proceed (Guarantee customers only).")

  public Boolean getRequireGuarantee() {
    return requireGuarantee;
  }


  public void setRequireGuarantee(Boolean requireGuarantee) {
    this.requireGuarantee = requireGuarantee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferIntentCreate transferIntentCreate = (TransferIntentCreate) o;
    return Objects.equals(this.id, transferIntentCreate.id) &&
        Objects.equals(this.created, transferIntentCreate.created) &&
        Objects.equals(this.status, transferIntentCreate.status) &&
        Objects.equals(this.accountId, transferIntentCreate.accountId) &&
        Objects.equals(this.originationAccountId, transferIntentCreate.originationAccountId) &&
        Objects.equals(this.fundingAccountId, transferIntentCreate.fundingAccountId) &&
        Objects.equals(this.amount, transferIntentCreate.amount) &&
        Objects.equals(this.mode, transferIntentCreate.mode) &&
        Objects.equals(this.network, transferIntentCreate.network) &&
        Objects.equals(this.achClass, transferIntentCreate.achClass) &&
        Objects.equals(this.user, transferIntentCreate.user) &&
        Objects.equals(this.description, transferIntentCreate.description) &&
        Objects.equals(this.metadata, transferIntentCreate.metadata) &&
        Objects.equals(this.isoCurrencyCode, transferIntentCreate.isoCurrencyCode) &&
        Objects.equals(this.requireGuarantee, transferIntentCreate.requireGuarantee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, status, accountId, originationAccountId, fundingAccountId, amount, mode, network, achClass, user, description, metadata, isoCurrencyCode, requireGuarantee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferIntentCreate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    requireGuarantee: ").append(toIndentedString(requireGuarantee)).append("\n");
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

