package br.com.hellopet.repositories.common.database.relational.exception;

public class InvalidDataException extends RuntimeException{
    public InvalidDataException() {
        super();
    }

    public InvalidDataException(String message) {
        super(message);
    }
}
