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
 * The status of the staking activity. Possible values include: - &#x60;Success&#x60;: The activity is successfully completed. - &#x60;Processing&#x60;: The activity is being processed. - &#x60;Failed&#x60;: The activity has failed. 
 */
@JsonAdapter(ActivityStatus.Adapter.class)
public enum ActivityStatus {
  UNKNOWN(null),
  
  SUCCESS("Success"),
  
  PROCESSING("Processing"),
  
  FAILED("Failed");

  private String value;

  ActivityStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ActivityStatus fromValue(String value) {
    for (ActivityStatus b : ActivityStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ActivityStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ActivityStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ActivityStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ActivityStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ActivityStatus.fromValue(value);
  }
}

