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
import com.cobo.waas2.model.ActivityType;
import com.cobo.waas2.model.StakingPoolType;
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
 * BabylonStakingActivityDetailExtra
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class BabylonStakingActivityDetailExtra {
  public static final String SERIALIZED_NAME_POOL_TYPE = "pool_type";
  @SerializedName(SERIALIZED_NAME_POOL_TYPE)
  private StakingPoolType poolType;

  public static final String SERIALIZED_NAME_FINALITY_PROVIDER_PUBLIC_KEY = "finality_provider_public_key";
  @SerializedName(SERIALIZED_NAME_FINALITY_PROVIDER_PUBLIC_KEY)
  private String finalityProviderPublicKey;

  public static final String SERIALIZED_NAME_STAKE_BLOCK_TIME = "stake_block_time";
  @SerializedName(SERIALIZED_NAME_STAKE_BLOCK_TIME)
  private Long stakeBlockTime;

  public static final String SERIALIZED_NAME_AUTO_BROADCAST = "auto_broadcast";
  @SerializedName(SERIALIZED_NAME_AUTO_BROADCAST)
  private Boolean autoBroadcast;

  public static final String SERIALIZED_NAME_PARAM_VERSION = "param_version";
  @SerializedName(SERIALIZED_NAME_PARAM_VERSION)
  private Long paramVersion;

  public static final String SERIALIZED_NAME_WITHDRAW_FROM_TYPE = "withdraw_from_type";
  @SerializedName(SERIALIZED_NAME_WITHDRAW_FROM_TYPE)
  private ActivityType withdrawFromType;

  public BabylonStakingActivityDetailExtra() {
  }

  public BabylonStakingActivityDetailExtra poolType(StakingPoolType poolType) {
    this.poolType = poolType;
    return this;
  }

   /**
   * Get poolType
   * @return poolType
  **/
  @javax.annotation.Nonnull
  public StakingPoolType getPoolType() {
    return poolType;
  }

  public void setPoolType(StakingPoolType poolType) {
    this.poolType = poolType;
  }


  public BabylonStakingActivityDetailExtra finalityProviderPublicKey(String finalityProviderPublicKey) {
    this.finalityProviderPublicKey = finalityProviderPublicKey;
    return this;
  }

   /**
   * The public key of the finality provider.
   * @return finalityProviderPublicKey
  **/
  @javax.annotation.Nullable
  public String getFinalityProviderPublicKey() {
    return finalityProviderPublicKey;
  }

  public void setFinalityProviderPublicKey(String finalityProviderPublicKey) {
    this.finalityProviderPublicKey = finalityProviderPublicKey;
  }


  public BabylonStakingActivityDetailExtra stakeBlockTime(Long stakeBlockTime) {
    this.stakeBlockTime = stakeBlockTime;
    return this;
  }

   /**
   * The number of blocks that need to be processed before the locked tokens are unlocked and become accessible.
   * @return stakeBlockTime
  **/
  @javax.annotation.Nullable
  public Long getStakeBlockTime() {
    return stakeBlockTime;
  }

  public void setStakeBlockTime(Long stakeBlockTime) {
    this.stakeBlockTime = stakeBlockTime;
  }


  public BabylonStakingActivityDetailExtra autoBroadcast(Boolean autoBroadcast) {
    this.autoBroadcast = autoBroadcast;
    return this;
  }

   /**
   * Whether to automatically broadcast the transaction.  - &#x60;true&#x60;: Automatically broadcast the transaction. - &#x60;false&#x60;: The transaction will not be submitted to the blockchain automatically. You can call [Broadcast signed transactions](https://www.cobo.com/developers/v2/api-references/transactions/broadcast-signed-transactions) to broadcast the transaction to the blockchain, or retrieve the signed raw transaction data &#x60;raw_tx&#x60; by calling [Get transaction information](https://www.cobo.com/developers/v2/api-references/transactions/get-transaction-information) and broadcast it yourself. 
   * @return autoBroadcast
  **/
  @javax.annotation.Nullable
  public Boolean getAutoBroadcast() {
    return autoBroadcast;
  }

  public void setAutoBroadcast(Boolean autoBroadcast) {
    this.autoBroadcast = autoBroadcast;
  }


  public BabylonStakingActivityDetailExtra paramVersion(Long paramVersion) {
    this.paramVersion = paramVersion;
    return this;
  }

   /**
   * The version of babylon global parameters.
   * @return paramVersion
  **/
  @javax.annotation.Nullable
  public Long getParamVersion() {
    return paramVersion;
  }

  public void setParamVersion(Long paramVersion) {
    this.paramVersion = paramVersion;
  }


  public BabylonStakingActivityDetailExtra withdrawFromType(ActivityType withdrawFromType) {
    this.withdrawFromType = withdrawFromType;
    return this;
  }

   /**
   * Get withdrawFromType
   * @return withdrawFromType
  **/
  @javax.annotation.Nullable
  public ActivityType getWithdrawFromType() {
    return withdrawFromType;
  }

  public void setWithdrawFromType(ActivityType withdrawFromType) {
    this.withdrawFromType = withdrawFromType;
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
   * @return the BabylonStakingActivityDetailExtra instance itself
   */
  public BabylonStakingActivityDetailExtra putAdditionalProperty(String key, Object value) {
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
    BabylonStakingActivityDetailExtra babylonStakingActivityDetailExtra = (BabylonStakingActivityDetailExtra) o;
    return Objects.equals(this.poolType, babylonStakingActivityDetailExtra.poolType) &&
        Objects.equals(this.finalityProviderPublicKey, babylonStakingActivityDetailExtra.finalityProviderPublicKey) &&
        Objects.equals(this.stakeBlockTime, babylonStakingActivityDetailExtra.stakeBlockTime) &&
        Objects.equals(this.autoBroadcast, babylonStakingActivityDetailExtra.autoBroadcast) &&
        Objects.equals(this.paramVersion, babylonStakingActivityDetailExtra.paramVersion) &&
        Objects.equals(this.withdrawFromType, babylonStakingActivityDetailExtra.withdrawFromType)&&
        Objects.equals(this.additionalProperties, babylonStakingActivityDetailExtra.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolType, finalityProviderPublicKey, stakeBlockTime, autoBroadcast, paramVersion, withdrawFromType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BabylonStakingActivityDetailExtra {\n");
    sb.append("    poolType: ").append(toIndentedString(poolType)).append("\n");
    sb.append("    finalityProviderPublicKey: ").append(toIndentedString(finalityProviderPublicKey)).append("\n");
    sb.append("    stakeBlockTime: ").append(toIndentedString(stakeBlockTime)).append("\n");
    sb.append("    autoBroadcast: ").append(toIndentedString(autoBroadcast)).append("\n");
    sb.append("    paramVersion: ").append(toIndentedString(paramVersion)).append("\n");
    sb.append("    withdrawFromType: ").append(toIndentedString(withdrawFromType)).append("\n");
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
    openapiFields.add("pool_type");
    openapiFields.add("finality_provider_public_key");
    openapiFields.add("stake_block_time");
    openapiFields.add("auto_broadcast");
    openapiFields.add("param_version");
    openapiFields.add("withdraw_from_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pool_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BabylonStakingActivityDetailExtra
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BabylonStakingActivityDetailExtra.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BabylonStakingActivityDetailExtra is not found in the empty JSON string", BabylonStakingActivityDetailExtra.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BabylonStakingActivityDetailExtra.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `pool_type`
      StakingPoolType.validateJsonElement(jsonObj.get("pool_type"));
      if ((jsonObj.get("finality_provider_public_key") != null && !jsonObj.get("finality_provider_public_key").isJsonNull()) && !jsonObj.get("finality_provider_public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finality_provider_public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finality_provider_public_key").toString()));
      }
      // validate the optional field `withdraw_from_type`
      if (jsonObj.get("withdraw_from_type") != null && !jsonObj.get("withdraw_from_type").isJsonNull()) {
        ActivityType.validateJsonElement(jsonObj.get("withdraw_from_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BabylonStakingActivityDetailExtra.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BabylonStakingActivityDetailExtra' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BabylonStakingActivityDetailExtra> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BabylonStakingActivityDetailExtra.class));

       return (TypeAdapter<T>) new TypeAdapter<BabylonStakingActivityDetailExtra>() {
           @Override
           public void write(JsonWriter out, BabylonStakingActivityDetailExtra value) throws IOException {
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
           public BabylonStakingActivityDetailExtra read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BabylonStakingActivityDetailExtra instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BabylonStakingActivityDetailExtra given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BabylonStakingActivityDetailExtra
  * @throws IOException if the JSON string is invalid with respect to BabylonStakingActivityDetailExtra
  */
  public static BabylonStakingActivityDetailExtra fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BabylonStakingActivityDetailExtra.class);
  }

 /**
  * Convert an instance of BabylonStakingActivityDetailExtra to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
