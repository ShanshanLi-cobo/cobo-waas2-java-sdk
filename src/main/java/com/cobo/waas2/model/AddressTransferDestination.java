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
import com.cobo.waas2.model.AddressTransferDestinationAccountOutput;
import com.cobo.waas2.model.AddressTransferDestinationUtxoOutputsInner;
import com.cobo.waas2.model.TransferDestinationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * The information about the transaction destination type &#x60;Address&#x60;.   Specify either the &#x60;account_output&#x60; property or the &#x60;utxo_outputs&#x60; property. You can transfer tokens to multiple addresses only if you use MPC Wallets as the transaction source. You should use the &#x60;utxo_outputs&#x60; property to specify the destination addresses. 
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class AddressTransferDestination {
  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destination_type";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private TransferDestinationType destinationType;

  public static final String SERIALIZED_NAME_ACCOUNT_OUTPUT = "account_output";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OUTPUT)
  private AddressTransferDestinationAccountOutput accountOutput;

  public static final String SERIALIZED_NAME_UTXO_OUTPUTS = "utxo_outputs";
  @SerializedName(SERIALIZED_NAME_UTXO_OUTPUTS)
  private List<AddressTransferDestinationUtxoOutputsInner> utxoOutputs = new ArrayList<>();

  public static final String SERIALIZED_NAME_CHANGE_ADDRESS = "change_address";
  @SerializedName(SERIALIZED_NAME_CHANGE_ADDRESS)
  private String changeAddress;

  public static final String SERIALIZED_NAME_FORCE_INTERNAL = "force_internal";
  @SerializedName(SERIALIZED_NAME_FORCE_INTERNAL)
  private Boolean forceInternal;

  public static final String SERIALIZED_NAME_FORCE_EXTERNAL = "force_external";
  @SerializedName(SERIALIZED_NAME_FORCE_EXTERNAL)
  private Boolean forceExternal;

  public AddressTransferDestination() {
  }

  public AddressTransferDestination destinationType(TransferDestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nonnull
  public TransferDestinationType getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(TransferDestinationType destinationType) {
    this.destinationType = destinationType;
  }


  public AddressTransferDestination accountOutput(AddressTransferDestinationAccountOutput accountOutput) {
    this.accountOutput = accountOutput;
    return this;
  }

   /**
   * Get accountOutput
   * @return accountOutput
  **/
  @javax.annotation.Nullable
  public AddressTransferDestinationAccountOutput getAccountOutput() {
    return accountOutput;
  }

  public void setAccountOutput(AddressTransferDestinationAccountOutput accountOutput) {
    this.accountOutput = accountOutput;
  }


  public AddressTransferDestination utxoOutputs(List<AddressTransferDestinationUtxoOutputsInner> utxoOutputs) {
    this.utxoOutputs = utxoOutputs;
    return this;
  }

  public AddressTransferDestination addUtxoOutputsItem(AddressTransferDestinationUtxoOutputsInner utxoOutputsItem) {
    if (this.utxoOutputs == null) {
      this.utxoOutputs = new ArrayList<>();
    }
    this.utxoOutputs.add(utxoOutputsItem);
    return this;
  }

   /**
   * Get utxoOutputs
   * @return utxoOutputs
  **/
  @javax.annotation.Nullable
  public List<AddressTransferDestinationUtxoOutputsInner> getUtxoOutputs() {
    return utxoOutputs;
  }

  public void setUtxoOutputs(List<AddressTransferDestinationUtxoOutputsInner> utxoOutputs) {
    this.utxoOutputs = utxoOutputs;
  }


  public AddressTransferDestination changeAddress(String changeAddress) {
    this.changeAddress = changeAddress;
    return this;
  }

   /**
   * The address used to receive the remaining funds or change from the transaction.
   * @return changeAddress
  **/
  @javax.annotation.Nullable
  public String getChangeAddress() {
    return changeAddress;
  }

  public void setChangeAddress(String changeAddress) {
    this.changeAddress = changeAddress;
  }


  public AddressTransferDestination forceInternal(Boolean forceInternal) {
    this.forceInternal = forceInternal;
    return this;
  }

   /**
   * Whether the transaction request must be executed as a Loop transfer. For more information about Loop, see [Loop&#39;s website](https://loop.top/).   - &#x60;true&#x60;: The transaction request must be executed as a Loop transfer.   - &#x60;false&#x60;: The transaction request may not be executed as a Loop transfer. &lt;Note&gt;Please do not set both &#x60;force_internal&#x60; and &#x60;force_internal&#x60; as &#x60;true&#x60;.&lt;/Note&gt; 
   * @return forceInternal
  **/
  @javax.annotation.Nullable
  public Boolean getForceInternal() {
    return forceInternal;
  }

  public void setForceInternal(Boolean forceInternal) {
    this.forceInternal = forceInternal;
  }


  public AddressTransferDestination forceExternal(Boolean forceExternal) {
    this.forceExternal = forceExternal;
    return this;
  }

   /**
   * Whether the transaction request must not be executed as a Loop transfer. For more information about Loop, see [Loop&#39;s website](https://loop.top/).   - &#x60;true&#x60;: The transaction request must not be executed as a Loop transfer.   - &#x60;false&#x60;: The transaction request can be executed as a Loop transfer. &lt;Note&gt;Please do not set both &#x60;force_internal&#x60; and &#x60;force_internal&#x60; as &#x60;true&#x60;.&lt;/Note&gt; 
   * @return forceExternal
  **/
  @javax.annotation.Nullable
  public Boolean getForceExternal() {
    return forceExternal;
  }

  public void setForceExternal(Boolean forceExternal) {
    this.forceExternal = forceExternal;
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
   * @return the AddressTransferDestination instance itself
   */
  public AddressTransferDestination putAdditionalProperty(String key, Object value) {
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
    AddressTransferDestination addressTransferDestination = (AddressTransferDestination) o;
    return Objects.equals(this.destinationType, addressTransferDestination.destinationType) &&
        Objects.equals(this.accountOutput, addressTransferDestination.accountOutput) &&
        Objects.equals(this.utxoOutputs, addressTransferDestination.utxoOutputs) &&
        Objects.equals(this.changeAddress, addressTransferDestination.changeAddress) &&
        Objects.equals(this.forceInternal, addressTransferDestination.forceInternal) &&
        Objects.equals(this.forceExternal, addressTransferDestination.forceExternal)&&
        Objects.equals(this.additionalProperties, addressTransferDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationType, accountOutput, utxoOutputs, changeAddress, forceInternal, forceExternal, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTransferDestination {\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    accountOutput: ").append(toIndentedString(accountOutput)).append("\n");
    sb.append("    utxoOutputs: ").append(toIndentedString(utxoOutputs)).append("\n");
    sb.append("    changeAddress: ").append(toIndentedString(changeAddress)).append("\n");
    sb.append("    forceInternal: ").append(toIndentedString(forceInternal)).append("\n");
    sb.append("    forceExternal: ").append(toIndentedString(forceExternal)).append("\n");
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
    openapiFields.add("destination_type");
    openapiFields.add("account_output");
    openapiFields.add("utxo_outputs");
    openapiFields.add("change_address");
    openapiFields.add("force_internal");
    openapiFields.add("force_external");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destination_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressTransferDestination
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressTransferDestination.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressTransferDestination is not found in the empty JSON string", AddressTransferDestination.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddressTransferDestination.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `destination_type`
      TransferDestinationType.validateJsonElement(jsonObj.get("destination_type"));
      // validate the optional field `account_output`
      if (jsonObj.get("account_output") != null && !jsonObj.get("account_output").isJsonNull()) {
        AddressTransferDestinationAccountOutput.validateJsonElement(jsonObj.get("account_output"));
      }
      if (jsonObj.get("utxo_outputs") != null && !jsonObj.get("utxo_outputs").isJsonNull()) {
        JsonArray jsonArrayutxoOutputs = jsonObj.getAsJsonArray("utxo_outputs");
        if (jsonArrayutxoOutputs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("utxo_outputs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `utxo_outputs` to be an array in the JSON string but got `%s`", jsonObj.get("utxo_outputs").toString()));
          }

          // validate the optional field `utxo_outputs` (array)
          for (int i = 0; i < jsonArrayutxoOutputs.size(); i++) {
            AddressTransferDestinationUtxoOutputsInner.validateJsonElement(jsonArrayutxoOutputs.get(i));
          };
        }
      }
      if ((jsonObj.get("change_address") != null && !jsonObj.get("change_address").isJsonNull()) && !jsonObj.get("change_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `change_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("change_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressTransferDestination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressTransferDestination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressTransferDestination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressTransferDestination.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressTransferDestination>() {
           @Override
           public void write(JsonWriter out, AddressTransferDestination value) throws IOException {
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
           public AddressTransferDestination read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             AddressTransferDestination instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddressTransferDestination given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressTransferDestination
  * @throws IOException if the JSON string is invalid with respect to AddressTransferDestination
  */
  public static AddressTransferDestination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressTransferDestination.class);
  }

 /**
  * Convert an instance of AddressTransferDestination to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

