package com.javasa.rest.dto.response.server.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.util.StringUtils;

/**
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum BrokerState {
    NONE("none"),
    UNKNOWN("0"),
    IN_PROGRESS("1"),
    DISSUASION("2"),
    CANCELED("3"),
    DONE("4");

    private String value;

    BrokerState(String value) {
        this.value = value;
    }

    @JsonCreator
    public static BrokerState fromString(String key) {
        if (StringUtils.isEmpty(key)) {
            return NONE;
        }
        for (BrokerState brokerStateTadbir : BrokerState.values()) {
            if (brokerStateTadbir.getValue().equalsIgnoreCase(key)) {
                return brokerStateTadbir;
            }
        }
        return NONE;
    }

    public String getValue() {
        return value;
    }
}
