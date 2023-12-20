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
 * An optional object for &#x60;/credit/bank_income/get&#x60; request options.
 */
@ApiModel(description = "An optional object for `/credit/bank_income/get` request options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-20T20:46:47.240587Z[Etc/UTC]")
public class CreditBankIncomeGetRequestOptions {
  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 1;


  public CreditBankIncomeGetRequestOptions count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * How many Bank Income Reports should be fetched. Multiple reports may be available if the report has been re-created or refreshed. If more than one report is available, the most recent reports will be returned first.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many Bank Income Reports should be fetched. Multiple reports may be available if the report has been re-created or refreshed. If more than one report is available, the most recent reports will be returned first.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankIncomeGetRequestOptions creditBankIncomeGetRequestOptions = (CreditBankIncomeGetRequestOptions) o;
    return Objects.equals(this.count, creditBankIncomeGetRequestOptions.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeGetRequestOptions {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

