package ru.moscowj3rk.database;

import ru.moscowj3rk.database.models.PlayerDataSecured;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MemoryCacheDataBase {
    private final List<PlayerDataSecured> playerDataSecured = new ArrayList<>();

    public PlayerDataSecured get(String player) {
        AtomicReference<PlayerDataSecured> atomic = new AtomicReference<>(null);
        this.playerDataSecured.forEach(securedData -> {if (securedData.getPlayer().equals(player)) atomic.set(securedData);});
        return atomic.get();
    }

    public List<PlayerDataSecured> getPlayerDataSecured() {
        return Collections.unmodifiableList(this.playerDataSecured);
    }
}
