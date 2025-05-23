/*
 * GroupDocs.Rewriter API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 25.3.0
 * Contact: anton.perhunov@aspose.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.groupdocs.model;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * GenerateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-27T23:59:08.810160+03:00[Europe/Moscow]", comments = "Generator version: 7.12.0")
public class GenerateRequest {
  public static final String SERIALIZED_NAME_JOB_OFFER_URL = "jobOfferUrl";
  @SerializedName(SERIALIZED_NAME_JOB_OFFER_URL)
  @javax.annotation.Nonnull
  private String jobOfferUrl;

  public static final String SERIALIZED_NAME_CV_URL = "cvUrl";
  @SerializedName(SERIALIZED_NAME_CV_URL)
  @javax.annotation.Nullable
  private String cvUrl;

  public static final String SERIALIZED_NAME_COVER_LETTER_URL = "coverLetterUrl";
  @SerializedName(SERIALIZED_NAME_COVER_LETTER_URL)
  @javax.annotation.Nullable
  private String coverLetterUrl;

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  @javax.annotation.Nullable
  private String origin;

  public GenerateRequest() {
  }

  public GenerateRequest jobOfferUrl(@javax.annotation.Nonnull String jobOfferUrl) {
    this.jobOfferUrl = jobOfferUrl;
    return this;
  }

  /**
   * Link to job offer
   * @return jobOfferUrl
   */
  @javax.annotation.Nonnull
  public String getJobOfferUrl() {
    return jobOfferUrl;
  }

  public void setJobOfferUrl(@javax.annotation.Nonnull String jobOfferUrl) {
    this.jobOfferUrl = jobOfferUrl;
  }


  public GenerateRequest cvUrl(@javax.annotation.Nullable String cvUrl) {
    this.cvUrl = cvUrl;
    return this;
  }

  /**
   * Link to candidates CV
   * @return cvUrl
   */
  @javax.annotation.Nullable
  public String getCvUrl() {
    return cvUrl;
  }

  public void setCvUrl(@javax.annotation.Nullable String cvUrl) {
    this.cvUrl = cvUrl;
  }


  public GenerateRequest coverLetterUrl(@javax.annotation.Nullable String coverLetterUrl) {
    this.coverLetterUrl = coverLetterUrl;
    return this;
  }

  /**
   * Link to candidates cover letter
   * @return coverLetterUrl
   */
  @javax.annotation.Nullable
  public String getCoverLetterUrl() {
    return coverLetterUrl;
  }

  public void setCoverLetterUrl(@javax.annotation.Nullable String coverLetterUrl) {
    this.coverLetterUrl = coverLetterUrl;
  }


  public GenerateRequest origin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Information about SDK user, like a User-Agent
   * @return origin
   */
  @javax.annotation.Nullable
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(@javax.annotation.Nullable String origin) {
    this.origin = origin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateRequest generateRequest = (GenerateRequest) o;
    return Objects.equals(this.jobOfferUrl, generateRequest.jobOfferUrl) &&
        Objects.equals(this.cvUrl, generateRequest.cvUrl) &&
        Objects.equals(this.coverLetterUrl, generateRequest.coverLetterUrl) &&
        Objects.equals(this.origin, generateRequest.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobOfferUrl, cvUrl, coverLetterUrl, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateRequest {\n");
    sb.append("    jobOfferUrl: ").append(toIndentedString(jobOfferUrl)).append("\n");
    sb.append("    cvUrl: ").append(toIndentedString(cvUrl)).append("\n");
    sb.append("    coverLetterUrl: ").append(toIndentedString(coverLetterUrl)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
    openapiFields.add("jobOfferUrl");
    openapiFields.add("cvUrl");
    openapiFields.add("coverLetterUrl");
    openapiFields.add("origin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("jobOfferUrl");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GenerateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenerateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateRequest is not found in the empty JSON string", GenerateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenerateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("jobOfferUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobOfferUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobOfferUrl").toString()));
      }
      if ((jsonObj.get("cvUrl") != null && !jsonObj.get("cvUrl").isJsonNull()) && !jsonObj.get("cvUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvUrl").toString()));
      }
      if ((jsonObj.get("coverLetterUrl") != null && !jsonObj.get("coverLetterUrl").isJsonNull()) && !jsonObj.get("coverLetterUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverLetterUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverLetterUrl").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateRequest>() {
           @Override
           public void write(JsonWriter out, GenerateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GenerateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GenerateRequest
   * @throws IOException if the JSON string is invalid with respect to GenerateRequest
   */
  public static GenerateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateRequest.class);
  }

  /**
   * Convert an instance of GenerateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

