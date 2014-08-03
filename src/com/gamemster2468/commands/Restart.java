/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gamemster2468.commands;

import com.gamemster2468.thematrixapi.Messages;
import com.gamemster2468.thematrixapi.TheMatrixAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Brandons Account
 */
public class Restart implements CommandExecutor{
    
    public int i = 10;
       
    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String args[]) {
        if (sender.isOp()) {
            sender.sendMessage(Messages.TAG + ChatColor.DARK_RED + "You have started the restart countdown!");
             Bukkit.getScheduler().scheduleSyncRepeatingTask(TheMatrixAPI.getPlugin(), new Runnable() {
            public void run() {
                if (i != -1) {
                    if (i != 0) {
                        Bukkit.broadcastMessage(Messages.TAG + ChatColor.DARK_RED + "The server will restart in " + i + " Minutes.");
                        i--;
                    } else {
                        Bukkit.broadcastMessage(Messages.TAG + ChatColor.DARK_RED + "The server is restarting. Make sure to join back!");
                        for (Player pl : Bukkit.getOnlinePlayers()) {
                            pl.kickPlayer(Messages.TAG + ChatColor.GREEN + "Server is " + ChatColor.DARK_PURPLE + "restarting! " + ChatColor.GREEN + "Make sure to join back!");
                        }
                        Bukkit.reload();
                        i--;
                    }
                }
            }
        }, 0L, 360L);
        }
        else {
            sender.sendMessage(Messages.noPerms);
        }
        return false;
    }
    
}
