package dev.garvis.worldmanager;

import org.bukkit.plugin.java.JavaPlugin;


public class WorldManagerPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
	this.saveDefaultConfig();

	getLogger().info("World Manager started.");
    }

    @Override
    public void onDisable() {

	getLogger().info("World Manager stopped.");
    }
}
