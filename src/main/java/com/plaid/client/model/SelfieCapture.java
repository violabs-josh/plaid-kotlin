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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The image or video capture of a selfie. Only one of image or video URL will be populated per selfie.
 */
@ApiModel(description = "The image or video capture of a selfie. Only one of image or video URL will be populated per selfie.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T21:11:51.636755Z[Etc/UTC]")
public class SelfieCapture {
  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl;


  public SelfieCapture imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Temporary URL for downloading an image selfie capture.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.plaid.com/verifications/idv_52xR9LKo77r1Np/selfie/liveness.jpeg", required = true, value = "Temporary URL for downloading an image selfie capture.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public SelfieCapture videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Temporary URL for downloading a video selfie capture.
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.plaid.com/verifications/idv_52xR9LKo77r1Np/selfie/liveness.webm", required = true, value = "Temporary URL for downloading a video selfie capture.")

  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfieCapture selfieCapture = (SelfieCapture) o;
    return Objects.equals(this.imageUrl, selfieCapture.imageUrl) &&
        Objects.equals(this.videoUrl, selfieCapture.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfieCapture {\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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

