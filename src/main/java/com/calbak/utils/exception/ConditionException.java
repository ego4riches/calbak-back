package com.calbak.utils.exception;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ConditionException extends RuntimeException{

    Error error;

    public ConditionException(Error error) {
        this.error = error;
    }

}
