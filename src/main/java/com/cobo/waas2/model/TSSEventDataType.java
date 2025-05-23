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
 *  The data type of the event. - &#x60;KeyGen&#x60;: The key gen event data. - &#x60;KeyReshare&#x60;: The key reshare event data. - &#x60;KeySign&#x60;: The key sign event data. - &#x60;KeyShareSign&#x60;: The key share sign event data.
 */
@JsonAdapter(TSSEventDataType.Adapter.class)
public enum TSSEventDataType {
  UNKNOWN(null),
  
  KEYGEN("KeyGen"),
  
  KEYRESHARE("KeyReshare"),
  
  KEYSIGN("KeySign"),
  
  KEYSHARESIGN("KeyShareSign");

  private String value;

  TSSEventDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TSSEventDataType fromValue(String value) {
    for (TSSEventDataType b : TSSEventDataType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TSSEventDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TSSEventDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TSSEventDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TSSEventDataType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TSSEventDataType.fromValue(value);
  }
}

