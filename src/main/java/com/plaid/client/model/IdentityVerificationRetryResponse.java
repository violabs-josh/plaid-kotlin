/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.419.0
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
import com.plaid.client.model.RiskCheckDetails;
import com.plaid.client.model.SelfieCheck;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A identity verification attempt represents a customer&#39;s attempt to verify their identity, reflecting the required steps for completing the session, the results for each step, and information collected in the process.
 */
@ApiModel(description = "A identity verification attempt represents a customer's attempt to verify their identity, reflecting the required steps for completing the session, the results for each step, and information collected in the process.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class IdentityVerificationRetryResponse {
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

  public static final String SERIALIZED_NAME_SELFIE_CHECK = "selfie_check";
  @SerializedName(SERIALIZED_NAME_SELFIE_CHECK)
  private SelfieCheck selfieCheck;

  public static final String SERIALIZED_NAME_KYC_CHECK = "kyc_check";
  @SerializedName(SERIALIZED_NAME_KYC_CHECK)
  private KYCCheckDetails kycCheck;

  public static final String SERIALIZED_NAME_RISK_CHECK = "risk_check";
  @SerializedName(SERIALIZED_NAME_RISK_CHECK)
  private RiskCheckDetails riskCheck;

  public static final String SERIALIZED_NAME_WATCHLIST_SCREENING_ID = "watchlist_screening_id";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_SCREENING_ID)
  private String watchlistScreeningId;

  public static final String SERIALIZED_NAME_REDACTED_AT = "redacted_at";
  @SerializedName(SERIALIZED_NAME_REDACTED_AT)
  private OffsetDateTime redactedAt;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public IdentityVerificationRetryResponse id(String id) {
    
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


  public IdentityVerificationRetryResponse clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the &#x60;/link/token/create&#x60; &#x60;client_user_id&#x60; to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;client_user_id&#x60;.
   * @return clientUserId
  **/
  @ApiModelProperty(example = "your-db-id-3b24110", required = true, value = "A unique ID that identifies the end user in your system. This ID can also be used to associate user-specific data from other Plaid products. Financial Account Matching requires this field and the `/link/token/create` `client_user_id` to be consistent. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public IdentityVerificationRetryResponse createdAt(java.sql.Timestamp createdAt) {
    
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


  public IdentityVerificationRetryResponse completedAt(OffsetDateTime completedAt) {
    
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


  public IdentityVerificationRetryResponse previousAttemptId(String previousAttemptId) {
    
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


  public IdentityVerificationRetryResponse shareableUrl(String shareableUrl) {
    
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


  public IdentityVerificationRetryResponse template(IdentityVerificationTemplateReference template) {
    
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


  public IdentityVerificationRetryResponse user(IdentityVerificationUserData user) {
    
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


  public IdentityVerificationRetryResponse status(IdentityVerificationStatus status) {
    
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


  public IdentityVerificationRetryResponse steps(IdentityVerificationStepSummary steps) {
    
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


  public IdentityVerificationRetryResponse documentaryVerification(DocumentaryVerification documentaryVerification) {
    
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


  public IdentityVerificationRetryResponse selfieCheck(SelfieCheck selfieCheck) {
    
    this.selfieCheck = selfieCheck;
    return this;
  }

   /**
   * Get selfieCheck
   * @return selfieCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public SelfieCheck getSelfieCheck() {
    return selfieCheck;
  }


  public void setSelfieCheck(SelfieCheck selfieCheck) {
    this.selfieCheck = selfieCheck;
  }


  public IdentityVerificationRetryResponse kycCheck(KYCCheckDetails kycCheck) {
    
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


  public IdentityVerificationRetryResponse riskCheck(RiskCheckDetails riskCheck) {
    
    this.riskCheck = riskCheck;
    return this;
  }

   /**
   * Get riskCheck
   * @return riskCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public RiskCheckDetails getRiskCheck() {
    return riskCheck;
  }


  public void setRiskCheck(RiskCheckDetails riskCheck) {
    this.riskCheck = riskCheck;
  }


  public IdentityVerificationRetryResponse watchlistScreeningId(String watchlistScreeningId) {
    
    this.watchlistScreeningId = watchlistScreeningId;
    return this;
  }

   /**
   * ID of the associated screening.
   * @return watchlistScreeningId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "scr_52xR9LKo77r1Np", required = true, value = "ID of the associated screening.")

  public String getWatchlistScreeningId() {
    return watchlistScreeningId;
  }


  public void setWatchlistScreeningId(String watchlistScreeningId) {
    this.watchlistScreeningId = watchlistScreeningId;
  }


  public IdentityVerificationRetryResponse redactedAt(OffsetDateTime redactedAt) {
    
    this.redactedAt = redactedAt;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return redactedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getRedactedAt() {
    return redactedAt;
  }


  public void setRedactedAt(OffsetDateTime redactedAt) {
    this.redactedAt = redactedAt;
  }


  public IdentityVerificationRetryResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationRetryResponse identityVerificationRetryResponse = (IdentityVerificationRetryResponse) o;
    return Objects.equals(this.id, identityVerificationRetryResponse.id) &&
        Objects.equals(this.clientUserId, identityVerificationRetryResponse.clientUserId) &&
        Objects.equals(this.createdAt, identityVerificationRetryResponse.createdAt) &&
        Objects.equals(this.completedAt, identityVerificationRetryResponse.completedAt) &&
        Objects.equals(this.previousAttemptId, identityVerificationRetryResponse.previousAttemptId) &&
        Objects.equals(this.shareableUrl, identityVerificationRetryResponse.shareableUrl) &&
        Objects.equals(this.template, identityVerificationRetryResponse.template) &&
        Objects.equals(this.user, identityVerificationRetryResponse.user) &&
        Objects.equals(this.status, identityVerificationRetryResponse.status) &&
        Objects.equals(this.steps, identityVerificationRetryResponse.steps) &&
        Objects.equals(this.documentaryVerification, identityVerificationRetryResponse.documentaryVerification) &&
        Objects.equals(this.selfieCheck, identityVerificationRetryResponse.selfieCheck) &&
        Objects.equals(this.kycCheck, identityVerificationRetryResponse.kycCheck) &&
        Objects.equals(this.riskCheck, identityVerificationRetryResponse.riskCheck) &&
        Objects.equals(this.watchlistScreeningId, identityVerificationRetryResponse.watchlistScreeningId) &&
        Objects.equals(this.redactedAt, identityVerificationRetryResponse.redactedAt) &&
        Objects.equals(this.requestId, identityVerificationRetryResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientUserId, createdAt, completedAt, previousAttemptId, shareableUrl, template, user, status, steps, documentaryVerification, selfieCheck, kycCheck, riskCheck, watchlistScreeningId, redactedAt, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationRetryResponse {\n");
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
    sb.append("    selfieCheck: ").append(toIndentedString(selfieCheck)).append("\n");
    sb.append("    kycCheck: ").append(toIndentedString(kycCheck)).append("\n");
    sb.append("    riskCheck: ").append(toIndentedString(riskCheck)).append("\n");
    sb.append("    watchlistScreeningId: ").append(toIndentedString(watchlistScreeningId)).append("\n");
    sb.append("    redactedAt: ").append(toIndentedString(redactedAt)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
