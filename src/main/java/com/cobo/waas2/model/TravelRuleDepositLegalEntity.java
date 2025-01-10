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
 * The required information of a legal entity.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TravelRuleDepositLegalEntity {
  /**
   * The entity type. Possible values include: - &#x60;LEGAL&#x60;: Legal entity. - &#x60;NATURAL&#x60;: Natural person. 
   */
  @JsonAdapter(SelectedEntityTypeEnum.Adapter.class)
  public enum SelectedEntityTypeEnum {
    LEGAL("LEGAL"),
    
    NATURAL("NATURAL");

    private String value;

    SelectedEntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SelectedEntityTypeEnum fromValue(String value) {
      for (SelectedEntityTypeEnum b : SelectedEntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SelectedEntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SelectedEntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SelectedEntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SelectedEntityTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SelectedEntityTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SELECTED_ENTITY_TYPE = "selected_entity_type";
  @SerializedName(SERIALIZED_NAME_SELECTED_ENTITY_TYPE)
  private SelectedEntityTypeEnum selectedEntityType;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_DATE_OF_INCORPORATION = "date_of_incorporation";
  @SerializedName(SERIALIZED_NAME_DATE_OF_INCORPORATION)
  private LocalDate dateOfIncorporation;

  public static final String SERIALIZED_NAME_PLACE_OF_INCORPORATION = "place_of_incorporation";
  @SerializedName(SERIALIZED_NAME_PLACE_OF_INCORPORATION)
  private String placeOfIncorporation;

  public TravelRuleDepositLegalEntity() {
  }

  public TravelRuleDepositLegalEntity selectedEntityType(SelectedEntityTypeEnum selectedEntityType) {
    this.selectedEntityType = selectedEntityType;
    return this;
  }

   /**
   * The entity type. Possible values include: - &#x60;LEGAL&#x60;: Legal entity. - &#x60;NATURAL&#x60;: Natural person. 
   * @return selectedEntityType
  **/
  @javax.annotation.Nonnull
  public SelectedEntityTypeEnum getSelectedEntityType() {
    return selectedEntityType;
  }

  public void setSelectedEntityType(SelectedEntityTypeEnum selectedEntityType) {
    this.selectedEntityType = selectedEntityType;
  }


  public TravelRuleDepositLegalEntity legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

   /**
   * The legal name of the entity.
   * @return legalName
  **/
  @javax.annotation.Nonnull
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public TravelRuleDepositLegalEntity dateOfIncorporation(LocalDate dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

   /**
   * The date of incorporation of the entity. This field is required when either of the following conditions is met: - &#x60;is_threshold_reached&#x60; is &#x60;true&#x60; in the response of the [Retrieve transaction limitations](https://www.cobo.com/developers/v2/api-references/travelrule/retrieve-transaction-limitations) operation. - &#x60;selected_entity_type&#x60; is &#x60;LEGAL&#x60;. 
   * @return dateOfIncorporation
  **/
  @javax.annotation.Nullable
  public LocalDate getDateOfIncorporation() {
    return dateOfIncorporation;
  }

  public void setDateOfIncorporation(LocalDate dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }


  public TravelRuleDepositLegalEntity placeOfIncorporation(String placeOfIncorporation) {
    this.placeOfIncorporation = placeOfIncorporation;
    return this;
  }

   /**
   * The place of incorporation of the entity. This field is required when either of the following conditions is met: - &#x60;is_threshold_reached&#x60; is &#x60;true&#x60; in the response of the [Retrieve transaction limitations](https://www.cobo.com/developers/v2/api-references/travelrule/retrieve-transaction-limitations) operation. - &#x60;selected_entity_type&#x60; is &#x60;LEGAL&#x60;. 
   * @return placeOfIncorporation
  **/
  @javax.annotation.Nullable
  public String getPlaceOfIncorporation() {
    return placeOfIncorporation;
  }

  public void setPlaceOfIncorporation(String placeOfIncorporation) {
    this.placeOfIncorporation = placeOfIncorporation;
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
   * @return the TravelRuleDepositLegalEntity instance itself
   */
  public TravelRuleDepositLegalEntity putAdditionalProperty(String key, Object value) {
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
    TravelRuleDepositLegalEntity travelRuleDepositLegalEntity = (TravelRuleDepositLegalEntity) o;
    return Objects.equals(this.selectedEntityType, travelRuleDepositLegalEntity.selectedEntityType) &&
        Objects.equals(this.legalName, travelRuleDepositLegalEntity.legalName) &&
        Objects.equals(this.dateOfIncorporation, travelRuleDepositLegalEntity.dateOfIncorporation) &&
        Objects.equals(this.placeOfIncorporation, travelRuleDepositLegalEntity.placeOfIncorporation)&&
        Objects.equals(this.additionalProperties, travelRuleDepositLegalEntity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedEntityType, legalName, dateOfIncorporation, placeOfIncorporation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRuleDepositLegalEntity {\n");
    sb.append("    selectedEntityType: ").append(toIndentedString(selectedEntityType)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    placeOfIncorporation: ").append(toIndentedString(placeOfIncorporation)).append("\n");
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
    openapiFields.add("legal_name");
    openapiFields.add("date_of_incorporation");
    openapiFields.add("place_of_incorporation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("selected_entity_type");
    openapiRequiredFields.add("legal_name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TravelRuleDepositLegalEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TravelRuleDepositLegalEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TravelRuleDepositLegalEntity is not found in the empty JSON string", TravelRuleDepositLegalEntity.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TravelRuleDepositLegalEntity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("selected_entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selected_entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selected_entity_type").toString()));
      }
      // validate the required field `selected_entity_type`
      SelectedEntityTypeEnum.validateJsonElement(jsonObj.get("selected_entity_type"));
      if (!jsonObj.get("legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name").toString()));
      }
      if ((jsonObj.get("place_of_incorporation") != null && !jsonObj.get("place_of_incorporation").isJsonNull()) && !jsonObj.get("place_of_incorporation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_of_incorporation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_of_incorporation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TravelRuleDepositLegalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TravelRuleDepositLegalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TravelRuleDepositLegalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TravelRuleDepositLegalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<TravelRuleDepositLegalEntity>() {
           @Override
           public void write(JsonWriter out, TravelRuleDepositLegalEntity value) throws IOException {
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
           public TravelRuleDepositLegalEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TravelRuleDepositLegalEntity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TravelRuleDepositLegalEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TravelRuleDepositLegalEntity
  * @throws IOException if the JSON string is invalid with respect to TravelRuleDepositLegalEntity
  */
  public static TravelRuleDepositLegalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TravelRuleDepositLegalEntity.class);
  }

 /**
  * Convert an instance of TravelRuleDepositLegalEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
