package ru.moscowj3rk.database;

public interface DatabaseInterface {
    void connect() throws DatabaseConnectionFailedException;
    void close() throws DatabaseNotOpenException;
}
