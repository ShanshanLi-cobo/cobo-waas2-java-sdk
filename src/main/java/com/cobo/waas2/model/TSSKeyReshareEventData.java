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
import com.cobo.waas2.model.TSSEventDataType;
import com.cobo.waas2.model.TSSGroup;
import com.cobo.waas2.model.TSSKeyReshareRequest;
import com.cobo.waas2.model.TSSRequestTypeEenum;
import com.cobo.waas2.model.TSSStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cobo.waas2.JSON;

/**
 * TSSKeyReshareEventData
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TSSKeyReshareEventData {
  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private TSSEventDataType dataType;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "request_type";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private TSSRequestTypeEenum requestType;

  public static final String SERIALIZED_NAME_REQUEST_STATUS = "request_status";
  @SerializedName(SERIALIZED_NAME_REQUEST_STATUS)
  private TSSStatus requestStatus;

  public static final String SERIALIZED_NAME_EXTRA_INFO = "extra_info";
  @SerializedName(SERIALIZED_NAME_EXTRA_INFO)
  private String extraInfo;

  public static final String SERIALIZED_NAME_FAILED_REASON = "failed_reason";
  @SerializedName(SERIALIZED_NAME_FAILED_REASON)
  private String failedReason;

  public static final String SERIALIZED_NAME_REQUEST_DETAIL = "request_detail";
  @SerializedName(SERIALIZED_NAME_REQUEST_DETAIL)
  private TSSKeyReshareRequest requestDetail;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private TSSGroup result;

  public TSSKeyReshareEventData() {
  }

  public TSSKeyReshareEventData dataType(TSSEventDataType dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nonnull
  public TSSEventDataType getDataType() {
    return dataType;
  }

  public void setDataType(TSSEventDataType dataType) {
    this.dataType = dataType;
  }


  public TSSKeyReshareEventData requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The request ID.
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public TSSKeyReshareEventData requestType(TSSRequestTypeEenum requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @javax.annotation.Nullable
  public TSSRequestTypeEenum getRequestType() {
    return requestType;
  }

  public void setRequestType(TSSRequestTypeEenum requestType) {
    this.requestType = requestType;
  }


  public TSSKeyReshareEventData requestStatus(TSSStatus requestStatus) {
    this.requestStatus = requestStatus;
    return this;
  }

   /**
   * Get requestStatus
   * @return requestStatus
  **/
  @javax.annotation.Nullable
  public TSSStatus getRequestStatus() {
    return requestStatus;
  }

  public void setRequestStatus(TSSStatus requestStatus) {
    this.requestStatus = requestStatus;
  }


  public TSSKeyReshareEventData extraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * The extra info.
   * @return extraInfo
  **/
  @javax.annotation.Nullable
  public String getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }


  public TSSKeyReshareEventData failedReason(String failedReason) {
    this.failedReason = failedReason;
    return this;
  }

   /**
   * The failed reason.
   * @return failedReason
  **/
  @javax.annotation.Nullable
  public String getFailedReason() {
    return failedReason;
  }

  public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
  }


  public TSSKeyReshareEventData requestDetail(TSSKeyReshareRequest requestDetail) {
    this.requestDetail = requestDetail;
    return this;
  }

   /**
   * Get requestDetail
   * @return requestDetail
  **/
  @javax.annotation.Nullable
  public TSSKeyReshareRequest getRequestDetail() {
    return requestDetail;
  }

  public void setRequestDetail(TSSKeyReshareRequest requestDetail) {
    this.requestDetail = requestDetail;
  }


  public TSSKeyReshareEventData result(TSSGroup result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public TSSGroup getResult() {
    return result;
  }

  public void setResult(TSSGroup result) {
    this.result = result;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the TSSKeyReshareEventData instance itself
   */
  public TSSKeyReshareEventData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TSSKeyReshareEventData tsSKeyReshareEventData = (TSSKeyReshareEventData) o;
    return Objects.equals(this.dataType, tsSKeyReshareEventData.dataType) &&
        Objects.equals(this.requestId, tsSKeyReshareEventData.requestId) &&
        Objects.equals(this.requestType, tsSKeyReshareEventData.requestType) &&
        Objects.equals(this.requestStatus, tsSKeyReshareEventData.requestStatus) &&
        Objects.equals(this.extraInfo, tsSKeyReshareEventData.extraInfo) &&
        Objects.equals(this.failedReason, tsSKeyReshareEventData.failedReason) &&
        Objects.equals(this.requestDetail, tsSKeyReshareEventData.requestDetail) &&
        Objects.equals(this.result, tsSKeyReshareEventData.result)&&
        Objects.equals(this.additionalProperties, tsSKeyReshareEventData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, requestId, requestType, requestStatus, extraInfo, failedReason, requestDetail, result, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TSSKeyReshareEventData {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    requestStatus: ").append(toIndentedString(requestStatus)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
    sb.append("    requestDetail: ").append(toIndentedString(requestDetail)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("data_type");
    openapiFields.add("request_id");
    openapiFields.add("request_type");
    openapiFields.add("request_status");
    openapiFields.add("extra_info");
    openapiFields.add("failed_reason");
    openapiFields.add("request_detail");
    openapiFields.add("result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TSSKeyReshareEventData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TSSKeyReshareEventData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TSSKeyReshareEventData is not found in the empty JSON string", TSSKeyReshareEventData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TSSKeyReshareEventData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `data_type`
      TSSEventDataType.validateJsonElement(jsonObj.get("data_type"));
      if ((jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonNull()) && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      // validate the optional field `request_type`
      if (jsonObj.get("request_type") != null && !jsonObj.get("request_type").isJsonNull()) {
        TSSRequestTypeEenum.validateJsonElement(jsonObj.get("request_type"));
      }
      // validate the optional field `request_status`
      if (jsonObj.get("request_status") != null && !jsonObj.get("request_status").isJsonNull()) {
        TSSStatus.validateJsonElement(jsonObj.get("request_status"));
      }
      if ((jsonObj.get("extra_info") != null && !jsonObj.get("extra_info").isJsonNull()) && !jsonObj.get("extra_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra_info").toString()));
      }
      if ((jsonObj.get("failed_reason") != null && !jsonObj.get("failed_reason").isJsonNull()) && !jsonObj.get("failed_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failed_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failed_reason").toString()));
      }
      // validate the optional field `request_detail`
      if (jsonObj.get("request_detail") != null && !jsonObj.get("request_detail").isJsonNull()) {
        TSSKeyReshareRequest.validateJsonElement(jsonObj.get("request_detail"));
      }
      // validate the optional field `result`
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        TSSGroup.validateJsonElement(jsonObj.get("result"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TSSKeyReshareEventData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TSSKeyReshareEventData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TSSKeyReshareEventData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TSSKeyReshareEventData.class));

       return (TypeAdapter<T>) new TypeAdapter<TSSKeyReshareEventData>() {
           @Override
           public void write(JsonWriter out, TSSKeyReshareEventData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() == null)
                   obj.addProperty(entry.getKey(), (String) null);
                 else if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public TSSKeyReshareEventData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TSSKeyReshareEventData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TSSKeyReshareEventData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TSSKeyReshareEventData
  * @throws IOException if the JSON string is invalid with respect to TSSKeyReshareEventData
  */
  public static TSSKeyReshareEventData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TSSKeyReshareEventData.class);
  }

 /**
  * Convert an instance of TSSKeyReshareEventData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

