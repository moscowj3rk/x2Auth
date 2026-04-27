package ru.moscowj3rk.database;

public class DatabaseNotOpenException extends RuntimeException {
    public DatabaseNotOpenException(String message) {
        super(message);
    }
}
