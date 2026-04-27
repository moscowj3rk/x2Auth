package ru.moscowj3rk;

import ru.moscowj3rk.database.DatabaseInterface;

public abstract class AbstractX2AuthProvider implements X2AuthProvider {
    private DatabaseInterface databaseInterface;

    public DatabaseInterface getDatabaseInterface() {
        return databaseInterface;
    }

    public void setDatabaseInterface(DatabaseInterface databaseInterface) {
        this.databaseInterface = databaseInterface;
    }
}
