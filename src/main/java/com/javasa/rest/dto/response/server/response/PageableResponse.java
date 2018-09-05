package com.javasa.rest.dto.response.server.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
public class PageableResponse extends Response {
    @JsonProperty("TotalRecord")
    private Long totalRecord;

    public Long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    @Override
    public String toString() {
        return "PageableResponse{" +
                "totalRecord=" + totalRecord +
                "} " + super.toString();
    }
}
