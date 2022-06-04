package me.koba1.armoreffect.APIs;

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;

public class ItemAPI {

    public static boolean isHelmet(ItemStack is) {
        if(is == null) return false;
        if(!is.hasItemMeta()) return false;
        if(is.getItemMeta().getDisplayName() == null) return false;
        if(!is.getType().name().contains("HELMET")) return false;

        String dName = ChatColor.stripColor(is.getItemMeta().getDisplayName());
        if(dName.equalsIgnoreCase(ChatColor.stripColor(ConfigAPI.getHelmet()))) {
            return true;
        }

        return false;
    }

    public static boolean isChestplate(ItemStack is) {
        if(is == null) return false;
        if(!is.hasItemMeta()) return false;
        if(is.getItemMeta().getDisplayName() == null) return false;
        if(!is.getType().name().contains("CHESTPLATE")) return false;

        String dName = ChatColor.stripColor(is.getItemMeta().getDisplayName());
        if(dName.equalsIgnoreCase(ChatColor.stripColor(ConfigAPI.getChestplate()))) {
            return true;
        }

        return false;
    }

    public static boolean isLeggings(ItemStack is) {
        if(is == null) return false;
        if(!is.hasItemMeta()) return false;
        if(is.getItemMeta().getDisplayName() == null) return false;
        if(!is.getType().name().contains("LEGGINGS")) return false;


        String dName = ChatColor.stripColor(is.getItemMeta().getDisplayName());
        if(dName.equalsIgnoreCase(ChatColor.stripColor(ConfigAPI.getLeggings()))) {
            return true;
        }

        return false;
    }

    public static boolean isBoots(ItemStack is) {
        if(is == null) return false;
        if(!is.hasItemMeta()) return false;
        if(is.getItemMeta().getDisplayName() == null) return false;
        if(!is.getType().name().contains("BOOTS")) return false;


        String dName = ChatColor.stripColor(is.getItemMeta().getDisplayName());
        if(dName.equalsIgnoreCase(ChatColor.stripColor(ConfigAPI.getBoots()))) {
            return true;
        }

        return false;
    }
}
