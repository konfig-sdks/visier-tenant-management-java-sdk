/*
 * Visier Tenant Management APIs
 * Visier APIs for managing tenants
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.TenantDetailAPIDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * AllTenantsStatusAPIDTO
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AllTenantsStatusAPIDTO {
  public static final String SERIALIZED_NAME_TENANTS = "tenants";
  @SerializedName(SERIALIZED_NAME_TENANTS)
  private List<TenantDetailAPIDTO> tenants = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public AllTenantsStatusAPIDTO() {
  }

  public AllTenantsStatusAPIDTO tenants(List<TenantDetailAPIDTO> tenants) {
    
    
    
    
    this.tenants = tenants;
    return this;
  }

  public AllTenantsStatusAPIDTO addTenantsItem(TenantDetailAPIDTO tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new ArrayList<>();
    }
    this.tenants.add(tenantsItem);
    return this;
  }

   /**
   * A list of objects representing all the analytic tenants.
   * @return tenants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing all the analytic tenants.")

  public List<TenantDetailAPIDTO> getTenants() {
    return tenants;
  }


  public void setTenants(List<TenantDetailAPIDTO> tenants) {
    
    
    
    this.tenants = tenants;
  }


  public AllTenantsStatusAPIDTO limit(Integer limit) {
    
    
    
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit of analytic tenants to return. The maximum value is 1000.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The limit of analytic tenants to return. The maximum value is 1000.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    
    
    
    this.limit = limit;
  }


  public AllTenantsStatusAPIDTO start(Integer start) {
    
    
    
    
    this.start = start;
    return this;
  }

   /**
   * The index to start retrieving values from, also known as offset. The index begins at 0.
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index to start retrieving values from, also known as offset. The index begins at 0.")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    
    
    
    this.start = start;
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
   * @return the AllTenantsStatusAPIDTO instance itself
   */
  public AllTenantsStatusAPIDTO putAdditionalProperty(String key, Object value) {
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
    AllTenantsStatusAPIDTO allTenantsStatusAPIDTO = (AllTenantsStatusAPIDTO) o;
    return Objects.equals(this.tenants, allTenantsStatusAPIDTO.tenants) &&
        Objects.equals(this.limit, allTenantsStatusAPIDTO.limit) &&
        Objects.equals(this.start, allTenantsStatusAPIDTO.start)&&
        Objects.equals(this.additionalProperties, allTenantsStatusAPIDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenants, limit, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllTenantsStatusAPIDTO {\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
    openapiFields.add("tenants");
    openapiFields.add("limit");
    openapiFields.add("start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AllTenantsStatusAPIDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AllTenantsStatusAPIDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AllTenantsStatusAPIDTO is not found in the empty JSON string", AllTenantsStatusAPIDTO.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("tenants") != null && !jsonObj.get("tenants").isJsonNull()) {
        JsonArray jsonArraytenants = jsonObj.getAsJsonArray("tenants");
        if (jsonArraytenants != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tenants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tenants` to be an array in the JSON string but got `%s`", jsonObj.get("tenants").toString()));
          }

          // validate the optional field `tenants` (array)
          for (int i = 0; i < jsonArraytenants.size(); i++) {
            TenantDetailAPIDTO.validateJsonObject(jsonArraytenants.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AllTenantsStatusAPIDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AllTenantsStatusAPIDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AllTenantsStatusAPIDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AllTenantsStatusAPIDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AllTenantsStatusAPIDTO>() {
           @Override
           public void write(JsonWriter out, AllTenantsStatusAPIDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AllTenantsStatusAPIDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AllTenantsStatusAPIDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AllTenantsStatusAPIDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AllTenantsStatusAPIDTO
  * @throws IOException if the JSON string is invalid with respect to AllTenantsStatusAPIDTO
  */
  public static AllTenantsStatusAPIDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllTenantsStatusAPIDTO.class);
  }

 /**
  * Convert an instance of AllTenantsStatusAPIDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

