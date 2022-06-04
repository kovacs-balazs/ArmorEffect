package me.koba1.armoreffect.Events;

import me.koba1.armoreffect.APIs.PotionAPI;
import me.koba1.armoreffect.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class InventoryClick implements Listener {
    @EventHandler
    public void onInvClick(InventoryClickEvent e) {
        if(e.getClick() == ClickType.CREATIVE) return;

        new BukkitRunnable() {
            @Override
            public void run() {
                PotionAPI.setupEffect((Player) e.getWhoClicked());
            }
        }.runTaskLater(m, 5L);
    }

    private Main m = Main.getPlugin(Main.class);
}
