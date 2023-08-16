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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
 */
@ApiModel(description = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class ValidationSource {
  public static final String SERIALIZED_NAME_VALIDATION_SOURCE_NAME = "ValidationSourceName";
  @SerializedName(SERIALIZED_NAME_VALIDATION_SOURCE_NAME)
  private String validationSourceName;

  public static final String SERIALIZED_NAME_VALIDATION_SOURCE_REFERENCE_IDENTIFIER = "ValidationSourceReferenceIdentifier";
  @SerializedName(SERIALIZED_NAME_VALIDATION_SOURCE_REFERENCE_IDENTIFIER)
  private String validationSourceReferenceIdentifier;


  public ValidationSource validationSourceName(String validationSourceName) {
    
    this.validationSourceName = validationSourceName;
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
   * @return validationSourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")

  public String getValidationSourceName() {
    return validationSourceName;
  }


  public void setValidationSourceName(String validationSourceName) {
    this.validationSourceName = validationSourceName;
  }


  public ValidationSource validationSourceReferenceIdentifier(String validationSourceReferenceIdentifier) {
    
    this.validationSourceReferenceIdentifier = validationSourceReferenceIdentifier;
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
   * @return validationSourceReferenceIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")

  public String getValidationSourceReferenceIdentifier() {
    return validationSourceReferenceIdentifier;
  }


  public void setValidationSourceReferenceIdentifier(String validationSourceReferenceIdentifier) {
    this.validationSourceReferenceIdentifier = validationSourceReferenceIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationSource validationSource = (ValidationSource) o;
    return Objects.equals(this.validationSourceName, validationSource.validationSourceName) &&
        Objects.equals(this.validationSourceReferenceIdentifier, validationSource.validationSourceReferenceIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validationSourceName, validationSourceReferenceIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationSource {\n");
    sb.append("    validationSourceName: ").append(toIndentedString(validationSourceName)).append("\n");
    sb.append("    validationSourceReferenceIdentifier: ").append(toIndentedString(validationSourceReferenceIdentifier)).append("\n");
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

