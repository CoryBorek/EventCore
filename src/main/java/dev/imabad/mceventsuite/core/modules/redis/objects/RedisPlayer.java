package dev.imabad.mceventsuite.core.modules.redis.objects;

import dev.imabad.mceventsuite.core.api.objects.EventPlayer;

public class RedisPlayer {

    public static RedisPlayer fromEventPlayer(EventPlayer eventPlayer, String bungeeName){
        return new RedisPlayer(eventPlayer.getUUID().toString(), eventPlayer.getLastUsername(), bungeeName);
    }

    private final String uuid;
    private final String username;
    private final String bungeeName;

    public RedisPlayer(String uuid, String username, String bungeeName) {
        this.uuid = uuid;
        this.username = username;
        this.bungeeName = bungeeName;
    }

    public String getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public String getBungeeName() {
        return bungeeName;
    }
}
