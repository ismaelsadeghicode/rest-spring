package com.javasa.rest.dto.response.server.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
public class Response {
    @JsonProperty("IsSuccessful")
    private boolean isSuccessful;
    @JsonProperty("ErrorCode")
    private String errorCode;
    @JsonProperty("ErrorDescription")
    private String errorDescription;
    @JsonProperty("UniqKey")
    private String uniqeKey;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getUniqeKey() {
        return uniqeKey;
    }

    public void setUniqeKey(String uniqeKey) {
        this.uniqeKey = uniqeKey;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Response{" +
                "isSuccessful=" + isSuccessful +
                ", errorCode='" + errorCode + '\'' +
                ", errorDescription='" + errorDescription + '\'' +
                ", uniqeKey='" + uniqeKey + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
