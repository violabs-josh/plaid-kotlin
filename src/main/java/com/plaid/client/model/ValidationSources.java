/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.197.3
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
import com.plaid.client.model.ValidationSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * No documentation available.
 */
@ApiModel(description = "No documentation available.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T18:01:37.538604Z[Etc/UTC]")
public class ValidationSources {
  public static final String SERIALIZED_NAME_V_A_L_I_D_A_T_I_O_N_S_O_U_R_C_E = "VALIDATION_SOURCE";
  @SerializedName(SERIALIZED_NAME_V_A_L_I_D_A_T_I_O_N_S_O_U_R_C_E)
  private List<ValidationSource> VALIDATION_SOURCE = new ArrayList<>();


  public ValidationSources VALIDATION_SOURCE(List<ValidationSource> VALIDATION_SOURCE) {
    
    this.VALIDATION_SOURCE = VALIDATION_SOURCE;
    return this;
  }

  public ValidationSources addVALIDATIONSOURCEItem(ValidationSource VALIDATION_SOURCEItem) {
    this.VALIDATION_SOURCE.add(VALIDATION_SOURCEItem);
    return this;
  }

   /**
   * No documentation available.
   * @return VALIDATION_SOURCE
  **/
  @ApiModelProperty(required = true, value = "No documentation available.")

  public List<ValidationSource> getVALIDATIONSOURCE() {
    return VALIDATION_SOURCE;
  }


  public void setVALIDATIONSOURCE(List<ValidationSource> VALIDATION_SOURCE) {
    this.VALIDATION_SOURCE = VALIDATION_SOURCE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationSources validationSources = (ValidationSources) o;
    return Objects.equals(this.VALIDATION_SOURCE, validationSources.VALIDATION_SOURCE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(VALIDATION_SOURCE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationSources {\n");
    sb.append("    VALIDATION_SOURCE: ").append(toIndentedString(VALIDATION_SOURCE)).append("\n");
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

