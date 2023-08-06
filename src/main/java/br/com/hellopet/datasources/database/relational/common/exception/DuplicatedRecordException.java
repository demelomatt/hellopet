package br.com.hellopet.datasources.database.relational.common.exception;

public class DuplicatedRecordException extends RuntimeException{
    public DuplicatedRecordException() {
        super();
    }

    public DuplicatedRecordException(String message) {
        super(message);
    }
}
