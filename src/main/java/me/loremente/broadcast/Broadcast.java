package me.loremente.broadcast;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Broadcast extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getCommand("broadcast").setExecutor(new BroadcastCommand());
        Bukkit.getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onBroadcast(ServerBroadcastEvent e) {

        System.out.println("Event run:" + e.getMessage());

    }
}
