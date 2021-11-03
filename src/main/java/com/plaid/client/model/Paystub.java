/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.44.0
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
import com.plaid.client.model.Deductions;
import com.plaid.client.model.Earnings;
import com.plaid.client.model.Employee;
import com.plaid.client.model.EmploymentDetails;
import com.plaid.client.model.IncomeBreakdown;
import com.plaid.client.model.NetPay;
import com.plaid.client.model.PayPeriodDetails;
import com.plaid.client.model.PaystubDetails;
import com.plaid.client.model.PaystubEmployer;
import com.plaid.client.model.PaystubVerification;
import com.plaid.client.model.PaystubYTDDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing data extracted from the end user&#39;s paystub.
 */
@ApiModel(description = "An object representing data extracted from the end user's paystub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T22:08:13.068Z[GMT]")
public class Paystub {
  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private Deductions deductions;

  public static final String SERIALIZED_NAME_DOC_ID = "doc_id";
  @SerializedName(SERIALIZED_NAME_DOC_ID)
  private String docId;

  public static final String SERIALIZED_NAME_EARNINGS = "earnings";
  @SerializedName(SERIALIZED_NAME_EARNINGS)
  private Earnings earnings;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private Employee employee;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private PaystubEmployer employer;

  public static final String SERIALIZED_NAME_EMPLOYMENT_DETAILS = "employment_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_DETAILS)
  private EmploymentDetails employmentDetails;

  public static final String SERIALIZED_NAME_NET_PAY = "net_pay";
  @SerializedName(SERIALIZED_NAME_NET_PAY)
  private NetPay netPay;

