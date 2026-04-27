package ru.moscowj3rk.database;

public class DatabaseConnectionFailedException extends RuntimeException {
    public DatabaseConnectionFailedException(String message) {
        super(message);
    }
}
