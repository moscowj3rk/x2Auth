package ru.moscowj3rk.database.impl;

import ru.moscowj3rk.database.DatabaseConnectionFailedException;
import ru.moscowj3rk.database.DatabaseInterface;
import ru.moscowj3rk.database.DatabaseNotOpenException;
import ru.moscowj3rk.database.MemoryCacheDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.stream.Collectors;

public final class MySQLDataBaseInstance extends MemoryCacheDataBase implements DatabaseInterface {
    private Statement statement;
    private Connection connection;

    @Override
    public void connect() throws DatabaseConnectionFailedException {
        this.connection = DriverManager.getConnection(

        );
    }

    @Override
    public void close() throws DatabaseNotOpenException {

    }
}
