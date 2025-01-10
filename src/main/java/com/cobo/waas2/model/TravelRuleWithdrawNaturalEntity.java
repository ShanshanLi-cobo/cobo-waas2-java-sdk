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
import com.cobo.waas2.model.SelectedEntityType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
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
 * The required information of a natural person.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TravelRuleWithdrawNaturalEntity {
  public static final String SERIALIZED_NAME_SELECTED_ENTITY_TYPE = "selected_entity_type";
  @SerializedName(SERIALIZED_NAME_SELECTED_ENTITY_TYPE)
  private SelectedEntityType selectedEntityType;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_PLACE_OF_BIRTH = "place_of_birth";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_BIRTH)
  private String placeOfBirth;

  public TravelRuleWithdrawNaturalEntity() {
  }

  public TravelRuleWithdrawNaturalEntity selectedEntityType(SelectedEntityType selectedEntityType) {
    this.selectedEntityType = selectedEntityType;
    return this;
  }

   /**
   * Get selectedEntityType
   * @return selectedEntityType
  **/
  @javax.annotation.Nonnull
  public SelectedEntityType getSelectedEntityType() {
    return selectedEntityType;
  }

  public void setSelectedEntityType(SelectedEntityType selectedEntityType) {
    this.selectedEntityType = selectedEntityType;
  }


  public TravelRuleWithdrawNaturalEntity firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the natural person.
   * @return firstName
  **/
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public TravelRuleWithdrawNaturalEntity lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the natural person.
   * @return lastName
  **/
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public TravelRuleWithdrawNaturalEntity dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth of the natural person.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public TravelRuleWithdrawNaturalEntity placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

   /**
   * The place of birth of the natural person.
   * @return placeOfBirth
  **/
  @javax.annotation.Nullable
  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
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
   * @return the TravelRuleWithdrawNaturalEntity instance itself
   */
  public TravelRuleWithdrawNaturalEntity putAdditionalProperty(String key, Object value) {
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
    TravelRuleWithdrawNaturalEntity travelRuleWithdrawNaturalEntity = (TravelRuleWithdrawNaturalEntity) o;
    return Objects.equals(this.selectedEntityType, travelRuleWithdrawNaturalEntity.selectedEntityType) &&
        Objects.equals(this.firstName, travelRuleWithdrawNaturalEntity.firstName) &&
        Objects.equals(this.lastName, travelRuleWithdrawNaturalEntity.lastName) &&
        Objects.equals(this.dateOfBirth, travelRuleWithdrawNaturalEntity.dateOfBirth) &&
        Objects.equals(this.placeOfBirth, travelRuleWithdrawNaturalEntity.placeOfBirth)&&
        Objects.equals(this.additionalProperties, travelRuleWithdrawNaturalEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedEntityType, firstName, lastName, dateOfBirth, placeOfBirth, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRuleWithdrawNaturalEntity {\n");
    sb.append("    selectedEntityType: ").append(toIndentedString(selectedEntityType)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
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
    openapiFields.add("selected_entity_type");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("date_of_birth");
    openapiFields.add("place_of_birth");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("selected_entity_type");
    openapiRequiredFields.add("first_name");
    openapiRequiredFields.add("last_name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TravelRuleWithdrawNaturalEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TravelRuleWithdrawNaturalEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TravelRuleWithdrawNaturalEntity is not found in the empty JSON string", TravelRuleWithdrawNaturalEntity.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TravelRuleWithdrawNaturalEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `selected_entity_type`
      SelectedEntityType.validateJsonElement(jsonObj.get("selected_entity_type"));
      if (!jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if (!jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("place_of_birth") != null && !jsonObj.get("place_of_birth").isJsonNull()) && !jsonObj.get("place_of_birth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_of_birth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_of_birth").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TravelRuleWithdrawNaturalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TravelRuleWithdrawNaturalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TravelRuleWithdrawNaturalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TravelRuleWithdrawNaturalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<TravelRuleWithdrawNaturalEntity>() {
           @Override
           public void write(JsonWriter out, TravelRuleWithdrawNaturalEntity value) throws IOException {
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
           public TravelRuleWithdrawNaturalEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TravelRuleWithdrawNaturalEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TravelRuleWithdrawNaturalEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TravelRuleWithdrawNaturalEntity
  * @throws IOException if the JSON string is invalid with respect to TravelRuleWithdrawNaturalEntity
  */
  public static TravelRuleWithdrawNaturalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TravelRuleWithdrawNaturalEntity.class);
  }

 /**
  * Convert an instance of TravelRuleWithdrawNaturalEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

