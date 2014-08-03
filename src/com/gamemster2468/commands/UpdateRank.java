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
public class UpdateRank implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command commnad, String commandLabel, String args[]) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (Ranks.isSrStaff(player)) {
                if (args.length == 0) {
                    sender.sendMessage(Messages.TAG + ChatColor.DARK_AQUA + "Usage: /updaterank [user/all]");
                } else {
                    String cmd = args[0];
                    if (cmd.equalsIgnoreCase("All")) {
                        for (Player pl:Bukkit.getOnlinePlayers()) {
                            Ranks.updateRank(pl);
                        }
                        sender.sendMessage(Messages.TAG + ChatColor.DARK_AQUA + "ProxiedPlayers ranks has been updated.");
                    } else {
                        Player target = Bukkit.getPlayer(args[0]);
                        if (target == null) {
                            sender.sendMessage(Messages.TAG + ChatColor.GRAY + "Player not found.");
                        } else {
                            Ranks.updateRank(target);
                            sender.sendMessage(Messages.TAG + ChatColor.GRAY + target.getName().toString() + ChatColor.DARK_AQUA + "'s rank has been updated.");
                        }
                    }
                }
            } else {
                sender.sendMessage(Messages.noPerms);
            }
        }
        return false;
    }

}
