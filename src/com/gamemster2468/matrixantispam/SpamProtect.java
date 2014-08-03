/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamemster2468.matrixantispam;

import com.gamemster2468.thematrixapi.Messages;
import java.util.HashMap;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 *
 * @author Brandons Account
 */
public class SpamProtect implements Listener {

    HashMap<String, String> uuidMessage = new HashMap<String, String>();

    @EventHandler
    public void onAsync(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (uuidMessage.containsKey(player.getName().toString())) {
            if (uuidMessage.get(player.getName().toString()).equals(event.getMessage())) {
                event.setCancelled(true);
                player.sendMessage(Messages.TAG + ChatColor.DARK_AQUA + "Please do not spam.");
            } else {
                uuidMessage.remove(player.getName().toString());
                uuidMessage.put(player.getName().toString(), event.getMessage());
            }
        } else {
            uuidMessage.put(player.getName().toString(), event.getMessage());

        }
    }
}
