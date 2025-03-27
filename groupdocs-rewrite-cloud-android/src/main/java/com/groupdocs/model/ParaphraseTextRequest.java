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
import com.groupdocs.model.DegreeEnum;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.groupdocs.JSON;

/**
 * ParaphraseTextRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-27T23:59:08.810160+03:00[Europe/Moscow]", comments = "Generator version: 7.12.0")
public class ParaphraseTextRequest {
  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  @javax.annotation.Nonnull
  private String language;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  @javax.annotation.Nullable
  private String text;

  public static final String SERIALIZED_NAME_TEXTS = "texts";
  @SerializedName(SERIALIZED_NAME_TEXTS)
  @javax.annotation.Nullable
  private List<String> texts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  @javax.annotation.Nullable
  private String origin;

  /**
   * Number of variants for rewriting
   */
  @JsonAdapter(SuggestionsEnum.Adapter.class)
  public enum SuggestionsEnum {
    ONE("One"),
    
    TWO("Two"),
    
    THREE("Three");

    private String value;

    SuggestionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SuggestionsEnum fromValue(String value) {
      for (SuggestionsEnum b : SuggestionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SuggestionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SuggestionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SuggestionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SuggestionsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SuggestionsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUGGESTIONS = "suggestions";
  @SerializedName(SERIALIZED_NAME_SUGGESTIONS)
  @javax.annotation.Nullable
  private SuggestionsEnum suggestions;

  public static final String SERIALIZED_NAME_DIVERSITY_DEGREE = "diversityDegree";
  @SerializedName(SERIALIZED_NAME_DIVERSITY_DEGREE)
  @javax.annotation.Nullable
  private DegreeEnum diversityDegree;

  public static final String SERIALIZED_NAME_TOKENIZE = "tokenize";
  @SerializedName(SERIALIZED_NAME_TOKENIZE)
  @javax.annotation.Nullable
  private Boolean tokenize;

  public ParaphraseTextRequest() {
  }

  public ParaphraseTextRequest language(@javax.annotation.Nonnull String language) {
    this.language = language;
    return this;
  }

  /**
   * Set language of text
   * @return language
   */
  @javax.annotation.Nonnull
  public String getLanguage() {
    return language;
  }

  public void setLanguage(@javax.annotation.Nonnull String language) {
    this.language = language;
  }


  public ParaphraseTextRequest text(@javax.annotation.Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Single text paragraph
   * @return text
   */
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(@javax.annotation.Nullable String text) {
    this.text = text;
  }


  public ParaphraseTextRequest texts(@javax.annotation.Nullable List<String> texts) {
    this.texts = texts;
    return this;
  }

  public ParaphraseTextRequest addTextsItem(String textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<>();
    }
    this.texts.add(textsItem);
    return this;
  }

  /**
   * Text paragraphs
   * @return texts
   */
  @javax.annotation.Nullable
  public List<String> getTexts() {
    return texts;
  }

  public void setTexts(@javax.annotation.Nullable List<String> texts) {
    this.texts = texts;
  }


  public ParaphraseTextRequest origin(@javax.annotation.Nullable String origin) {
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


  public ParaphraseTextRequest suggestions(@javax.annotation.Nullable SuggestionsEnum suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  /**
   * Number of variants for rewriting
   * @return suggestions
   */
  @javax.annotation.Nullable
  public SuggestionsEnum getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(@javax.annotation.Nullable SuggestionsEnum suggestions) {
    this.suggestions = suggestions;
  }


  public ParaphraseTextRequest diversityDegree(@javax.annotation.Nullable DegreeEnum diversityDegree) {
    this.diversityDegree = diversityDegree;
    return this;
  }

  /**
   * Get diversityDegree
   * @return diversityDegree
   */
  @javax.annotation.Nullable
  public DegreeEnum getDiversityDegree() {
    return diversityDegree;
  }

  public void setDiversityDegree(@javax.annotation.Nullable DegreeEnum diversityDegree) {
    this.diversityDegree = diversityDegree;
  }


  public ParaphraseTextRequest tokenize(@javax.annotation.Nullable Boolean tokenize) {
    this.tokenize = tokenize;
    return this;
  }

  /**
   * Determines whether to return a tokens list
   * @return tokenize
   */
  @javax.annotation.Nullable
  public Boolean getTokenize() {
    return tokenize;
  }

  public void setTokenize(@javax.annotation.Nullable Boolean tokenize) {
    this.tokenize = tokenize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParaphraseTextRequest paraphraseTextRequest = (ParaphraseTextRequest) o;
    return Objects.equals(this.language, paraphraseTextRequest.language) &&
        Objects.equals(this.text, paraphraseTextRequest.text) &&
        Objects.equals(this.texts, paraphraseTextRequest.texts) &&
        Objects.equals(this.origin, paraphraseTextRequest.origin) &&
        Objects.equals(this.suggestions, paraphraseTextRequest.suggestions) &&
        Objects.equals(this.diversityDegree, paraphraseTextRequest.diversityDegree) &&
        Objects.equals(this.tokenize, paraphraseTextRequest.tokenize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, text, texts, origin, suggestions, diversityDegree, tokenize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParaphraseTextRequest {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    diversityDegree: ").append(toIndentedString(diversityDegree)).append("\n");
    sb.append("    tokenize: ").append(toIndentedString(tokenize)).append("\n");
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
    openapiFields.add("language");
    openapiFields.add("text");
    openapiFields.add("texts");
    openapiFields.add("origin");
    openapiFields.add("suggestions");
    openapiFields.add("diversityDegree");
    openapiFields.add("tokenize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("language");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ParaphraseTextRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParaphraseTextRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParaphraseTextRequest is not found in the empty JSON string", ParaphraseTextRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParaphraseTextRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParaphraseTextRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ParaphraseTextRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("texts") != null && !jsonObj.get("texts").isJsonNull() && !jsonObj.get("texts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `texts` to be an array in the JSON string but got `%s`", jsonObj.get("texts").toString()));
      }
      if ((jsonObj.get("origin") != null && !jsonObj.get("origin").isJsonNull()) && !jsonObj.get("origin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin").toString()));
      }
      if ((jsonObj.get("suggestions") != null && !jsonObj.get("suggestions").isJsonNull()) && !jsonObj.get("suggestions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suggestions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suggestions").toString()));
      }
      // validate the optional field `suggestions`
      if (jsonObj.get("suggestions") != null && !jsonObj.get("suggestions").isJsonNull()) {
        SuggestionsEnum.validateJsonElement(jsonObj.get("suggestions"));
      }
      // validate the optional field `diversityDegree`
      if (jsonObj.get("diversityDegree") != null && !jsonObj.get("diversityDegree").isJsonNull()) {
        DegreeEnum.validateJsonElement(jsonObj.get("diversityDegree"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParaphraseTextRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParaphraseTextRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParaphraseTextRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParaphraseTextRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ParaphraseTextRequest>() {
           @Override
           public void write(JsonWriter out, ParaphraseTextRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParaphraseTextRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ParaphraseTextRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ParaphraseTextRequest
   * @throws IOException if the JSON string is invalid with respect to ParaphraseTextRequest
   */
  public static ParaphraseTextRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParaphraseTextRequest.class);
  }

  /**
   * Convert an instance of ParaphraseTextRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

