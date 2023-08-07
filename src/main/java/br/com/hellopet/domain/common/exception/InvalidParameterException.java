package br.com.hellopet.domain.common.exception;

public class InvalidParameterException extends RuntimeException {
    public InvalidParameterException() {
        super();
    }

    public InvalidParameterException(String message) {
        super(message);
    }
}