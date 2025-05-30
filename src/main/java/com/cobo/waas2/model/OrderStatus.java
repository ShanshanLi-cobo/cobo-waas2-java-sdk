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
 * The current status of the pay-in order: - &#x60;Pending&#x60;: The order has been created and is awaiting payment. No incoming transaction has been detected. - &#x60;Processing&#x60;: An incoming transaction has been detected at the recipient address. - &#x60;Completed&#x60;: The payment has been fully received and is now complete. - &#x60;Expired&#x60;: The order has reached its expiration time without receiving any payment, or the order has been cancelled by the [Update pay-in order](https://www.cobo.com/developers/v2/api-references/payment/update-pay-in-order) operation. - &#x60;Underpaid&#x60;: The order has reached its expiration time. A payment was received but the amount is less than the order&#39;s required amount. 
 */
@JsonAdapter(OrderStatus.Adapter.class)
public enum OrderStatus {
  UNKNOWN(null),
  
  PENDING("Pending"),
  
  PROCESSING("Processing"),
  
  COMPLETED("Completed"),
  
  EXPIRED("Expired"),
  
  UNDERPAID("Underpaid");

  private String value;

  OrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderStatus fromValue(String value) {
    for (OrderStatus b : OrderStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    OrderStatus.fromValue(value);
  }
}

