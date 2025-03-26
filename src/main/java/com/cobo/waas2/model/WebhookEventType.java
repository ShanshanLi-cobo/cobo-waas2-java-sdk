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
 * The event type. To learn the trigger condition of each event type, refer to [Webhook event types and event data](https://www.cobo.com/developers/v2/guides/webhooks-callbacks/webhook-event-type).
 */
@JsonAdapter(WebhookEventType.Adapter.class)
public enum WebhookEventType {
  UNKNOWN(null),
  
  WALLETS_TRANSACTION_CREATED("wallets.transaction.created"),
  
  WALLETS_TRANSACTION_UPDATED("wallets.transaction.updated"),
  
  WALLETS_TRANSACTION_FAILED("wallets.transaction.failed"),
  
  WALLETS_TRANSACTION_SUCCEEDED("wallets.transaction.succeeded"),
  
  WALLETS_MPC_TSS_REQUEST_CREATED("wallets.mpc.tss_request.created"),
  
  WALLETS_MPC_TSS_REQUEST_UPDATED("wallets.mpc.tss_request.updated"),
  
  WALLETS_MPC_TSS_REQUEST_FAILED("wallets.mpc.tss_request.failed"),
  
  WALLETS_MPC_TSS_REQUEST_SUCCEEDED("wallets.mpc.tss_request.succeeded"),
  
  WALLETS_ADDRESSES_CREATED("wallets.addresses.created"),
  
  WALLETS_CREATED("wallets.created"),
  
  MPC_VAULTS_CREATED("mpc_vaults.created"),
  
  FEE_STATION_TRANSACTION_CREATED("fee_station.transaction.created"),
  
  FEE_STATION_TRANSACTION_UPDATED("fee_station.transaction.updated"),
  
  FEE_STATION_TRANSACTION_FAILED("fee_station.transaction.failed"),
  
  FEE_STATION_TRANSACTION_SUCCEEDED("fee_station.transaction.succeeded"),
  
  WALLET_TOKEN_ENABLED("wallet.token.enabled"),
  
  WALLET_CHAIN_ENABLED("wallet.chain.enabled");

  private String value;

  WebhookEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookEventType fromValue(String value) {
    for (WebhookEventType b : WebhookEventType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookEventType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    WebhookEventType.fromValue(value);
  }
}

