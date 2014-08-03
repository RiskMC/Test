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
public class HelpOp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String args[]) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                sender.sendMessage(Messages.TAG + ChatColor.DARK_AQUA + "Usage: /helpop [message]");
            } else {
                if (args.length < 1) {
                    return true;
                }

                String cast = "";
                for (String str : args) {
                    cast = (cast + str + " ");
                }
                for (Player pl : Bukkit.getOnlinePlayers()) {
                    if (Ranks.isStaff(pl) || Ranks.isPlayer(pl)) {
                        pl.sendMessage(Messages.STAFF + ChatColor.AQUA + "Notification" + ChatColor.DARK_GRAY + " » " + player.getDisplayName() + ": " + ChatColor.WHITE + cast);
                    }
                }
                sender.sendMessage(Messages.TAG + ChatColor.DARK_RED + "Please do NOT spam this command or send in false information! You will be banned if found doing so!");
            }
        }
        
        return false;
    }

}
