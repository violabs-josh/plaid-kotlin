/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.413.0
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
import com.plaid.client.model.DepositSwitchAddressData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The deposit switch target user
 */
@ApiModel(description = "The deposit switch target user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class DepositSwitchTargetUser {
  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private DepositSwitchAddressData address;

  public static final String SERIALIZED_NAME_TAX_PAYER_ID = "tax_payer_id";
  @SerializedName(SERIALIZED_NAME_TAX_PAYER_ID)
  private String taxPayerId;


  public DepositSwitchTargetUser givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * The given name (first name) of the user.
   * @return givenName
  **/
  @ApiModelProperty(required = true, value = "The given name (first name) of the user.")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public DepositSwitchTargetUser familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * The family name (last name) of the user.
   * @return familyName
  **/
  @ApiModelProperty(required = true, value = "The family name (last name) of the user.")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public DepositSwitchTargetUser phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * The phone number of the user. The endpoint can accept a variety of phone number formats, including E.164.
   * @return phone
  **/
  @ApiModelProperty(required = true, value = "The phone number of the user. The endpoint can accept a variety of phone number formats, including E.164.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public DepositSwitchTargetUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The email address of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public DepositSwitchTargetUser address(DepositSwitchAddressData address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DepositSwitchAddressData getAddress() {
    return address;
  }


  public void setAddress(DepositSwitchAddressData address) {
    this.address = address;
  }


  public DepositSwitchTargetUser taxPayerId(String taxPayerId) {
    
    this.taxPayerId = taxPayerId;
    return this;
  }

   /**
   * The taxpayer ID of the user, generally their SSN, EIN, or TIN.
   * @return taxPayerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The taxpayer ID of the user, generally their SSN, EIN, or TIN.")

  public String getTaxPayerId() {
    return taxPayerId;
  }


  public void setTaxPayerId(String taxPayerId) {
    this.taxPayerId = taxPayerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSwitchTargetUser depositSwitchTargetUser = (DepositSwitchTargetUser) o;
    return Objects.equals(this.givenName, depositSwitchTargetUser.givenName) &&
        Objects.equals(this.familyName, depositSwitchTargetUser.familyName) &&
        Objects.equals(this.phone, depositSwitchTargetUser.phone) &&
        Objects.equals(this.email, depositSwitchTargetUser.email) &&
        Objects.equals(this.address, depositSwitchTargetUser.address) &&
        Objects.equals(this.taxPayerId, depositSwitchTargetUser.taxPayerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName, phone, email, address, taxPayerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchTargetUser {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxPayerId: ").append(toIndentedString(taxPayerId)).append("\n");
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

