package me.koba1.armoreffect;

import me.koba1.armoreffect.Events.InteractEvent;
import me.koba1.armoreffect.Events.InventoryClick;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new InventoryClick(), this);
        getServer().getPluginManager().registerEvents(new InteractEvent(), this);
        setupConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void setupConfig() {
        getConfig().addDefault("Helmet", "&6Glowing Helmet");
        getConfig().addDefault("Chestplate", "&cHealth Boost");
        getConfig().addDefault("Leggings", "&7Absorption");
        getConfig().addDefault("Boots", "&cUltimate Gears");

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        saveConfig();
    }
}