  public static final String SERIALIZED_NAME_PAY_PERIOD_DETAILS = "pay_period_details";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD_DETAILS)
  private PayPeriodDetails payPeriodDetails;

  public static final String SERIALIZED_NAME_PAYSTUB_DETAILS = "paystub_details";
  @SerializedName(SERIALIZED_NAME_PAYSTUB_DETAILS)
  private PaystubDetails paystubDetails;

  public static final String SERIALIZED_NAME_INCOME_BREAKDOWN = "income_breakdown";
  @SerializedName(SERIALIZED_NAME_INCOME_BREAKDOWN)
  private List<IncomeBreakdown> incomeBreakdown = null;

  public static final String SERIALIZED_NAME_YTD_EARNINGS = "ytd_earnings";
  @SerializedName(SERIALIZED_NAME_YTD_EARNINGS)
  private PaystubYTDDetails ytdEarnings;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private PaystubVerification verification;


  public Paystub deductions(Deductions deductions) {
    
    this.deductions = deductions;
    return this;
  }

   /**
   * Get deductions
   * @return deductions
  **/
  @ApiModelProperty(required = true, value = "")

  public Deductions getDeductions() {
    return deductions;
  }


  public void setDeductions(Deductions deductions) {
    this.deductions = deductions;
  }


  public Paystub docId(String docId) {
    
    this.docId = docId;
    return this;
  }

   /**
   * An identifier of the document referenced by the document metadata.
   * @return docId
  **/
  @ApiModelProperty(required = true, value = "An identifier of the document referenced by the document metadata.")

  public String getDocId() {
    return docId;
  }


  public void setDocId(String docId) {
    this.docId = docId;
  }


  public Paystub earnings(Earnings earnings) {
    
    this.earnings = earnings;
    return this;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @ApiModelProperty(required = true, value = "")

  public Earnings getEarnings() {
    return earnings;
  }


  public void setEarnings(Earnings earnings) {
    this.earnings = earnings;
  }


  public Paystub employee(Employee employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(required = true, value = "")

  public Employee getEmployee() {
    return employee;
  }


  public void setEmployee(Employee employee) {
    this.employee = employee;
  }


  public Paystub employer(PaystubEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(required = true, value = "")

  public PaystubEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(PaystubEmployer employer) {
    this.employer = employer;
  }


  public Paystub employmentDetails(EmploymentDetails employmentDetails) {
    
    this.employmentDetails = employmentDetails;
    return this;
  }

   /**
   * Get employmentDetails
   * @return employmentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmploymentDetails getEmploymentDetails() {
    return employmentDetails;
  }


  public void setEmploymentDetails(EmploymentDetails employmentDetails) {
    this.employmentDetails = employmentDetails;
  }


  public Paystub netPay(NetPay netPay) {
    
    this.netPay = netPay;
    return this;
  }

   /**
   * Get netPay
   * @return netPay
  **/
  @ApiModelProperty(required = true, value = "")

  public NetPay getNetPay() {
    return netPay;
  }


  public void setNetPay(NetPay netPay) {
    this.netPay = netPay;
  }


  public Paystub payPeriodDetails(PayPeriodDetails payPeriodDetails) {
    
    this.payPeriodDetails = payPeriodDetails;
    return this;
  }

   /**
   * Get payPeriodDetails
   * @return payPeriodDetails
  **/
  @ApiModelProperty(required = true, value = "")

  public PayPeriodDetails getPayPeriodDetails() {
    return payPeriodDetails;
  }


  public void setPayPeriodDetails(PayPeriodDetails payPeriodDetails) {
    this.payPeriodDetails = payPeriodDetails;
  }


  public Paystub paystubDetails(PaystubDetails paystubDetails) {
    
    this.paystubDetails = paystubDetails;
    return this;
  }

   /**
   * Get paystubDetails
   * @return paystubDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubDetails getPaystubDetails() {
    return paystubDetails;
  }


  public void setPaystubDetails(PaystubDetails paystubDetails) {
    this.paystubDetails = paystubDetails;
  }


  public Paystub incomeBreakdown(List<IncomeBreakdown> incomeBreakdown) {
    
    this.incomeBreakdown = incomeBreakdown;
    return this;
  }

  public Paystub addIncomeBreakdownItem(IncomeBreakdown incomeBreakdownItem) {
    if (this.incomeBreakdown == null) {
      this.incomeBreakdown = new ArrayList<>();
    }
    this.incomeBreakdown.add(incomeBreakdownItem);
    return this;
  }

   /**
   * Get incomeBreakdown
   * @return incomeBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IncomeBreakdown> getIncomeBreakdown() {
    return incomeBreakdown;
  }


  public void setIncomeBreakdown(List<IncomeBreakdown> incomeBreakdown) {
    this.incomeBreakdown = incomeBreakdown;
  }


  public Paystub ytdEarnings(PaystubYTDDetails ytdEarnings) {
    
    this.ytdEarnings = ytdEarnings;
    return this;
  }

   /**
   * Get ytdEarnings
   * @return ytdEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaystubYTDDetails getYtdEarnings() {
    return ytdEarnings;
  }


  public void setYtdEarnings(PaystubYTDDetails ytdEarnings) {
    this.ytdEarnings = ytdEarnings;
  }


  public Paystub verification(PaystubVerification verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PaystubVerification getVerification() {
    return verification;
  }


  public void setVerification(PaystubVerification verification) {
    this.verification = verification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paystub paystub = (Paystub) o;
    return Objects.equals(this.deductions, paystub.deductions) &&
        Objects.equals(this.docId, paystub.docId) &&
        Objects.equals(this.earnings, paystub.earnings) &&
        Objects.equals(this.employee, paystub.employee) &&
        Objects.equals(this.employer, paystub.employer) &&
        Objects.equals(this.employmentDetails, paystub.employmentDetails) &&
        Objects.equals(this.netPay, paystub.netPay) &&
        Objects.equals(this.payPeriodDetails, paystub.payPeriodDetails) &&
        Objects.equals(this.paystubDetails, paystub.paystubDetails) &&
        Objects.equals(this.incomeBreakdown, paystub.incomeBreakdown) &&
        Objects.equals(this.ytdEarnings, paystub.ytdEarnings) &&
        Objects.equals(this.verification, paystub.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductions, docId, earnings, employee, employer, employmentDetails, netPay, payPeriodDetails, paystubDetails, incomeBreakdown, ytdEarnings, verification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paystub {\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employmentDetails: ").append(toIndentedString(employmentDetails)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    payPeriodDetails: ").append(toIndentedString(payPeriodDetails)).append("\n");
    sb.append("    paystubDetails: ").append(toIndentedString(paystubDetails)).append("\n");
    sb.append("    incomeBreakdown: ").append(toIndentedString(incomeBreakdown)).append("\n");
    sb.append("    ytdEarnings: ").append(toIndentedString(ytdEarnings)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
