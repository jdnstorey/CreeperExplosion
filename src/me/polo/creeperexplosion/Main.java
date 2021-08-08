package me.polo.creeperexplosion;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CreeperExpEvent(), this);
    }
    public void onDisable() {}

}
