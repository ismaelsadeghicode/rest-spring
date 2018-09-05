package com.javasa.rest.dto.request;

import java.util.Date;

/**
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
public class ChangeBrokerRequest {
    private String symbolISIN;
    private Date fromDate;
    private Date toDate;

    public String getSymbolISIN() {
        return symbolISIN;
    }

    public void setSymbolISIN(String symbolISIN) {
        this.symbolISIN = symbolISIN;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "ChangeBrokerRequest{" +
                "symbolISIN='" + symbolISIN + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
