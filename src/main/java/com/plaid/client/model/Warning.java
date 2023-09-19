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
import com.plaid.client.model.Cause;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * It is possible for an Asset Report to be returned with missing account owner information. In such cases, the Asset Report will contain warning data in the response, indicating why obtaining the owner information failed.
 */
@ApiModel(description = "It is possible for an Asset Report to be returned with missing account owner information. In such cases, the Asset Report will contain warning data in the response, indicating why obtaining the owner information failed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T21:11:51.636755Z[Etc/UTC]")
public class Warning {
  public static final String SERIALIZED_NAME_WARNING_TYPE = "warning_type";
  @SerializedName(SERIALIZED_NAME_WARNING_TYPE)
  private String warningType;

  /**
   * The warning code identifies a specific kind of warning. &#x60;OWNERS_UNAVAILABLE&#x60; indicates that account-owner information is not available.&#x60;INVESTMENTS_UNAVAILABLE&#x60; indicates that Investments specific information is not available. &#x60;TRANSACTIONS_UNAVAILABLE&#x60; indicates that transactions information associated with Credit and Depository accounts are unavailable.
   */
  @JsonAdapter(WarningCodeEnum.Adapter.class)
  public enum WarningCodeEnum {
    OWNERS_UNAVAILABLE("OWNERS_UNAVAILABLE"),
    
    INVESTMENTS_UNAVAILABLE("INVESTMENTS_UNAVAILABLE"),
    
    TRANSACTIONS_UNAVAILABLE("TRANSACTIONS_UNAVAILABLE");

    private String value;

    WarningCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WarningCodeEnum fromValue(String value) {
      for (WarningCodeEnum b : WarningCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WarningCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WarningCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WarningCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WarningCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WARNING_CODE = "warning_code";
  @SerializedName(SERIALIZED_NAME_WARNING_CODE)
  private WarningCodeEnum warningCode;

  public static final String SERIALIZED_NAME_CAUSE = "cause";
  @SerializedName(SERIALIZED_NAME_CAUSE)
  private Cause cause;


  public Warning warningType(String warningType) {
    
    this.warningType = warningType;
    return this;
  }

   /**
   * The warning type, which will always be &#x60;ASSET_REPORT_WARNING&#x60;
   * @return warningType
  **/
  @ApiModelProperty(required = true, value = "The warning type, which will always be `ASSET_REPORT_WARNING`")

  public String getWarningType() {
    return warningType;
  }


  public void setWarningType(String warningType) {
    this.warningType = warningType;
  }


  public Warning warningCode(WarningCodeEnum warningCode) {
    
    this.warningCode = warningCode;
    return this;
  }

   /**
   * The warning code identifies a specific kind of warning. &#x60;OWNERS_UNAVAILABLE&#x60; indicates that account-owner information is not available.&#x60;INVESTMENTS_UNAVAILABLE&#x60; indicates that Investments specific information is not available. &#x60;TRANSACTIONS_UNAVAILABLE&#x60; indicates that transactions information associated with Credit and Depository accounts are unavailable.
   * @return warningCode
  **/
  @ApiModelProperty(required = true, value = "The warning code identifies a specific kind of warning. `OWNERS_UNAVAILABLE` indicates that account-owner information is not available.`INVESTMENTS_UNAVAILABLE` indicates that Investments specific information is not available. `TRANSACTIONS_UNAVAILABLE` indicates that transactions information associated with Credit and Depository accounts are unavailable.")

  public WarningCodeEnum getWarningCode() {
    return warningCode;
  }


  public void setWarningCode(WarningCodeEnum warningCode) {
    this.warningCode = warningCode;
  }


  public Warning cause(Cause cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @ApiModelProperty(required = true, value = "")

  public Cause getCause() {
    return cause;
  }


  public void setCause(Cause cause) {
    this.cause = cause;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warning warning = (Warning) o;
    return Objects.equals(this.warningType, warning.warningType) &&
        Objects.equals(this.warningCode, warning.warningCode) &&
        Objects.equals(this.cause, warning.cause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningType, warningCode, cause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
    sb.append("    warningCode: ").append(toIndentedString(warningCode)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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

