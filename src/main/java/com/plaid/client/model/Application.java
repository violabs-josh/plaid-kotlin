/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.410.1
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
import java.time.LocalDate;

/**
 * Metadata about the application
 */
@ApiModel(description = "Metadata about the application")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T23:18:44.559547Z[Etc/UTC]")
public class Application {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_JOIN_DATE = "join_date";
  @SerializedName(SERIALIZED_NAME_JOIN_DATE)
  private LocalDate joinDate;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_APPLICATION_URL = "application_url";
  @SerializedName(SERIALIZED_NAME_APPLICATION_URL)
  private String applicationUrl;

  public static final String SERIALIZED_NAME_REASON_FOR_ACCESS = "reason_for_access";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_ACCESS)
  private String reasonForAccess;

  public static final String SERIALIZED_NAME_USE_CASE = "use_case";
  @SerializedName(SERIALIZED_NAME_USE_CASE)
  private String useCase;

  public static final String SERIALIZED_NAME_COMPANY_LEGAL_NAME = "company_legal_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_LEGAL_NAME)
  private String companyLegalName;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;


  public Application applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "This field will map to the application ID that is returned from /item/applications/list, or provided to the institution in an oauth redirect.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public Application name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the application
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the application")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Application displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A human-readable name of the application for display purposes
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A human-readable name of the application for display purposes")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Application joinDate(LocalDate joinDate) {
    
    this.joinDate = joinDate;
    return this;
  }

   /**
   * The date this application was granted production access at Plaid in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.
   * @return joinDate
  **/
  @ApiModelProperty(required = true, value = "The date this application was granted production access at Plaid in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format in UTC.")

  public LocalDate getJoinDate() {
    return joinDate;
  }


  public void setJoinDate(LocalDate joinDate) {
    this.joinDate = joinDate;
  }


  public Application logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * A URL that links to the application logo image.
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A URL that links to the application logo image.")

  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public Application applicationUrl(String applicationUrl) {
    
    this.applicationUrl = applicationUrl;
    return this;
  }

   /**
   * The URL for the application&#39;s website
   * @return applicationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The URL for the application's website")

  public String getApplicationUrl() {
    return applicationUrl;
  }


  public void setApplicationUrl(String applicationUrl) {
    this.applicationUrl = applicationUrl;
  }


  public Application reasonForAccess(String reasonForAccess) {
    
    this.reasonForAccess = reasonForAccess;
    return this;
  }

   /**
   * A string provided by the connected app stating why they use their respective enabled products.
   * @return reasonForAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string provided by the connected app stating why they use their respective enabled products.")

  public String getReasonForAccess() {
    return reasonForAccess;
  }


  public void setReasonForAccess(String reasonForAccess) {
    this.reasonForAccess = reasonForAccess;
  }


  public Application useCase(String useCase) {
    
    this.useCase = useCase;
    return this;
  }

   /**
   * A string representing client’s broad use case as assessed by Plaid.
   * @return useCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string representing client’s broad use case as assessed by Plaid.")

  public String getUseCase() {
    return useCase;
  }


  public void setUseCase(String useCase) {
    this.useCase = useCase;
  }


  public Application companyLegalName(String companyLegalName) {
    
    this.companyLegalName = companyLegalName;
    return this;
  }

   /**
   * A string representing the name of client’s legal entity.
   * @return companyLegalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string representing the name of client’s legal entity.")

  public String getCompanyLegalName() {
    return companyLegalName;
  }


  public void setCompanyLegalName(String companyLegalName) {
    this.companyLegalName = companyLegalName;
  }


  public Application city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * A string representing the city of the client’s headquarters.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string representing the city of the client’s headquarters.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Application region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * A string representing the region of the client’s headquarters.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string representing the region of the client’s headquarters.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public Application postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * A string representing the postal code of the client’s headquarters.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string representing the postal code of the client’s headquarters.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Application countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * A string representing the country code of the client’s headquarters.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A string representing the country code of the client’s headquarters.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.applicationId, application.applicationId) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.displayName, application.displayName) &&
        Objects.equals(this.joinDate, application.joinDate) &&
        Objects.equals(this.logoUrl, application.logoUrl) &&
        Objects.equals(this.applicationUrl, application.applicationUrl) &&
        Objects.equals(this.reasonForAccess, application.reasonForAccess) &&
        Objects.equals(this.useCase, application.useCase) &&
        Objects.equals(this.companyLegalName, application.companyLegalName) &&
        Objects.equals(this.city, application.city) &&
        Objects.equals(this.region, application.region) &&
        Objects.equals(this.postalCode, application.postalCode) &&
        Objects.equals(this.countryCode, application.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, name, displayName, joinDate, logoUrl, applicationUrl, reasonForAccess, useCase, companyLegalName, city, region, postalCode, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    applicationUrl: ").append(toIndentedString(applicationUrl)).append("\n");
    sb.append("    reasonForAccess: ").append(toIndentedString(reasonForAccess)).append("\n");
    sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
    sb.append("    companyLegalName: ").append(toIndentedString(companyLegalName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

