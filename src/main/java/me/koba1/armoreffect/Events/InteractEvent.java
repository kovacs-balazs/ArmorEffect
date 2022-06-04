package me.koba1.armoreffect.Events;

import me.koba1.armoreffect.APIs.PotionAPI;
import me.koba1.armoreffect.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class InteractEvent implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
            if(e.getItem() == null) return;
            if(!e.getItem().hasItemMeta()) return;
            new BukkitRunnable() {
                @Override
                public void run() {
                    PotionAPI.setupEffect(e.getPlayer());
                }
            }.runTaskLater(Main.getPlugin(Main.class), 5L);
        }
    }
}
