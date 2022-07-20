/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.146.0
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
import com.plaid.client.model.DocumentaryVerification;
import com.plaid.client.model.IdentityVerificationStatus;
import com.plaid.client.model.IdentityVerificationStepSummary;
import com.plaid.client.model.IdentityVerificationTemplateReference;
import com.plaid.client.model.IdentityVerificationUserData;
import com.plaid.client.model.KYCCheckDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A identity verification attempt represents a customer&#39;s attempt to verify their identity, reflecting the required steps for completing the session, the results for each step, and information collected in the process.
 */
@ApiModel(description = "A identity verification attempt represents a customer's attempt to verify their identity, reflecting the required steps for completing the session, the results for each step, and information collected in the process.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-19T23:07:20.107473Z[Etc/UTC]")
public class IdentityVerification {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private java.sql.Timestamp createdAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private OffsetDateTime completedAt;

  public static final String SERIALIZED_NAME_PREVIOUS_ATTEMPT_ID = "previous_attempt_id";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_ATTEMPT_ID)
  private String previousAttemptId;

  public static final String SERIALIZED_NAME_SHAREABLE_URL = "shareable_url";
  @SerializedName(SERIALIZED_NAME_SHAREABLE_URL)
  private String shareableUrl;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private IdentityVerificationTemplateReference template;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private IdentityVerificationUserData user;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private IdentityVerificationStatus status;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private IdentityVerificationStepSummary steps;

  public static final String SERIALIZED_NAME_DOCUMENTARY_VERIFICATION = "documentary_verification";
  @SerializedName(SERIALIZED_NAME_DOCUMENTARY_VERIFICATION)
  private DocumentaryVerification documentaryVerification;

  public static final String SERIALIZED_NAME_KYC_CHECK = "kyc_check";
  @SerializedName(SERIALIZED_NAME_KYC_CHECK)
  private KYCCheckDetails kycCheck;

  public static final String SERIALIZED_NAME_WATCHLIST_SCREENING_ID = "watchlist_screening_id";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_SCREENING_ID)
  private String watchlistScreeningId;


  public IdentityVerification id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated Identity Verification attempt.
   * @return id
  **/
  @ApiModelProperty(example = "idv_52xR9LKo77r1Np", required = true, value = "ID of the associated Identity Verification attempt.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IdentityVerification clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * An identifier to help you connect this object to your internal systems. For example, your database ID corresponding to this object.
   * @return clientUserId
  **/
  @ApiModelProperty(example = "your-db-id-3b24110", required = true, value = "An identifier to help you connect this object to your internal systems. For example, your database ID corresponding to this object.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public IdentityVerification createdAt(java.sql.Timestamp createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public IdentityVerification completedAt(OffsetDateTime completedAt) {
    
    this.completedAt = completedAt;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public IdentityVerification previousAttemptId(String previousAttemptId) {
    
    this.previousAttemptId = previousAttemptId;
    return this;
  }

   /**
   * The ID for the Identity Verification preceding this session. This field will only be filled if the current Identity Verification is a retry of a previous attempt.
   * @return previousAttemptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "idv_42cF1MNo42r9Xj", required = true, value = "The ID for the Identity Verification preceding this session. This field will only be filled if the current Identity Verification is a retry of a previous attempt.")

  public String getPreviousAttemptId() {
    return previousAttemptId;
  }


  public void setPreviousAttemptId(String previousAttemptId) {
    this.previousAttemptId = previousAttemptId;
  }


  public IdentityVerification shareableUrl(String shareableUrl) {
    
    this.shareableUrl = shareableUrl;
    return this;
  }

   /**
   * A shareable URL that can be sent directly to the user to complete verification
   * @return shareableUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://flow.plaid.com/verify/idv_4FrXJvfQU3zGUR?key=e004115db797f7cc3083bff3167cba30644ef630fb46f5b086cde6cc3b86a36f", required = true, value = "A shareable URL that can be sent directly to the user to complete verification")

  public String getShareableUrl() {
    return shareableUrl;
  }


  public void setShareableUrl(String shareableUrl) {
    this.shareableUrl = shareableUrl;
  }


  public IdentityVerification template(IdentityVerificationTemplateReference template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationTemplateReference getTemplate() {
    return template;
  }


  public void setTemplate(IdentityVerificationTemplateReference template) {
    this.template = template;
  }


  public IdentityVerification user(IdentityVerificationUserData user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationUserData getUser() {
    return user;
  }


  public void setUser(IdentityVerificationUserData user) {
    this.user = user;
  }


  public IdentityVerification status(IdentityVerificationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStatus getStatus() {
    return status;
  }


  public void setStatus(IdentityVerificationStatus status) {
    this.status = status;
  }


  public IdentityVerification steps(IdentityVerificationStepSummary steps) {
    
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationStepSummary getSteps() {
    return steps;
  }


  public void setSteps(IdentityVerificationStepSummary steps) {
    this.steps = steps;
  }


  public IdentityVerification documentaryVerification(DocumentaryVerification documentaryVerification) {
    
    this.documentaryVerification = documentaryVerification;
    return this;
  }

   /**
   * Get documentaryVerification
   * @return documentaryVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public DocumentaryVerification getDocumentaryVerification() {
    return documentaryVerification;
  }


  public void setDocumentaryVerification(DocumentaryVerification documentaryVerification) {
    this.documentaryVerification = documentaryVerification;
  }


  public IdentityVerification kycCheck(KYCCheckDetails kycCheck) {
    
    this.kycCheck = kycCheck;
    return this;
  }

   /**
   * Get kycCheck
   * @return kycCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public KYCCheckDetails getKycCheck() {
    return kycCheck;
  }


  public void setKycCheck(KYCCheckDetails kycCheck) {
    this.kycCheck = kycCheck;
  }


  public IdentityVerification watchlistScreeningId(String watchlistScreeningId) {
    
    this.watchlistScreeningId = watchlistScreeningId;
    return this;
  }

   /**
   * Get watchlistScreeningId
   * @return watchlistScreeningId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getWatchlistScreeningId() {
    return watchlistScreeningId;
  }


  public void setWatchlistScreeningId(String watchlistScreeningId) {
    this.watchlistScreeningId = watchlistScreeningId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerification identityVerification = (IdentityVerification) o;
    return Objects.equals(this.id, identityVerification.id) &&
        Objects.equals(this.clientUserId, identityVerification.clientUserId) &&
        Objects.equals(this.createdAt, identityVerification.createdAt) &&
        Objects.equals(this.completedAt, identityVerification.completedAt) &&
        Objects.equals(this.previousAttemptId, identityVerification.previousAttemptId) &&
        Objects.equals(this.shareableUrl, identityVerification.shareableUrl) &&
        Objects.equals(this.template, identityVerification.template) &&
        Objects.equals(this.user, identityVerification.user) &&
        Objects.equals(this.status, identityVerification.status) &&
        Objects.equals(this.steps, identityVerification.steps) &&
        Objects.equals(this.documentaryVerification, identityVerification.documentaryVerification) &&
        Objects.equals(this.kycCheck, identityVerification.kycCheck) &&
        Objects.equals(this.watchlistScreeningId, identityVerification.watchlistScreeningId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientUserId, createdAt, completedAt, previousAttemptId, shareableUrl, template, user, status, steps, documentaryVerification, kycCheck, watchlistScreeningId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    previousAttemptId: ").append(toIndentedString(previousAttemptId)).append("\n");
    sb.append("    shareableUrl: ").append(toIndentedString(shareableUrl)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    documentaryVerification: ").append(toIndentedString(documentaryVerification)).append("\n");
    sb.append("    kycCheck: ").append(toIndentedString(kycCheck)).append("\n");
    sb.append("    watchlistScreeningId: ").append(toIndentedString(watchlistScreeningId)).append("\n");
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
