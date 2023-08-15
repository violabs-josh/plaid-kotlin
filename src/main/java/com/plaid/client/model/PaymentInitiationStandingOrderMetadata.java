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
import com.plaid.client.model.PaymentScheduleInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata specifically related to valid Payment Initiation standing order configurations for the institution.
 */
@ApiModel(description = "Metadata specifically related to valid Payment Initiation standing order configurations for the institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T23:18:44.559547Z[Etc/UTC]")
public class PaymentInitiationStandingOrderMetadata {
  public static final String SERIALIZED_NAME_SUPPORTS_STANDING_ORDER_END_DATE = "supports_standing_order_end_date";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_STANDING_ORDER_END_DATE)
  private Boolean supportsStandingOrderEndDate;

  public static final String SERIALIZED_NAME_SUPPORTS_STANDING_ORDER_NEGATIVE_EXECUTION_DAYS = "supports_standing_order_negative_execution_days";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_STANDING_ORDER_NEGATIVE_EXECUTION_DAYS)
  private Boolean supportsStandingOrderNegativeExecutionDays;

  public static final String SERIALIZED_NAME_VALID_STANDING_ORDER_INTERVALS = "valid_standing_order_intervals";
  @SerializedName(SERIALIZED_NAME_VALID_STANDING_ORDER_INTERVALS)
  private List<PaymentScheduleInterval> validStandingOrderIntervals = new ArrayList<>();


  public PaymentInitiationStandingOrderMetadata supportsStandingOrderEndDate(Boolean supportsStandingOrderEndDate) {
    
    this.supportsStandingOrderEndDate = supportsStandingOrderEndDate;
    return this;
  }

   /**
   * Indicates whether the institution supports closed-ended standing orders by providing an end date.
   * @return supportsStandingOrderEndDate
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the institution supports closed-ended standing orders by providing an end date.")

  public Boolean getSupportsStandingOrderEndDate() {
    return supportsStandingOrderEndDate;
  }


  public void setSupportsStandingOrderEndDate(Boolean supportsStandingOrderEndDate) {
    this.supportsStandingOrderEndDate = supportsStandingOrderEndDate;
  }


  public PaymentInitiationStandingOrderMetadata supportsStandingOrderNegativeExecutionDays(Boolean supportsStandingOrderNegativeExecutionDays) {
    
    this.supportsStandingOrderNegativeExecutionDays = supportsStandingOrderNegativeExecutionDays;
    return this;
  }

   /**
   * This is only applicable to &#x60;MONTHLY&#x60; standing orders. Indicates whether the institution supports negative integers (-1 to -5) for setting up a &#x60;MONTHLY&#x60; standing order relative to the end of the month.
   * @return supportsStandingOrderNegativeExecutionDays
  **/
  @ApiModelProperty(required = true, value = "This is only applicable to `MONTHLY` standing orders. Indicates whether the institution supports negative integers (-1 to -5) for setting up a `MONTHLY` standing order relative to the end of the month.")

  public Boolean getSupportsStandingOrderNegativeExecutionDays() {
    return supportsStandingOrderNegativeExecutionDays;
  }


  public void setSupportsStandingOrderNegativeExecutionDays(Boolean supportsStandingOrderNegativeExecutionDays) {
    this.supportsStandingOrderNegativeExecutionDays = supportsStandingOrderNegativeExecutionDays;
  }


  public PaymentInitiationStandingOrderMetadata validStandingOrderIntervals(List<PaymentScheduleInterval> validStandingOrderIntervals) {
    
    this.validStandingOrderIntervals = validStandingOrderIntervals;
    return this;
  }

  public PaymentInitiationStandingOrderMetadata addValidStandingOrderIntervalsItem(PaymentScheduleInterval validStandingOrderIntervalsItem) {
    this.validStandingOrderIntervals.add(validStandingOrderIntervalsItem);
    return this;
  }

   /**
   * A list of the valid standing order intervals supported by the institution.
   * @return validStandingOrderIntervals
  **/
  @ApiModelProperty(required = true, value = "A list of the valid standing order intervals supported by the institution.")

  public List<PaymentScheduleInterval> getValidStandingOrderIntervals() {
    return validStandingOrderIntervals;
  }


  public void setValidStandingOrderIntervals(List<PaymentScheduleInterval> validStandingOrderIntervals) {
    this.validStandingOrderIntervals = validStandingOrderIntervals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationStandingOrderMetadata paymentInitiationStandingOrderMetadata = (PaymentInitiationStandingOrderMetadata) o;
    return Objects.equals(this.supportsStandingOrderEndDate, paymentInitiationStandingOrderMetadata.supportsStandingOrderEndDate) &&
        Objects.equals(this.supportsStandingOrderNegativeExecutionDays, paymentInitiationStandingOrderMetadata.supportsStandingOrderNegativeExecutionDays) &&
        Objects.equals(this.validStandingOrderIntervals, paymentInitiationStandingOrderMetadata.validStandingOrderIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportsStandingOrderEndDate, supportsStandingOrderNegativeExecutionDays, validStandingOrderIntervals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationStandingOrderMetadata {\n");
    sb.append("    supportsStandingOrderEndDate: ").append(toIndentedString(supportsStandingOrderEndDate)).append("\n");
    sb.append("    supportsStandingOrderNegativeExecutionDays: ").append(toIndentedString(supportsStandingOrderNegativeExecutionDays)).append("\n");
    sb.append("    validStandingOrderIntervals: ").append(toIndentedString(validStandingOrderIntervals)).append("\n");
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

