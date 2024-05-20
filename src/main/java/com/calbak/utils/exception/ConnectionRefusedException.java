package com.calbak.utils.exception;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ConnectionRefusedException extends RuntimeException{

    String message;
    public ConnectionRefusedException(String message) {
        this.message = message;
    }

}
