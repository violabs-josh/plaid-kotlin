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
 * Information about an report identifier and a report name.
 */
@ApiModel(description = "Information about an report identifier and a report name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class CreditFreddieMacReportingInformationVOA24 {
  public static final String SERIALIZED_NAME_REPORT_DATE_TIME = "ReportDateTime";
  @SerializedName(SERIALIZED_NAME_REPORT_DATE_TIME)
  private String reportDateTime;

  public static final String SERIALIZED_NAME_REPORT_IDENTIFIER_TYPE = "ReportIdentifierType";
  @SerializedName(SERIALIZED_NAME_REPORT_IDENTIFIER_TYPE)
  private String reportIdentifierType;

  public static final String SERIALIZED_NAME_REPORTING_INFORMATION_IDENTIFIER = "ReportingInformationIdentifier";
  @SerializedName(SERIALIZED_NAME_REPORTING_INFORMATION_IDENTIFIER)
  private String reportingInformationIdentifier;


  public CreditFreddieMacReportingInformationVOA24 reportDateTime(String reportDateTime) {
    
    this.reportDateTime = reportDateTime;
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
   * @return reportDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")

  public String getReportDateTime() {
    return reportDateTime;
  }


  public void setReportDateTime(String reportDateTime) {
    this.reportDateTime = reportDateTime;
  }


  public CreditFreddieMacReportingInformationVOA24 reportIdentifierType(String reportIdentifierType) {
    
    this.reportIdentifierType = reportIdentifierType;
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac. The value can only be \&quot;ReportID\&quot;
   * @return reportIdentifierType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac. The value can only be \"ReportID\"")

  public String getReportIdentifierType() {
    return reportIdentifierType;
  }


  public void setReportIdentifierType(String reportIdentifierType) {
    this.reportIdentifierType = reportIdentifierType;
  }


  public CreditFreddieMacReportingInformationVOA24 reportingInformationIdentifier(String reportingInformationIdentifier) {
    
    this.reportingInformationIdentifier = reportingInformationIdentifier;
    return this;
  }

   /**
   * Documentation not found in the MISMO model viewer and not provided by Freddie Mac.
   * @return reportingInformationIdentifier
  **/
  @ApiModelProperty(required = true, value = "Documentation not found in the MISMO model viewer and not provided by Freddie Mac.")

  public String getReportingInformationIdentifier() {
    return reportingInformationIdentifier;
  }


  public void setReportingInformationIdentifier(String reportingInformationIdentifier) {
    this.reportingInformationIdentifier = reportingInformationIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacReportingInformationVOA24 creditFreddieMacReportingInformationVOA24 = (CreditFreddieMacReportingInformationVOA24) o;
    return Objects.equals(this.reportDateTime, creditFreddieMacReportingInformationVOA24.reportDateTime) &&
        Objects.equals(this.reportIdentifierType, creditFreddieMacReportingInformationVOA24.reportIdentifierType) &&
        Objects.equals(this.reportingInformationIdentifier, creditFreddieMacReportingInformationVOA24.reportingInformationIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportDateTime, reportIdentifierType, reportingInformationIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacReportingInformationVOA24 {\n");
    sb.append("    reportDateTime: ").append(toIndentedString(reportDateTime)).append("\n");
    sb.append("    reportIdentifierType: ").append(toIndentedString(reportIdentifierType)).append("\n");
    sb.append("    reportingInformationIdentifier: ").append(toIndentedString(reportingInformationIdentifier)).append("\n");
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

