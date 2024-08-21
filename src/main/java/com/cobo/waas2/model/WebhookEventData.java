/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.SourceGroup;
import com.cobo.waas2.model.TSSRequestStatus;
import com.cobo.waas2.model.TSSRequestType;
import com.cobo.waas2.model.TSSRequestWebhookEventData;
import com.cobo.waas2.model.TransactionBlockInfo;
import com.cobo.waas2.model.TransactionDestination;
import com.cobo.waas2.model.TransactionFee;
import com.cobo.waas2.model.TransactionInitiatorType;
import com.cobo.waas2.model.TransactionRawTxInfo;
import com.cobo.waas2.model.TransactionReplacement;
import com.cobo.waas2.model.TransactionResult;
import com.cobo.waas2.model.TransactionSource;
import com.cobo.waas2.model.TransactionSubStatus;
import com.cobo.waas2.model.TransactionWebhookEventData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.cobo.waas2.JSON;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class WebhookEventData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WebhookEventData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WebhookEventData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WebhookEventData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TransactionWebhookEventData> adapterTransactionWebhookEventData = gson.getDelegateAdapter(this, TypeToken.get(TransactionWebhookEventData.class));
            final TypeAdapter<TSSRequestWebhookEventData> adapterTSSRequestWebhookEventData = gson.getDelegateAdapter(this, TypeToken.get(TSSRequestWebhookEventData.class));

            return (TypeAdapter<T>) new TypeAdapter<WebhookEventData>() {
                @Override
                public void write(JsonWriter out, WebhookEventData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TransactionWebhookEventData`
                    if (value.getActualInstance() instanceof TransactionWebhookEventData) {
                        JsonElement element = adapterTransactionWebhookEventData.toJsonTree((TransactionWebhookEventData)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TSSRequestWebhookEventData`
                    if (value.getActualInstance() instanceof TSSRequestWebhookEventData) {
                        JsonElement element = adapterTSSRequestWebhookEventData.toJsonTree((TSSRequestWebhookEventData)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TSSRequestWebhookEventData, TransactionWebhookEventData");
                }

                @Override
                public WebhookEventData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    WebhookEventData newWebhookEventData = new WebhookEventData();
                    if (jsonObject.get("data_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for WebhookEventData as `data_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `data_type`
                        switch (jsonObject.get("data_type").getAsString()) {
                            case "TSSRequest":
                                deserialized = adapterTSSRequestWebhookEventData.fromJsonTree(jsonObject);
                                newWebhookEventData.setActualInstance(deserialized);
                                return newWebhookEventData;
                            case "Transaction":
                                deserialized = adapterTransactionWebhookEventData.fromJsonTree(jsonObject);
                                newWebhookEventData.setActualInstance(deserialized);
                                return newWebhookEventData;
                            case "TSSRequestWebhookEventData":
                                deserialized = adapterTSSRequestWebhookEventData.fromJsonTree(jsonObject);
                                newWebhookEventData.setActualInstance(deserialized);
                                return newWebhookEventData;
                            case "TransactionWebhookEventData":
                                deserialized = adapterTransactionWebhookEventData.fromJsonTree(jsonObject);
                                newWebhookEventData.setActualInstance(deserialized);
                                return newWebhookEventData;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for WebhookEventData. Possible values: TSSRequest Transaction TSSRequestWebhookEventData TransactionWebhookEventData", jsonObject.get("data_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TransactionWebhookEventData
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionWebhookEventData.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionWebhookEventData;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionWebhookEventData'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionWebhookEventData failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionWebhookEventData'", e);
                    }
                    // deserialize TSSRequestWebhookEventData
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TSSRequestWebhookEventData.validateJsonElement(jsonElement);
                        actualAdapter = adapterTSSRequestWebhookEventData;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TSSRequestWebhookEventData'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TSSRequestWebhookEventData failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TSSRequestWebhookEventData'", e);
                    }

                    if (match == 1) {
                        WebhookEventData ret = new WebhookEventData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for WebhookEventData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public WebhookEventData() {
        super("oneOf", Boolean.FALSE);
    }

    public WebhookEventData(TSSRequestWebhookEventData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WebhookEventData(TransactionWebhookEventData o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TransactionWebhookEventData", TransactionWebhookEventData.class);
        schemas.put("TSSRequestWebhookEventData", TSSRequestWebhookEventData.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return WebhookEventData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TSSRequestWebhookEventData, TransactionWebhookEventData
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TransactionWebhookEventData) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TSSRequestWebhookEventData) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TSSRequestWebhookEventData, TransactionWebhookEventData");
    }

    /**
     * Get the actual instance, which can be the following:
     * TSSRequestWebhookEventData, TransactionWebhookEventData
     *
     * @return The actual instance (TSSRequestWebhookEventData, TransactionWebhookEventData)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TransactionWebhookEventData`. If the actual instance is not `TransactionWebhookEventData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionWebhookEventData`
     * @throws ClassCastException if the instance is not `TransactionWebhookEventData`
     */
    public TransactionWebhookEventData getTransactionWebhookEventData() throws ClassCastException {
        return (TransactionWebhookEventData)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TSSRequestWebhookEventData`. If the actual instance is not `TSSRequestWebhookEventData`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TSSRequestWebhookEventData`
     * @throws ClassCastException if the instance is not `TSSRequestWebhookEventData`
     */
    public TSSRequestWebhookEventData getTSSRequestWebhookEventData() throws ClassCastException {
        return (TSSRequestWebhookEventData)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to WebhookEventData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with TransactionWebhookEventData
        try {
            TransactionWebhookEventData.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionWebhookEventData failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TSSRequestWebhookEventData
        try {
            TSSRequestWebhookEventData.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TSSRequestWebhookEventData failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for WebhookEventData with oneOf schemas: TSSRequestWebhookEventData, TransactionWebhookEventData. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of WebhookEventData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of WebhookEventData
     * @throws IOException if the JSON string is invalid with respect to WebhookEventData
     */
    public static WebhookEventData fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, WebhookEventData.class);
    }

    /**
     * Convert an instance of WebhookEventData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

