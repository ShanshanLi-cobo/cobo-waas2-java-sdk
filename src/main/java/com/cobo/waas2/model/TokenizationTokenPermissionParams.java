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
 * Role-based permission settings for token contract. If not provided, all permissions will be granted to the issuance wallet by default.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TokenizationTokenPermissionParams {
  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private List<String> admin = new ArrayList<>();

  public static final String SERIALIZED_NAME_MINTER = "minter";
  @SerializedName(SERIALIZED_NAME_MINTER)
  private List<String> minter = new ArrayList<>();

  public static final String SERIALIZED_NAME_BURNER = "burner";
  @SerializedName(SERIALIZED_NAME_BURNER)
  private List<String> burner = new ArrayList<>();

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private List<String> manager = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAUSER = "pauser";
  @SerializedName(SERIALIZED_NAME_PAUSER)
  private List<String> pauser = new ArrayList<>();

  public static final String SERIALIZED_NAME_SALVAGER = "salvager";
  @SerializedName(SERIALIZED_NAME_SALVAGER)
  private List<String> salvager = new ArrayList<>();

  public static final String SERIALIZED_NAME_UPGRADER = "upgrader";
  @SerializedName(SERIALIZED_NAME_UPGRADER)
  private List<String> upgrader = new ArrayList<>();

  public TokenizationTokenPermissionParams() {
  }

  public TokenizationTokenPermissionParams admin(List<String> admin) {
    this.admin = admin;
    return this;
  }

  public TokenizationTokenPermissionParams addAdminItem(String adminItem) {
    if (this.admin == null) {
      this.admin = new ArrayList<>();
    }
    this.admin.add(adminItem);
    return this;
  }

   /**
   * List of addresses for the admin role.
   * @return admin
  **/
  @javax.annotation.Nullable
  public List<String> getAdmin() {
    return admin;
  }

  public void setAdmin(List<String> admin) {
    this.admin = admin;
  }


  public TokenizationTokenPermissionParams minter(List<String> minter) {
    this.minter = minter;
    return this;
  }

  public TokenizationTokenPermissionParams addMinterItem(String minterItem) {
    if (this.minter == null) {
      this.minter = new ArrayList<>();
    }
    this.minter.add(minterItem);
    return this;
  }

   /**
   * List of addresses for the minter role.
   * @return minter
  **/
  @javax.annotation.Nullable
  public List<String> getMinter() {
    return minter;
  }

  public void setMinter(List<String> minter) {
    this.minter = minter;
  }


  public TokenizationTokenPermissionParams burner(List<String> burner) {
    this.burner = burner;
    return this;
  }

  public TokenizationTokenPermissionParams addBurnerItem(String burnerItem) {
    if (this.burner == null) {
      this.burner = new ArrayList<>();
    }
    this.burner.add(burnerItem);
    return this;
  }

   /**
   * List of addresses for the burner role.
   * @return burner
  **/
  @javax.annotation.Nullable
  public List<String> getBurner() {
    return burner;
  }

  public void setBurner(List<String> burner) {
    this.burner = burner;
  }


  public TokenizationTokenPermissionParams manager(List<String> manager) {
    this.manager = manager;
    return this;
  }

  public TokenizationTokenPermissionParams addManagerItem(String managerItem) {
    if (this.manager == null) {
      this.manager = new ArrayList<>();
    }
    this.manager.add(managerItem);
    return this;
  }

   /**
   * List of addresses for the manager role.
   * @return manager
  **/
  @javax.annotation.Nullable
  public List<String> getManager() {
    return manager;
  }

  public void setManager(List<String> manager) {
    this.manager = manager;
  }


  public TokenizationTokenPermissionParams pauser(List<String> pauser) {
    this.pauser = pauser;
    return this;
  }

  public TokenizationTokenPermissionParams addPauserItem(String pauserItem) {
    if (this.pauser == null) {
      this.pauser = new ArrayList<>();
    }
    this.pauser.add(pauserItem);
    return this;
  }

   /**
   * List of addresses for the pauser role.
   * @return pauser
  **/
  @javax.annotation.Nullable
  public List<String> getPauser() {
    return pauser;
  }

  public void setPauser(List<String> pauser) {
    this.pauser = pauser;
  }


  public TokenizationTokenPermissionParams salvager(List<String> salvager) {
    this.salvager = salvager;
    return this;
  }

  public TokenizationTokenPermissionParams addSalvagerItem(String salvagerItem) {
    if (this.salvager == null) {
      this.salvager = new ArrayList<>();
    }
    this.salvager.add(salvagerItem);
    return this;
  }

   /**
   * List of addresses for the salvager role.
   * @return salvager
  **/
  @javax.annotation.Nullable
  public List<String> getSalvager() {
    return salvager;
  }

  public void setSalvager(List<String> salvager) {
    this.salvager = salvager;
  }


  public TokenizationTokenPermissionParams upgrader(List<String> upgrader) {
    this.upgrader = upgrader;
    return this;
  }

  public TokenizationTokenPermissionParams addUpgraderItem(String upgraderItem) {
    if (this.upgrader == null) {
      this.upgrader = new ArrayList<>();
    }
    this.upgrader.add(upgraderItem);
    return this;
  }

   /**
   * List of addresses for the upgrader role.
   * @return upgrader
  **/
  @javax.annotation.Nullable
  public List<String> getUpgrader() {
    return upgrader;
  }

  public void setUpgrader(List<String> upgrader) {
    this.upgrader = upgrader;
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
   * @return the TokenizationTokenPermissionParams instance itself
   */
  public TokenizationTokenPermissionParams putAdditionalProperty(String key, Object value) {
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
    TokenizationTokenPermissionParams tokenizationTokenPermissionParams = (TokenizationTokenPermissionParams) o;
    return Objects.equals(this.admin, tokenizationTokenPermissionParams.admin) &&
        Objects.equals(this.minter, tokenizationTokenPermissionParams.minter) &&
        Objects.equals(this.burner, tokenizationTokenPermissionParams.burner) &&
        Objects.equals(this.manager, tokenizationTokenPermissionParams.manager) &&
        Objects.equals(this.pauser, tokenizationTokenPermissionParams.pauser) &&
        Objects.equals(this.salvager, tokenizationTokenPermissionParams.salvager) &&
        Objects.equals(this.upgrader, tokenizationTokenPermissionParams.upgrader)&&
        Objects.equals(this.additionalProperties, tokenizationTokenPermissionParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, minter, burner, manager, pauser, salvager, upgrader, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizationTokenPermissionParams {\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    minter: ").append(toIndentedString(minter)).append("\n");
    sb.append("    burner: ").append(toIndentedString(burner)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    pauser: ").append(toIndentedString(pauser)).append("\n");
    sb.append("    salvager: ").append(toIndentedString(salvager)).append("\n");
    sb.append("    upgrader: ").append(toIndentedString(upgrader)).append("\n");
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
    openapiFields.add("admin");
    openapiFields.add("minter");
    openapiFields.add("burner");
    openapiFields.add("manager");
    openapiFields.add("pauser");
    openapiFields.add("salvager");
    openapiFields.add("upgrader");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenizationTokenPermissionParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenizationTokenPermissionParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenizationTokenPermissionParams is not found in the empty JSON string", TokenizationTokenPermissionParams.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("admin") != null && !jsonObj.get("admin").isJsonNull() && !jsonObj.get("admin").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin` to be an array in the JSON string but got `%s`", jsonObj.get("admin").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("minter") != null && !jsonObj.get("minter").isJsonNull() && !jsonObj.get("minter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `minter` to be an array in the JSON string but got `%s`", jsonObj.get("minter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("burner") != null && !jsonObj.get("burner").isJsonNull() && !jsonObj.get("burner").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `burner` to be an array in the JSON string but got `%s`", jsonObj.get("burner").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("manager") != null && !jsonObj.get("manager").isJsonNull() && !jsonObj.get("manager").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `manager` to be an array in the JSON string but got `%s`", jsonObj.get("manager").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("pauser") != null && !jsonObj.get("pauser").isJsonNull() && !jsonObj.get("pauser").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pauser` to be an array in the JSON string but got `%s`", jsonObj.get("pauser").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("salvager") != null && !jsonObj.get("salvager").isJsonNull() && !jsonObj.get("salvager").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `salvager` to be an array in the JSON string but got `%s`", jsonObj.get("salvager").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("upgrader") != null && !jsonObj.get("upgrader").isJsonNull() && !jsonObj.get("upgrader").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `upgrader` to be an array in the JSON string but got `%s`", jsonObj.get("upgrader").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenizationTokenPermissionParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenizationTokenPermissionParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenizationTokenPermissionParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenizationTokenPermissionParams.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenizationTokenPermissionParams>() {
           @Override
           public void write(JsonWriter out, TokenizationTokenPermissionParams value) throws IOException {
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
           public TokenizationTokenPermissionParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TokenizationTokenPermissionParams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TokenizationTokenPermissionParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenizationTokenPermissionParams
  * @throws IOException if the JSON string is invalid with respect to TokenizationTokenPermissionParams
  */
  public static TokenizationTokenPermissionParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenizationTokenPermissionParams.class);
  }

 /**
  * Convert an instance of TokenizationTokenPermissionParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

