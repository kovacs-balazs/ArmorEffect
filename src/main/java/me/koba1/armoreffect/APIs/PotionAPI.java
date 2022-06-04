package me.koba1.armoreffect.APIs;

import me.koba1.armoreffect.Main;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class PotionAPI {

    private static int time = Integer.MAX_VALUE;

    public static void addEffect(Player p, PotionEffect pot) {
        new BukkitRunnable() {
            @Override
            public void run() {
                p.addPotionEffect(pot);
            }
        }.runTaskLater(Main.getPlugin(Main.class), 2L);
    }

    public static void removeEffect(Player p, PotionEffectType potion) {
        new BukkitRunnable() {
            @Override
            public void run() {
                p.removePotionEffect(potion);
            }
        }.runTaskLater(Main.getPlugin(Main.class), 2L);
    }

    public static void setupEffect(Player p) {
        int counter = -1;
        for (ItemStack is : p.getInventory().getArmorContents()) {
            counter++;
            if (is == null) {
                if (counter == 0) { // boots
                    removeEffect(p, PotionEffectType.SPEED);
                } else if (counter == 1) {
                    removeEffect(p, PotionEffectType.ABSORPTION);
                } else if (counter == 2) {
                    removeEffect(p, PotionEffectType.HEALTH_BOOST);
                } else if (counter == 3) {
                    removeEffect(p, PotionEffectType.NIGHT_VISION);
                }
                continue;
            }

            if (!is.hasItemMeta()) continue;
            if (is.getItemMeta().getDisplayName() == null) continue;

            if (ItemAPI.isHelmet(is)) {
                addEffect(p, new PotionEffect(PotionEffectType.NIGHT_VISION, time, 0));
            }
            //
            else if (ItemAPI.isChestplate(is)) {
                addEffect(p, new PotionEffect(PotionEffectType.HEALTH_BOOST, time, 0));
            }
            //
            else if (ItemAPI.isLeggings(is)) {
                addEffect(p, new PotionEffect(PotionEffectType.ABSORPTION, time, 0));
            }
            //
            else if (ItemAPI.isBoots(is)) {
                addEffect(p, new PotionEffect(PotionEffectType.SPEED, time, 1));

            }
        }
    }

    private static Main m = Main.getPlugin(Main.class);
}
