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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing metadata from the end user&#39;s uploaded document.
 */
@ApiModel(description = "An object representing metadata from the end user's uploaded document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-01T22:08:13.068Z[GMT]")
public class DocumentMetadata {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DOC_ID = "doc_id";
  @SerializedName(SERIALIZED_NAME_DOC_ID)
  private String docId;

  /**
   * The type of document.  &#x60;DOCUMENT_TYPE_PAYSTUB&#x60;: A paystub.  &#x60;DOCUMENT_TYPE_BANK_STATEMENT&#x60;: A bank statement.  &#x60;DOCUMENT_TYPE_US_TAX_W2&#x60;: A W-2 wage and tax statement provided by a US employer reflecting wages earned by the employee.  &#x60;DOCUMENT_TYPE_US_MILITARY_ERAS&#x60;: An electronic Retirement Account Statement (eRAS) issued by the US military.  &#x60;DOCUMENT_TYPE_US_MILITARY_LES&#x60;: A Leave and Earnings Statement (LES) issued by the US military.  &#x60;DOCUMENT_TYPE_US_MILITARY_CLES&#x60;: A Civilian Leave and Earnings Statment (CLES) issued by the US military.  &#x60;DOCUMENT_TYPE_GIG&#x60;: Used to indicate that the income is related to gig work. Does not necessarily correspond to a specific document type.  &#x60;UNKNOWN&#x60;: Document type could not be determined.
   */
  @JsonAdapter(DocTypeEnum.Adapter.class)
  public enum DocTypeEnum {
    UNKNOWN("UNKNOWN"),
    
    DOCUMENT_TYPE_PAYSTUB("DOCUMENT_TYPE_PAYSTUB"),
    
    DOCUMENT_TYPE_BANK_STATEMENT("DOCUMENT_TYPE_BANK_STATEMENT"),
    
    DOCUMENT_TYPE_US_TAX_W2("DOCUMENT_TYPE_US_TAX_W2"),
    
    DOCUMENT_TYPE_US_MILITARY_ERAS("DOCUMENT_TYPE_US_MILITARY_ERAS"),
    
    DOCUMENT_TYPE_US_MILITARY_LES("DOCUMENT_TYPE_US_MILITARY_LES"),
    
    DOCUMENT_TYPE_US_MILITARY_CLES("DOCUMENT_TYPE_US_MILITARY_CLES"),
    
    DOCUMENT_TYPE_GIG("DOCUMENT_TYPE_GIG");

    private String value;

    DocTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocTypeEnum fromValue(String value) {
      for (DocTypeEnum b : DocTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOC_TYPE = "doc_type";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private DocTypeEnum docType;


  public DocumentMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the document.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the document.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentMetadata status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The processing status of the document.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processing status of the document.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DocumentMetadata docId(String docId) {
    
    this.docId = docId;
    return this;
  }

   /**
   * An identifier of the document that is also present in the paystub response.
   * @return docId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier of the document that is also present in the paystub response.")

  public String getDocId() {
    return docId;
  }


  public void setDocId(String docId) {
    this.docId = docId;
  }


  public DocumentMetadata docType(DocTypeEnum docType) {
    
    this.docType = docType;
    return this;
  }

   /**
   * The type of document.  &#x60;DOCUMENT_TYPE_PAYSTUB&#x60;: A paystub.  &#x60;DOCUMENT_TYPE_BANK_STATEMENT&#x60;: A bank statement.  &#x60;DOCUMENT_TYPE_US_TAX_W2&#x60;: A W-2 wage and tax statement provided by a US employer reflecting wages earned by the employee.  &#x60;DOCUMENT_TYPE_US_MILITARY_ERAS&#x60;: An electronic Retirement Account Statement (eRAS) issued by the US military.  &#x60;DOCUMENT_TYPE_US_MILITARY_LES&#x60;: A Leave and Earnings Statement (LES) issued by the US military.  &#x60;DOCUMENT_TYPE_US_MILITARY_CLES&#x60;: A Civilian Leave and Earnings Statment (CLES) issued by the US military.  &#x60;DOCUMENT_TYPE_GIG&#x60;: Used to indicate that the income is related to gig work. Does not necessarily correspond to a specific document type.  &#x60;UNKNOWN&#x60;: Document type could not be determined.
   * @return docType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of document.  `DOCUMENT_TYPE_PAYSTUB`: A paystub.  `DOCUMENT_TYPE_BANK_STATEMENT`: A bank statement.  `DOCUMENT_TYPE_US_TAX_W2`: A W-2 wage and tax statement provided by a US employer reflecting wages earned by the employee.  `DOCUMENT_TYPE_US_MILITARY_ERAS`: An electronic Retirement Account Statement (eRAS) issued by the US military.  `DOCUMENT_TYPE_US_MILITARY_LES`: A Leave and Earnings Statement (LES) issued by the US military.  `DOCUMENT_TYPE_US_MILITARY_CLES`: A Civilian Leave and Earnings Statment (CLES) issued by the US military.  `DOCUMENT_TYPE_GIG`: Used to indicate that the income is related to gig work. Does not necessarily correspond to a specific document type.  `UNKNOWN`: Document type could not be determined.")

  public DocTypeEnum getDocType() {
    return docType;
  }


  public void setDocType(DocTypeEnum docType) {
    this.docType = docType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentMetadata documentMetadata = (DocumentMetadata) o;
    return Objects.equals(this.name, documentMetadata.name) &&
        Objects.equals(this.status, documentMetadata.status) &&
        Objects.equals(this.docId, documentMetadata.docId) &&
        Objects.equals(this.docType, documentMetadata.docType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, docId, docType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
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
