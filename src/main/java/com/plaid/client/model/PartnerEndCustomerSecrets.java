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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The secrets for the newly created end customer in non-Production environments.
 */
@ApiModel(description = "The secrets for the newly created end customer in non-Production environments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T20:46:47.240587Z[Etc/UTC]")
public class PartnerEndCustomerSecrets {
  public static final String SERIALIZED_NAME_SANDBOX = "sandbox";
  @SerializedName(SERIALIZED_NAME_SANDBOX)
  private String sandbox;

  public static final String SERIALIZED_NAME_DEVELOPMENT = "development";
  @SerializedName(SERIALIZED_NAME_DEVELOPMENT)
  private String development;


  public PartnerEndCustomerSecrets sandbox(String sandbox) {
    
    this.sandbox = sandbox;
    return this;
  }

   /**
   * The end customer&#39;s secret key for the Sandbox environment.
   * @return sandbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end customer's secret key for the Sandbox environment.")

  public String getSandbox() {
    return sandbox;
  }


  public void setSandbox(String sandbox) {
    this.sandbox = sandbox;
  }


  public PartnerEndCustomerSecrets development(String development) {
    
    this.development = development;
    return this;
  }

   /**
   * The end customer&#39;s secret key for the Development environment.
   * @return development
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end customer's secret key for the Development environment.")

  public String getDevelopment() {
    return development;
  }


  public void setDevelopment(String development) {
    this.development = development;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerEndCustomerSecrets partnerEndCustomerSecrets = (PartnerEndCustomerSecrets) o;
    return Objects.equals(this.sandbox, partnerEndCustomerSecrets.sandbox) &&
        Objects.equals(this.development, partnerEndCustomerSecrets.development);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sandbox, development);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerEndCustomerSecrets {\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    development: ").append(toIndentedString(development)).append("\n");
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

