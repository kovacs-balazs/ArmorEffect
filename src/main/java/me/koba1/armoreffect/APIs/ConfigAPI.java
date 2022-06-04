package me.koba1.armoreffect.APIs;

import me.koba1.armoreffect.Main;
import org.bukkit.ChatColor;

public class ConfigAPI {

    private static Main m = Main.getPlugin(Main.class);

    public static String getHelmet() {
        return ChatColor.translateAlternateColorCodes('&', m.getConfig().getString("Helmet"));
    }

    public static String getChestplate() {
        return ChatColor.translateAlternateColorCodes('&', m.getConfig().getString("Chestplate"));
    }

    public static String getLeggings() {
        return ChatColor.translateAlternateColorCodes('&', m.getConfig().getString("Leggings"));
    }

    public static String getBoots() {
        return ChatColor.translateAlternateColorCodes('&', m.getConfig().getString("Boots"));
    }
}
