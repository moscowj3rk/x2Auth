package ru.moscowj3rk.database.models;

public final class PlayerDataSecured {
    private final String player;
    private String cachedPassword;

    public PlayerDataSecured(String player) {
        this.player = player;
    }

    public String getCachedPassword() {
        return cachedPassword;
    }

    public String getPlayer() {
        return player;
    }

    public void setCachedPassword(String cachedPassword) {
        this.cachedPassword = cachedPassword;
    }
}
