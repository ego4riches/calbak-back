package com.calbak.utils.advice.dto;

import lombok.Data;

@Data
public class DBError {

    private String message;

    private String sqlState;

    private String errorCode;
}
