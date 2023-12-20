/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.482.3
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
import com.plaid.client.model.Counterparty;
import com.plaid.client.model.Location;
import com.plaid.client.model.PaymentChannel;
import com.plaid.client.model.PersonalFinanceCategory;
import com.plaid.client.model.Recurrence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A grouping of the Plaid produced transaction enrichment fields.
 */
@ApiModel(description = "A grouping of the Plaid produced transaction enrichment fields.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T20:46:47.240587Z[Etc/UTC]")
public class Enrichments {
  public static final String SERIALIZED_NAME_CHECK_NUMBER = "check_number";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_COUNTERPARTIES = "counterparties";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTIES)
  private List<Counterparty> counterparties = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_LEGACY_CATEGORY_ID = "legacy_category_id";
  @SerializedName(SERIALIZED_NAME_LEGACY_CATEGORY_ID)
  private String legacyCategoryId;

  public static final String SERIALIZED_NAME_LEGACY_CATEGORY = "legacy_category";
  @SerializedName(SERIALIZED_NAME_LEGACY_CATEGORY)
  private List<String> legacyCategory = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_PAYMENT_CHANNEL = "payment_channel";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CHANNEL)
  private PaymentChannel paymentChannel;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY = "personal_finance_category";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY)
  private PersonalFinanceCategory personalFinanceCategory;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_ICON_URL = "personal_finance_category_icon_url";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY_ICON_URL)
  private String personalFinanceCategoryIconUrl;

  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private Recurrence recurrence;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;


  public Enrichments checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * The check number of the transaction. This field is only populated for check transactions.
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The check number of the transaction. This field is only populated for check transactions.")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public Enrichments counterparties(List<Counterparty> counterparties) {
    
    this.counterparties = counterparties;
    return this;
  }

  public Enrichments addCounterpartiesItem(Counterparty counterpartiesItem) {
    this.counterparties.add(counterpartiesItem);
    return this;
  }

   /**
   * The counterparties present in the transaction. Counterparties, such as the merchant or the financial institution, are extracted by Plaid from the raw description.
   * @return counterparties
  **/
  @ApiModelProperty(required = true, value = "The counterparties present in the transaction. Counterparties, such as the merchant or the financial institution, are extracted by Plaid from the raw description.")

  public List<Counterparty> getCounterparties() {
    return counterparties;
  }


  public void setCounterparties(List<Counterparty> counterparties) {
    this.counterparties = counterparties;
  }


  public Enrichments entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * A unique, stable, Plaid-generated ID that maps to the primary counterparty.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique, stable, Plaid-generated ID that maps to the primary counterparty.")

  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public Enrichments legacyCategoryId(String legacyCategoryId) {
    
    this.legacyCategoryId = legacyCategoryId;
    return this;
  }

   /**
   * The ID of the legacy category to which this transaction belongs. For a full list of legacy categories, see [&#x60;/categories/get&#x60;](https://plaid.com/docs/api/products/transactions/#categoriesget).  We recommend using the &#x60;personal_finance_category&#x60; for transaction categorization to obtain the best results.
   * @return legacyCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the legacy category to which this transaction belongs. For a full list of legacy categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).  We recommend using the `personal_finance_category` for transaction categorization to obtain the best results.")

  public String getLegacyCategoryId() {
    return legacyCategoryId;
  }


  public void setLegacyCategoryId(String legacyCategoryId) {
    this.legacyCategoryId = legacyCategoryId;
  }


  public Enrichments legacyCategory(List<String> legacyCategory) {
    
    this.legacyCategory = legacyCategory;
    return this;
  }

  public Enrichments addLegacyCategoryItem(String legacyCategoryItem) {
    if (this.legacyCategory == null) {
      this.legacyCategory = new ArrayList<>();
    }
    this.legacyCategory.add(legacyCategoryItem);
    return this;
  }

   /**
   * A hierarchical array of the legacy categories to which this transaction belongs. For a full list of legacy categories, see [&#x60;/categories/get&#x60;](https://plaid.com/docs/api/products/transactions/#categoriesget).  We recommend using the &#x60;personal_finance_category&#x60; for transaction categorization to obtain the best results.
   * @return legacyCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A hierarchical array of the legacy categories to which this transaction belongs. For a full list of legacy categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).  We recommend using the `personal_finance_category` for transaction categorization to obtain the best results.")

  public List<String> getLegacyCategory() {
    return legacyCategory;
  }


  public void setLegacyCategory(List<String> legacyCategory) {
    this.legacyCategory = legacyCategory;
  }


  public Enrichments location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")

  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }


  public Enrichments logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The URL of a logo associated with this transaction, if available. The logo will always be 100×100 pixel PNG file.
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The URL of a logo associated with this transaction, if available. The logo will always be 100×100 pixel PNG file.")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public Enrichments merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The name of the primary counterparty, such as the merchant or the financial institution, as extracted by Plaid from the raw description.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the primary counterparty, such as the merchant or the financial institution, as extracted by Plaid from the raw description.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public Enrichments paymentChannel(PaymentChannel paymentChannel) {
    
    this.paymentChannel = paymentChannel;
    return this;
  }

   /**
   * Get paymentChannel
   * @return paymentChannel
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentChannel getPaymentChannel() {
    return paymentChannel;
  }


  public void setPaymentChannel(PaymentChannel paymentChannel) {
    this.paymentChannel = paymentChannel;
  }


  public Enrichments phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number associated with the primary_counterparty in E. 164 format. If there is a location match (i.e. a street address is returned in the location object), the phone number will be location specific.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The phone number associated with the primary_counterparty in E. 164 format. If there is a location match (i.e. a street address is returned in the location object), the phone number will be location specific.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public Enrichments personalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    
    this.personalFinanceCategory = personalFinanceCategory;
    return this;
  }

   /**
   * Get personalFinanceCategory
   * @return personalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PersonalFinanceCategory getPersonalFinanceCategory() {
    return personalFinanceCategory;
  }


  public void setPersonalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    this.personalFinanceCategory = personalFinanceCategory;
  }


  public Enrichments personalFinanceCategoryIconUrl(String personalFinanceCategoryIconUrl) {
    
    this.personalFinanceCategoryIconUrl = personalFinanceCategoryIconUrl;
    return this;
  }

   /**
   * The URL of an icon associated with the primary personal finance category. The icon will always be 100×100 pixel PNG file.
   * @return personalFinanceCategoryIconUrl
  **/
  @ApiModelProperty(required = true, value = "The URL of an icon associated with the primary personal finance category. The icon will always be 100×100 pixel PNG file.")

  public String getPersonalFinanceCategoryIconUrl() {
    return personalFinanceCategoryIconUrl;
  }


  public void setPersonalFinanceCategoryIconUrl(String personalFinanceCategoryIconUrl) {
    this.personalFinanceCategoryIconUrl = personalFinanceCategoryIconUrl;
  }


  public Enrichments recurrence(Recurrence recurrence) {
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Recurrence getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(Recurrence recurrence) {
    this.recurrence = recurrence;
  }


  public Enrichments website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * The website associated with this transaction.
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The website associated with this transaction.")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enrichments enrichments = (Enrichments) o;
    return Objects.equals(this.checkNumber, enrichments.checkNumber) &&
        Objects.equals(this.counterparties, enrichments.counterparties) &&
        Objects.equals(this.entityId, enrichments.entityId) &&
        Objects.equals(this.legacyCategoryId, enrichments.legacyCategoryId) &&
        Objects.equals(this.legacyCategory, enrichments.legacyCategory) &&
        Objects.equals(this.location, enrichments.location) &&
        Objects.equals(this.logoUrl, enrichments.logoUrl) &&
        Objects.equals(this.merchantName, enrichments.merchantName) &&
        Objects.equals(this.paymentChannel, enrichments.paymentChannel) &&
        Objects.equals(this.phoneNumber, enrichments.phoneNumber) &&
        Objects.equals(this.personalFinanceCategory, enrichments.personalFinanceCategory) &&
        Objects.equals(this.personalFinanceCategoryIconUrl, enrichments.personalFinanceCategoryIconUrl) &&
        Objects.equals(this.recurrence, enrichments.recurrence) &&
        Objects.equals(this.website, enrichments.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkNumber, counterparties, entityId, legacyCategoryId, legacyCategory, location, logoUrl, merchantName, paymentChannel, phoneNumber, personalFinanceCategory, personalFinanceCategoryIconUrl, recurrence, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enrichments {\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    counterparties: ").append(toIndentedString(counterparties)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    legacyCategoryId: ").append(toIndentedString(legacyCategoryId)).append("\n");
    sb.append("    legacyCategory: ").append(toIndentedString(legacyCategory)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    personalFinanceCategory: ").append(toIndentedString(personalFinanceCategory)).append("\n");
    sb.append("    personalFinanceCategoryIconUrl: ").append(toIndentedString(personalFinanceCategoryIconUrl)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

