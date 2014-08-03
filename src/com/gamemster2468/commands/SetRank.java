/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamemster2468.commands;

import com.gamemster2468.thematrixapi.Messages;
import com.gamemster2468.thematrixapi.Ranks;
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
public class SetRank implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String args[]) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (Ranks.isSrStaff(player)) {
                if (args.length<=1) {
                    sender.sendMessage(Messages.TAG + ChatColor.DARK_AQUA + "Usage: /setrank [user] [rank]");
                }
                else {
                    
                    String target = args[0];
                    String rank = args[1];
                    
                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "pex user " + target + " group set " + rank);
                    sender.sendMessage(Messages.TAG + ChatColor.DARK_AQUA + "Set " + target.toLowerCase() + " to rank " + rank.toLowerCase() + ".");

                }

            } else {

            }
        }
        return false;
    }
}
