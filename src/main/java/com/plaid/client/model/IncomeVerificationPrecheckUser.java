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
import com.plaid.client.model.SignalAddressData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the user whose eligibility is being evaluated.
 */
@ApiModel(description = "Information about the user whose eligibility is being evaluated.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T20:46:47.240587Z[Etc/UTC]")
public class IncomeVerificationPrecheckUser {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_HOME_ADDRESS = "home_address";
  @SerializedName(SERIALIZED_NAME_HOME_ADDRESS)
  private SignalAddressData homeAddress;


  public IncomeVerificationPrecheckUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The user&#39;s first name
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's first name")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public IncomeVerificationPrecheckUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The user&#39;s last name
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's last name")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public IncomeVerificationPrecheckUser emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The user&#39;s email address
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's email address")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public IncomeVerificationPrecheckUser homeAddress(SignalAddressData homeAddress) {
    
    this.homeAddress = homeAddress;
    return this;
  }

   /**
   * Get homeAddress
   * @return homeAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignalAddressData getHomeAddress() {
    return homeAddress;
  }


  public void setHomeAddress(SignalAddressData homeAddress) {
    this.homeAddress = homeAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPrecheckUser incomeVerificationPrecheckUser = (IncomeVerificationPrecheckUser) o;
    return Objects.equals(this.firstName, incomeVerificationPrecheckUser.firstName) &&
        Objects.equals(this.lastName, incomeVerificationPrecheckUser.lastName) &&
        Objects.equals(this.emailAddress, incomeVerificationPrecheckUser.emailAddress) &&
        Objects.equals(this.homeAddress, incomeVerificationPrecheckUser.homeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, homeAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPrecheckUser {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
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

