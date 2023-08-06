package br.com.hellopet.repositories.common.database.relational.exception;

public class DuplicatedRecordException extends RuntimeException{
    public DuplicatedRecordException() {
        super();
    }

    public DuplicatedRecordException(String message) {
        super(message);
    }
}
