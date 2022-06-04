package me.koba1.armoreffect;

import me.koba1.armoreffect.APIs.ConfigAPI;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if(cmd.getName().equalsIgnoreCase("test")) {
            if(sender.isOp()) {
                if(args.length == 1) {
                    Player p = (Player) sender;
                    if(args[0].equalsIgnoreCase("helmet")) {
                        p.getInventory().addItem(helmet(ConfigAPI.getHelmet()));
                    }
                    //
                    else if(args[0].equalsIgnoreCase("chestplate")) {
                        p.getInventory().addItem(chestplate(ConfigAPI.getChestplate()));
                    }
                    //
                    else if(args[0].equalsIgnoreCase("leggings")) {
                        p.getInventory().addItem(leggings(ConfigAPI.getLeggings()));
                    }
                    //
                    else if(args[0].equalsIgnoreCase("boots")) {
                        p.getInventory().addItem(boots(ConfigAPI.getBoots()));
                    }
                }
            }
        }
        return false;
    }

    public static ItemStack helmet(String displayName) {
        ItemStack is = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(displayName);
        is.setItemMeta(im);
        return is;
    }

    public static ItemStack chestplate(String displayName) {
        ItemStack is = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(displayName);
        is.setItemMeta(im);
        return is;
    }

    public static ItemStack leggings(String displayName) {
        ItemStack is = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(displayName);
        is.setItemMeta(im);
        return is;
    }

    public static ItemStack boots(String displayName) {
        ItemStack is = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(displayName);
        is.setItemMeta(im);
        return is;
    }
}
