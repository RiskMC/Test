/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamemster2468.matrixantispam;

import com.gamemster2468.thematrixapi.Messages;
import com.gamemster2468.thematrixapi.Ranks;
import java.util.HashMap;
import java.util.Map;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 *
 * @author Brandons Account
 */
public class Cooldown implements Listener {

    private Map<String, Long> lastUsage = new HashMap<String, Long>();
    private final int cdtime = 5;

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        if (!Ranks.isPremium(player)) {
            long lastUsed = 0;
            if (lastUsage.containsKey(player.getName())) {
                lastUsed = lastUsage.get(player.getName());
            }

            int cdmillis = cdtime * 1000;

            if (System.currentTimeMillis() - lastUsed >= cdmillis) {
                event.setCancelled(false);
                lastUsage.put(player.getName(), System.currentTimeMillis());
            } else {
                event.setCancelled(true);
                int timeLeft = (int) (cdtime - (System.currentTimeMillis() - lastUsed) / 1000);
                player.sendMessage(Messages.TAG + ChatColor.WHITE + "You must wait " + timeLeft + " seconds before sending another message!");
            }
        } else {

        }
    }

}
