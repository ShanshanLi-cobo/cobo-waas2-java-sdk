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
 * The type of the signature format. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  Each signature format type requires a different set of properties. Switch between the above tabs for details. 
 */
@JsonAdapter(MessageSignDestinationType.Adapter.class)
public enum MessageSignDestinationType {
  UNKNOWN(null),
  
  EVM_EIP_191_SIGNATURE("EVM_EIP_191_Signature"),
  
  EVM_EIP_712_SIGNATURE("EVM_EIP_712_Signature"),
  
  BTC_EIP_191_SIGNATURE("BTC_EIP_191_Signature"),
  
  BTC_BIP_137_SIGNATURE("BTC_BIP_137_Signature"),
  
  BTC_BIP_322_SIGNATURE("BTC_BIP_322_Signature"),
  
  COSMOS_ADR_36_SIGNATURE("COSMOS_ADR_36_Signature"),
  
  RAW_MESSAGE_SIGNATURE("Raw_Message_Signature");

  private String value;

  MessageSignDestinationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MessageSignDestinationType fromValue(String value) {
    for (MessageSignDestinationType b : MessageSignDestinationType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MessageSignDestinationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MessageSignDestinationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MessageSignDestinationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MessageSignDestinationType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    MessageSignDestinationType.fromValue(value);
  }
}

