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
 * The information about a method in a smart contract.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionEvmContractMethod {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SIG = "sig";
  @SerializedName(SERIALIZED_NAME_SIG)
  private String sig;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PAYABLE = "payable";
  @SerializedName(SERIALIZED_NAME_PAYABLE)
  private Boolean payable;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private String selector;

  public TransactionEvmContractMethod() {
  }

  public TransactionEvmContractMethod name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The method name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public TransactionEvmContractMethod sig(String sig) {
    this.sig = sig;
    return this;
  }

   /**
   * The signature of the method, which includes the method name and parameter types.
   * @return sig
  **/
  @javax.annotation.Nullable
  public String getSig() {
    return sig;
  }

  public void setSig(String sig) {
    this.sig = sig;
  }


  public TransactionEvmContractMethod type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The method type.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public TransactionEvmContractMethod payable(Boolean payable) {
    this.payable = payable;
    return this;
  }

   /**
   * Whether the method is payable, which means it can receive tokens along with the transaction. - &#x60;true&#x60;: The method is payable. - &#x60;false&#x60;: The method is not payable. 
   * @return payable
  **/
  @javax.annotation.Nullable
  public Boolean getPayable() {
    return payable;
  }

  public void setPayable(Boolean payable) {
    this.payable = payable;
  }


  public TransactionEvmContractMethod selector(String selector) {
    this.selector = selector;
    return this;
  }

   /**
   * The method selector, a four-byte identifier derived from the method&#39;s signature, used to invoke the method in a transaction.
   * @return selector
  **/
  @javax.annotation.Nullable
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
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
   * @return the TransactionEvmContractMethod instance itself
   */
  public TransactionEvmContractMethod putAdditionalProperty(String key, Object value) {
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
    TransactionEvmContractMethod transactionEvmContractMethod = (TransactionEvmContractMethod) o;
    return Objects.equals(this.name, transactionEvmContractMethod.name) &&
        Objects.equals(this.sig, transactionEvmContractMethod.sig) &&
        Objects.equals(this.type, transactionEvmContractMethod.type) &&
        Objects.equals(this.payable, transactionEvmContractMethod.payable) &&
        Objects.equals(this.selector, transactionEvmContractMethod.selector)&&
        Objects.equals(this.additionalProperties, transactionEvmContractMethod.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sig, type, payable, selector, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionEvmContractMethod {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sig: ").append(toIndentedString(sig)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payable: ").append(toIndentedString(payable)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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
    openapiFields.add("sig");
    openapiFields.add("type");
    openapiFields.add("payable");
    openapiFields.add("selector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionEvmContractMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionEvmContractMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionEvmContractMethod is not found in the empty JSON string", TransactionEvmContractMethod.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("sig") != null && !jsonObj.get("sig").isJsonNull()) && !jsonObj.get("sig").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sig` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sig").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("selector") != null && !jsonObj.get("selector").isJsonNull()) && !jsonObj.get("selector").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selector` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selector").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionEvmContractMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionEvmContractMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionEvmContractMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionEvmContractMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionEvmContractMethod>() {
           @Override
           public void write(JsonWriter out, TransactionEvmContractMethod value) throws IOException {
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
           public TransactionEvmContractMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionEvmContractMethod instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionEvmContractMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionEvmContractMethod
  * @throws IOException if the JSON string is invalid with respect to TransactionEvmContractMethod
  */
  public static TransactionEvmContractMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionEvmContractMethod.class);
  }

 /**
  * Convert an instance of TransactionEvmContractMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
