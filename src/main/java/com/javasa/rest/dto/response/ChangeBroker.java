package com.javasa.rest.dto.response;

import com.javasa.rest.dto.response.enamapp.BrokerState;
import com.javasa.rest.dto.response.enamapp.CreatedFrom;

import java.util.Date;

/**
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
public class ChangeBroker {
    private Long requestedId;
    private String symbolISIN;
    private String symbolCompleteName;
    private Date requestDate;
    private CreatedFrom createdFrom;
    private String Description;
    private BrokerState state;

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

    public String getSymbolCompleteName() {
        return symbolCompleteName;
    }

    public void setSymbolCompleteName(String symbolCompleteName) {
        this.symbolCompleteName = symbolCompleteName;
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

    @Override
    public String toString() {
        return "ChangeBroker{" +
                "requestedId=" + requestedId +
                ", symbolISIN='" + symbolISIN + '\'' +
                ", symbolCompleteName='" + symbolCompleteName + '\'' +
                ", requestDate=" + requestDate +
                ", createdFrom=" + createdFrom +
                ", Description='" + Description + '\'' +
                ", state=" + state +
                '}';
    }
}
