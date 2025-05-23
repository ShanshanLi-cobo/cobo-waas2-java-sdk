/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: help@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The elliptic curve type. Possible values include:  - 1 : The &#x60;ECDSA&#x60; group. - 2 : The &#x60;EdDSA&#x60; group. 
 */
@JsonAdapter(TSSGroupType.Adapter.class)
public enum TSSGroupType {
  UNKNOWN(null),
  
  ECDSA(1),
  
  EdDSA(2);

  private Integer value;

  TSSGroupType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TSSGroupType fromValue(Integer value) {
    for (TSSGroupType b : TSSGroupType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TSSGroupType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TSSGroupType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TSSGroupType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return TSSGroupType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    TSSGroupType.fromValue(value);
  }
}

