package com.calbak.utils.exception;

public class MailSendException extends RuntimeException{
    public MailSendException(String message) {
        super(message);
    }
}
