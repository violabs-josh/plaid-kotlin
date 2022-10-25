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
import com.plaid.client.model.CreditDocumentMetadata;
import com.plaid.client.model.CreditPayStubEmployee;
import com.plaid.client.model.CreditPayStubEmployer;
import com.plaid.client.model.W2Box12;
import com.plaid.client.model.W2StateAndLocalWages;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * W2 is an object that represents income data taken from a W2 tax document.
 */
@ApiModel(description = "W2 is an object that represents income data taken from a W2 tax document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T18:01:37.538604Z[Etc/UTC]")
public class CreditW2 {
  public static final String SERIALIZED_NAME_DOCUMENT_METADATA = "document_metadata";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_METADATA)
  private CreditDocumentMetadata documentMetadata;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "document_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private CreditPayStubEmployer employer;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private CreditPayStubEmployee employee;

  public static final String SERIALIZED_NAME_TAX_YEAR = "tax_year";
  @SerializedName(SERIALIZED_NAME_TAX_YEAR)
  private String taxYear;

  public static final String SERIALIZED_NAME_EMPLOYER_ID_NUMBER = "employer_id_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_ID_NUMBER)
  private String employerIdNumber;

  public static final String SERIALIZED_NAME_WAGES_TIPS_OTHER_COMP = "wages_tips_other_comp";
  @SerializedName(SERIALIZED_NAME_WAGES_TIPS_OTHER_COMP)
  private String wagesTipsOtherComp;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federal_income_tax_withheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private String federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_WAGES = "social_security_wages";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_WAGES)
  private String socialSecurityWages;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_TAX_WITHHELD = "social_security_tax_withheld";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_TAX_WITHHELD)
  private String socialSecurityTaxWithheld;

  public static final String SERIALIZED_NAME_MEDICARE_WAGES_AND_TIPS = "medicare_wages_and_tips";
  @SerializedName(SERIALIZED_NAME_MEDICARE_WAGES_AND_TIPS)
  private String medicareWagesAndTips;

  public static final String SERIALIZED_NAME_MEDICARE_TAX_WITHHELD = "medicare_tax_withheld";
  @SerializedName(SERIALIZED_NAME_MEDICARE_TAX_WITHHELD)
  private String medicareTaxWithheld;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_TIPS = "social_security_tips";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_TIPS)
  private String socialSecurityTips;

  public static final String SERIALIZED_NAME_ALLOCATED_TIPS = "allocated_tips";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_TIPS)
  private String allocatedTips;

  public static final String SERIALIZED_NAME_BOX9 = "box_9";
  @SerializedName(SERIALIZED_NAME_BOX9)
  private String box9;

  public static final String SERIALIZED_NAME_DEPENDENT_CARE_BENEFITS = "dependent_care_benefits";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_CARE_BENEFITS)
  private String dependentCareBenefits;

  public static final String SERIALIZED_NAME_NONQUALIFIED_PLANS = "nonqualified_plans";
  @SerializedName(SERIALIZED_NAME_NONQUALIFIED_PLANS)
  private String nonqualifiedPlans;

  public static final String SERIALIZED_NAME_BOX12 = "box_12";
  @SerializedName(SERIALIZED_NAME_BOX12)
  private List<W2Box12> box12 = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUTORY_EMPLOYEE = "statutory_employee";
  @SerializedName(SERIALIZED_NAME_STATUTORY_EMPLOYEE)
  private String statutoryEmployee;

  public static final String SERIALIZED_NAME_RETIREMENT_PLAN = "retirement_plan";
  @SerializedName(SERIALIZED_NAME_RETIREMENT_PLAN)
  private String retirementPlan;

  public static final String SERIALIZED_NAME_THIRD_PARTY_SICK_PAY = "third_party_sick_pay";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_SICK_PAY)
  private String thirdPartySickPay;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private String other;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WAGES = "state_and_local_wages";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WAGES)
  private List<W2StateAndLocalWages> stateAndLocalWages = new ArrayList<>();


  public CreditW2 documentMetadata(CreditDocumentMetadata documentMetadata) {
    
    this.documentMetadata = documentMetadata;
    return this;
  }

   /**
   * Get documentMetadata
   * @return documentMetadata
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditDocumentMetadata getDocumentMetadata() {
    return documentMetadata;
  }


  public void setDocumentMetadata(CreditDocumentMetadata documentMetadata) {
    this.documentMetadata = documentMetadata;
  }


  public CreditW2 documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * An identifier of the document referenced by the document metadata.
   * @return documentId
  **/
  @ApiModelProperty(required = true, value = "An identifier of the document referenced by the document metadata.")

  public String getDocumentId() {
    return documentId;
  }


  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public CreditW2 employer(CreditPayStubEmployer employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPayStubEmployer getEmployer() {
    return employer;
  }


  public void setEmployer(CreditPayStubEmployer employer) {
    this.employer = employer;
  }


  public CreditW2 employee(CreditPayStubEmployee employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPayStubEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(CreditPayStubEmployee employee) {
    this.employee = employee;
  }


  public CreditW2 taxYear(String taxYear) {
    
    this.taxYear = taxYear;
    return this;
  }

   /**
   * The tax year of the W2 document.
   * @return taxYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The tax year of the W2 document.")

  public String getTaxYear() {
    return taxYear;
  }


  public void setTaxYear(String taxYear) {
    this.taxYear = taxYear;
  }


  public CreditW2 employerIdNumber(String employerIdNumber) {
    
    this.employerIdNumber = employerIdNumber;
    return this;
  }

   /**
   * An employee identification number or EIN.
   * @return employerIdNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An employee identification number or EIN.")

  public String getEmployerIdNumber() {
    return employerIdNumber;
  }


  public void setEmployerIdNumber(String employerIdNumber) {
    this.employerIdNumber = employerIdNumber;
  }


  public CreditW2 wagesTipsOtherComp(String wagesTipsOtherComp) {
    
    this.wagesTipsOtherComp = wagesTipsOtherComp;
    return this;
  }

   /**
   * Wages from tips and other compensation.
   * @return wagesTipsOtherComp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Wages from tips and other compensation.")

  public String getWagesTipsOtherComp() {
    return wagesTipsOtherComp;
  }


  public void setWagesTipsOtherComp(String wagesTipsOtherComp) {
    this.wagesTipsOtherComp = wagesTipsOtherComp;
  }


  public CreditW2 federalIncomeTaxWithheld(String federalIncomeTaxWithheld) {
    
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
    return this;
  }

   /**
   * Federal income tax withheld for the tax year.
   * @return federalIncomeTaxWithheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Federal income tax withheld for the tax year.")

  public String getFederalIncomeTaxWithheld() {
    return federalIncomeTaxWithheld;
  }


  public void setFederalIncomeTaxWithheld(String federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
  }


  public CreditW2 socialSecurityWages(String socialSecurityWages) {
    
    this.socialSecurityWages = socialSecurityWages;
    return this;
  }

   /**
   * Wages from social security.
   * @return socialSecurityWages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Wages from social security.")

  public String getSocialSecurityWages() {
    return socialSecurityWages;
  }


  public void setSocialSecurityWages(String socialSecurityWages) {
    this.socialSecurityWages = socialSecurityWages;
  }


  public CreditW2 socialSecurityTaxWithheld(String socialSecurityTaxWithheld) {
    
    this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
    return this;
  }

   /**
   * Social security tax withheld for the tax year.
   * @return socialSecurityTaxWithheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Social security tax withheld for the tax year.")

  public String getSocialSecurityTaxWithheld() {
    return socialSecurityTaxWithheld;
  }


  public void setSocialSecurityTaxWithheld(String socialSecurityTaxWithheld) {
    this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
  }


  public CreditW2 medicareWagesAndTips(String medicareWagesAndTips) {
    
    this.medicareWagesAndTips = medicareWagesAndTips;
    return this;
  }

   /**
   * Wages and tips from medicare.
   * @return medicareWagesAndTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Wages and tips from medicare.")

  public String getMedicareWagesAndTips() {
    return medicareWagesAndTips;
  }


  public void setMedicareWagesAndTips(String medicareWagesAndTips) {
    this.medicareWagesAndTips = medicareWagesAndTips;
  }


  public CreditW2 medicareTaxWithheld(String medicareTaxWithheld) {
    
    this.medicareTaxWithheld = medicareTaxWithheld;
    return this;
  }

   /**
   * Medicare tax withheld for the tax year.
   * @return medicareTaxWithheld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Medicare tax withheld for the tax year.")

  public String getMedicareTaxWithheld() {
    return medicareTaxWithheld;
  }


  public void setMedicareTaxWithheld(String medicareTaxWithheld) {
    this.medicareTaxWithheld = medicareTaxWithheld;
  }


  public CreditW2 socialSecurityTips(String socialSecurityTips) {
    
    this.socialSecurityTips = socialSecurityTips;
    return this;
  }

   /**
   * Tips from social security.
   * @return socialSecurityTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Tips from social security.")

  public String getSocialSecurityTips() {
    return socialSecurityTips;
  }


  public void setSocialSecurityTips(String socialSecurityTips) {
    this.socialSecurityTips = socialSecurityTips;
  }


  public CreditW2 allocatedTips(String allocatedTips) {
    
    this.allocatedTips = allocatedTips;
    return this;
  }

   /**
   * Allocated tips.
   * @return allocatedTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Allocated tips.")

  public String getAllocatedTips() {
    return allocatedTips;
  }


  public void setAllocatedTips(String allocatedTips) {
    this.allocatedTips = allocatedTips;
  }


  public CreditW2 box9(String box9) {
    
    this.box9 = box9;
    return this;
  }

   /**
   * Contents from box 9 on the W2.
   * @return box9
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Contents from box 9 on the W2.")

  public String getBox9() {
    return box9;
  }


  public void setBox9(String box9) {
    this.box9 = box9;
  }


  public CreditW2 dependentCareBenefits(String dependentCareBenefits) {
    
    this.dependentCareBenefits = dependentCareBenefits;
    return this;
  }

   /**
   * Dependent care benefits.
   * @return dependentCareBenefits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Dependent care benefits.")

  public String getDependentCareBenefits() {
    return dependentCareBenefits;
  }


  public void setDependentCareBenefits(String dependentCareBenefits) {
    this.dependentCareBenefits = dependentCareBenefits;
  }


  public CreditW2 nonqualifiedPlans(String nonqualifiedPlans) {
    
    this.nonqualifiedPlans = nonqualifiedPlans;
    return this;
  }

   /**
   * Nonqualified plans.
   * @return nonqualifiedPlans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Nonqualified plans.")

  public String getNonqualifiedPlans() {
    return nonqualifiedPlans;
  }


  public void setNonqualifiedPlans(String nonqualifiedPlans) {
    this.nonqualifiedPlans = nonqualifiedPlans;
  }


  public CreditW2 box12(List<W2Box12> box12) {
    
    this.box12 = box12;
    return this;
  }

  public CreditW2 addBox12Item(W2Box12 box12Item) {
    this.box12.add(box12Item);
    return this;
  }

   /**
   * Get box12
   * @return box12
  **/
  @ApiModelProperty(required = true, value = "")

  public List<W2Box12> getBox12() {
    return box12;
  }


  public void setBox12(List<W2Box12> box12) {
    this.box12 = box12;
  }


  public CreditW2 statutoryEmployee(String statutoryEmployee) {
    
    this.statutoryEmployee = statutoryEmployee;
    return this;
  }

   /**
   * Statutory employee.
   * @return statutoryEmployee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Statutory employee.")

  public String getStatutoryEmployee() {
    return statutoryEmployee;
  }


  public void setStatutoryEmployee(String statutoryEmployee) {
    this.statutoryEmployee = statutoryEmployee;
  }


  public CreditW2 retirementPlan(String retirementPlan) {
    
    this.retirementPlan = retirementPlan;
    return this;
  }

   /**
   * Retirement plan.
   * @return retirementPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Retirement plan.")

  public String getRetirementPlan() {
    return retirementPlan;
  }


  public void setRetirementPlan(String retirementPlan) {
    this.retirementPlan = retirementPlan;
  }


  public CreditW2 thirdPartySickPay(String thirdPartySickPay) {
    
    this.thirdPartySickPay = thirdPartySickPay;
    return this;
  }

   /**
   * Third party sick pay.
   * @return thirdPartySickPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Third party sick pay.")

  public String getThirdPartySickPay() {
    return thirdPartySickPay;
  }


  public void setThirdPartySickPay(String thirdPartySickPay) {
    this.thirdPartySickPay = thirdPartySickPay;
  }


  public CreditW2 other(String other) {
    
    this.other = other;
    return this;
  }

   /**
   * Other.
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Other.")

  public String getOther() {
    return other;
  }


  public void setOther(String other) {
    this.other = other;
  }


  public CreditW2 stateAndLocalWages(List<W2StateAndLocalWages> stateAndLocalWages) {
    
    this.stateAndLocalWages = stateAndLocalWages;
    return this;
  }

  public CreditW2 addStateAndLocalWagesItem(W2StateAndLocalWages stateAndLocalWagesItem) {
    this.stateAndLocalWages.add(stateAndLocalWagesItem);
    return this;
  }

   /**
   * Get stateAndLocalWages
   * @return stateAndLocalWages
  **/
  @ApiModelProperty(required = true, value = "")

  public List<W2StateAndLocalWages> getStateAndLocalWages() {
    return stateAndLocalWages;
  }


  public void setStateAndLocalWages(List<W2StateAndLocalWages> stateAndLocalWages) {
    this.stateAndLocalWages = stateAndLocalWages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditW2 creditW2 = (CreditW2) o;
    return Objects.equals(this.documentMetadata, creditW2.documentMetadata) &&
        Objects.equals(this.documentId, creditW2.documentId) &&
        Objects.equals(this.employer, creditW2.employer) &&
        Objects.equals(this.employee, creditW2.employee) &&
        Objects.equals(this.taxYear, creditW2.taxYear) &&
        Objects.equals(this.employerIdNumber, creditW2.employerIdNumber) &&
        Objects.equals(this.wagesTipsOtherComp, creditW2.wagesTipsOtherComp) &&
        Objects.equals(this.federalIncomeTaxWithheld, creditW2.federalIncomeTaxWithheld) &&
        Objects.equals(this.socialSecurityWages, creditW2.socialSecurityWages) &&
        Objects.equals(this.socialSecurityTaxWithheld, creditW2.socialSecurityTaxWithheld) &&
        Objects.equals(this.medicareWagesAndTips, creditW2.medicareWagesAndTips) &&
        Objects.equals(this.medicareTaxWithheld, creditW2.medicareTaxWithheld) &&
        Objects.equals(this.socialSecurityTips, creditW2.socialSecurityTips) &&
        Objects.equals(this.allocatedTips, creditW2.allocatedTips) &&
        Objects.equals(this.box9, creditW2.box9) &&
        Objects.equals(this.dependentCareBenefits, creditW2.dependentCareBenefits) &&
        Objects.equals(this.nonqualifiedPlans, creditW2.nonqualifiedPlans) &&
        Objects.equals(this.box12, creditW2.box12) &&
        Objects.equals(this.statutoryEmployee, creditW2.statutoryEmployee) &&
        Objects.equals(this.retirementPlan, creditW2.retirementPlan) &&
        Objects.equals(this.thirdPartySickPay, creditW2.thirdPartySickPay) &&
        Objects.equals(this.other, creditW2.other) &&
        Objects.equals(this.stateAndLocalWages, creditW2.stateAndLocalWages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentMetadata, documentId, employer, employee, taxYear, employerIdNumber, wagesTipsOtherComp, federalIncomeTaxWithheld, socialSecurityWages, socialSecurityTaxWithheld, medicareWagesAndTips, medicareTaxWithheld, socialSecurityTips, allocatedTips, box9, dependentCareBenefits, nonqualifiedPlans, box12, statutoryEmployee, retirementPlan, thirdPartySickPay, other, stateAndLocalWages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditW2 {\n");
    sb.append("    documentMetadata: ").append(toIndentedString(documentMetadata)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    employerIdNumber: ").append(toIndentedString(employerIdNumber)).append("\n");
    sb.append("    wagesTipsOtherComp: ").append(toIndentedString(wagesTipsOtherComp)).append("\n");
    sb.append("    federalIncomeTaxWithheld: ").append(toIndentedString(federalIncomeTaxWithheld)).append("\n");
    sb.append("    socialSecurityWages: ").append(toIndentedString(socialSecurityWages)).append("\n");
    sb.append("    socialSecurityTaxWithheld: ").append(toIndentedString(socialSecurityTaxWithheld)).append("\n");
    sb.append("    medicareWagesAndTips: ").append(toIndentedString(medicareWagesAndTips)).append("\n");
    sb.append("    medicareTaxWithheld: ").append(toIndentedString(medicareTaxWithheld)).append("\n");
    sb.append("    socialSecurityTips: ").append(toIndentedString(socialSecurityTips)).append("\n");
    sb.append("    allocatedTips: ").append(toIndentedString(allocatedTips)).append("\n");
    sb.append("    box9: ").append(toIndentedString(box9)).append("\n");
    sb.append("    dependentCareBenefits: ").append(toIndentedString(dependentCareBenefits)).append("\n");
    sb.append("    nonqualifiedPlans: ").append(toIndentedString(nonqualifiedPlans)).append("\n");
    sb.append("    box12: ").append(toIndentedString(box12)).append("\n");
    sb.append("    statutoryEmployee: ").append(toIndentedString(statutoryEmployee)).append("\n");
    sb.append("    retirementPlan: ").append(toIndentedString(retirementPlan)).append("\n");
    sb.append("    thirdPartySickPay: ").append(toIndentedString(thirdPartySickPay)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    stateAndLocalWages: ").append(toIndentedString(stateAndLocalWages)).append("\n");
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

