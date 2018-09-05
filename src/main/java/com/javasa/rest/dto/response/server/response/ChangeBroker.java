package com.javasa.rest.dto.response.server.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
public class ChangeBroker {
    @JsonProperty("RequestedId")
    private Long requestedId;
    @JsonProperty("SymbolISIN")
    private String symbolISIN;
    @JsonProperty("RequestDate")
    private Date requestDate;
    @JsonProperty("CreatedFrom")
    private CreatedFrom createdFrom;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("State")
    private BrokerState state;
    @JsonProperty("Symbol")
    private String symbolCompleteName;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getRequestedId() {
        return requestedId;
    }

    public void setRequestedId(Long requestedId) {
        this.requestedId = requestedId;
    }

    public String getSymbolISIN() {
        return symbolISIN;
    }

    public void setSymbolISIN(String symbolISIN) {
        this.symbolISIN = symbolISIN;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public CreatedFrom getCreatedFrom() {
        return createdFrom;
    }

    public void setCreatedFrom(CreatedFrom createdFrom) {
        this.createdFrom = createdFrom;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BrokerState getState() {
        return state;
    }

    public void setState(BrokerState state) {
        this.state = state;
    }

    public String getSymbolCompleteName() {
        return symbolCompleteName;
    }

    public void setSymbolCompleteName(String symbolCompleteName) {
        this.symbolCompleteName = symbolCompleteName;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "ChangeBroker{" +
                "requestedId=" + requestedId +
                ", symbolISIN='" + symbolISIN + '\'' +
                ", requestDate=" + requestDate +
                ", createdFrom=" + createdFrom +
                ", Description='" + Description + '\'' +
                ", state=" + state +
                ", symbolCompleteName='" + symbolCompleteName + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
