package com.javasa.rest.dto.response.server.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
public class ChangeBrokerResponse extends PageableResponse {
    @JsonProperty("List")
    private List<ChangeBroker> changeBrokerList;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<ChangeBroker> getChangeBrokerList() {
        return changeBrokerList;
    }

    public void setChangeBrokerList(List<ChangeBroker> changeBrokerList) {
        this.changeBrokerList = changeBrokerList;
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
        return "ChangeBrokerResponseTadbir{" +
                "changeBrokerList=" + changeBrokerList +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
