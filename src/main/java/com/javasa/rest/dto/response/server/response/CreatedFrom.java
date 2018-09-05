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
public enum CreatedFrom {
    NONE("None"),
    UNKNOWN("0"),
    TAP("1"),
    TCP("2"),
    TMP("3"),
    RAM("4"),
    DBS("5"),
    REG("6"),
    BSS("7"),
    OTS("8"),
    FND("9"),
    ACP("10"),
    ABP("11"),
    AOP("12");
    private String value;

    CreatedFrom(String value) {
        this.value = value;
    }

    @JsonCreator
    public static CreatedFrom fromString(String key) {
        if (StringUtils.isEmpty(key)) {
            return NONE;
        }
        for (CreatedFrom createdFromTadbir : CreatedFrom.values()) {
            if (createdFromTadbir.getValue().equalsIgnoreCase(key)) {
                return createdFromTadbir;
            }
        }
        return NONE;
    }

    public String getValue() {
        return value;
    }
}

