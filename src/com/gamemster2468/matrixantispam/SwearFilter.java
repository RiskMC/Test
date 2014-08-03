/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamemster2468.matrixantispam;

import com.gamemster2468.thematrixapi.Messages;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 *
 * @author Brandons Account
 */
public class SwearFilter implements Listener{
   
    
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        String msg = message.toLowerCase();
        if (msg.contains("nigger")||msg.contains("cunt")||msg.contains("shit")||msg.contains("fuck")||msg.contains("queer")||msg.contains("faggot")||msg.contains("fgt")||msg.contains("fucking")||msg.contains("l2p")||msg.contains("bitch")||msg.contains("ass")||msg.contains("whore")||msg.contains("slut")||msg.contains("gay")) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(Messages.TAG + ChatColor.DARK_AQUA + "Please do not swear.");
        }
    }
    
}
