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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * An enum indicating whether a network proxy is present and if so what type it is.  &#x60;none_detected&#x60; indicates the user is not on a detectable proxy network.  &#x60;tor&#x60; indicates the user was using a Tor browser, which sends encrypted traffic on a decentralized network and is somewhat similar to a VPN (Virtual Private Network).  &#x60;vpn&#x60; indicates the user is on a VPN (Virtual Private Network)  &#x60;web_proxy&#x60; indicates the user is on a web proxy server, which may allow them to conceal information such as their IP address or other identifying information.  &#x60;public_proxy&#x60; indicates the user is on a public web proxy server, which is similar to a web proxy but can be shared by multiple users. This may allow multiple users to appear as if they have the same IP address for instance.
 */
@JsonAdapter(ProxyType.Adapter.class)
public enum ProxyType {
  
  NONE_DETECTED("none_detected"),
  
  TOR("tor"),
  
  VPN("vpn"),
  
  WEB_PROXY("web_proxy"),
  
  PUBLIC_PROXY("public_proxy"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ProxyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProxyType fromValue(String value) {
    for (ProxyType b : ProxyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<ProxyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProxyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProxyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProxyType.fromValue(value);
    }
  }
}

