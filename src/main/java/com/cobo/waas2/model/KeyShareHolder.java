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
import com.cobo.waas2.model.KeyShareHolderStatus;
import com.cobo.waas2.model.KeyShareHolderType;
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
 * The data for MPC Wallets&#39; key share holder information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class KeyShareHolder {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private KeyShareHolderType type;

  public static final String SERIALIZED_NAME_TSS_NODE_ID = "tss_node_id";
  @SerializedName(SERIALIZED_NAME_TSS_NODE_ID)
  private String tssNodeId;

  public static final String SERIALIZED_NAME_ONLINE = "online";
  @SerializedName(SERIALIZED_NAME_ONLINE)
  private Boolean online;

  public static final String SERIALIZED_NAME_SIGNER = "signer";
  @SerializedName(SERIALIZED_NAME_SIGNER)
  private Boolean signer;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private KeyShareHolderStatus status;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public KeyShareHolder() {
  }

  public KeyShareHolder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The key share holder name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public KeyShareHolder type(KeyShareHolderType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public KeyShareHolderType getType() {
    return type;
  }

  public void setType(KeyShareHolderType type) {
    this.type = type;
  }


  public KeyShareHolder tssNodeId(String tssNodeId) {
    this.tssNodeId = tssNodeId;
    return this;
  }

   /**
   * The key share holder&#39;s TSS Node ID.
   * @return tssNodeId
  **/
  @javax.annotation.Nullable
  public String getTssNodeId() {
    return tssNodeId;
  }

  public void setTssNodeId(String tssNodeId) {
    this.tssNodeId = tssNodeId;
  }


  public KeyShareHolder online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * Whether the key share holder&#39;s TSS Node is online. - &#x60;true&#x60;: The TSS Node is online.  - &#x60;false&#x60;: The TSS Node is offline. 
   * @return online
  **/
  @javax.annotation.Nullable
  public Boolean getOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }


  public KeyShareHolder signer(Boolean signer) {
    this.signer = signer;
    return this;
  }

   /**
   * Whether the key share holder has been selected as the designated transaction signer. For example, in a 2-3 [Threshold Signature Scheme (TSS)](https://manuals.cobo.com/en/portal/mpc-wallets/introduction#threshold-signature-scheme-tss), Cobo will serve as one signer, and you can choose one of the other two key share holders to act as the second transaction signer. - &#x60;true&#x60;: The key share holder is a designated transaction signer.  - &#x60;false&#x60;: The key share holder is not a designated transaction signer. 
   * @return signer
  **/
  @javax.annotation.Nullable
  public Boolean getSigner() {
    return signer;
  }

  public void setSigner(Boolean signer) {
    this.signer = signer;
  }


  public KeyShareHolder status(KeyShareHolderStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public KeyShareHolderStatus getStatus() {
    return status;
  }

  public void setStatus(KeyShareHolderStatus status) {
    this.status = status;
  }


  public KeyShareHolder accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The key share holder&#39;s Cobo Portal account ID.
   * @return accountId
  **/
  @javax.annotation.Nullable
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
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
   * @return the KeyShareHolder instance itself
   */
  public KeyShareHolder putAdditionalProperty(String key, Object value) {
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
    KeyShareHolder keyShareHolder = (KeyShareHolder) o;
    return Objects.equals(this.name, keyShareHolder.name) &&
        Objects.equals(this.type, keyShareHolder.type) &&
        Objects.equals(this.tssNodeId, keyShareHolder.tssNodeId) &&
        Objects.equals(this.online, keyShareHolder.online) &&
        Objects.equals(this.signer, keyShareHolder.signer) &&
        Objects.equals(this.status, keyShareHolder.status) &&
        Objects.equals(this.accountId, keyShareHolder.accountId)&&
        Objects.equals(this.additionalProperties, keyShareHolder.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, tssNodeId, online, signer, status, accountId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyShareHolder {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tssNodeId: ").append(toIndentedString(tssNodeId)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("tss_node_id");
    openapiFields.add("online");
    openapiFields.add("signer");
    openapiFields.add("status");
    openapiFields.add("account_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to KeyShareHolder
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!KeyShareHolder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyShareHolder is not found in the empty JSON string", KeyShareHolder.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        KeyShareHolderType.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("tss_node_id") != null && !jsonObj.get("tss_node_id").isJsonNull()) && !jsonObj.get("tss_node_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tss_node_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tss_node_id").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        KeyShareHolderStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull()) && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyShareHolder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyShareHolder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyShareHolder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyShareHolder.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyShareHolder>() {
           @Override
           public void write(JsonWriter out, KeyShareHolder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
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
           public KeyShareHolder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             KeyShareHolder instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of KeyShareHolder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyShareHolder
  * @throws IOException if the JSON string is invalid with respect to KeyShareHolder
  */
  public static KeyShareHolder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyShareHolder.class);
  }

 /**
  * Convert an instance of KeyShareHolder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

