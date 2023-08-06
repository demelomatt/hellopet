package br.com.hellopet.datasources.database.relational.common.exception;

public class InvalidDataException extends RuntimeException{
    public InvalidDataException() {
        super();
    }

    public InvalidDataException(String message) {
        super(message);
    }
}
