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
public class Say implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String args[]) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (Ranks.isStaff(player)) {
                if (args.length == 0) {
                    sender.sendMessage(Messages.TAG + ChatColor.DARK_AQUA + "Usage: /say [message]");
                } else {
                    if (args.length < 1) {
                        return true;
                    }

                    String cast = "";
                    for (String str : args) {
                        cast = (cast + str + " ");
                    }
                    for (Player pl : Bukkit.getOnlinePlayers()) {
                        if (Ranks.isOwner(player)) {
                            pl.sendMessage(ChatColor.GREEN + "OWNER \u275a " + player.getName() + ChatColor.WHITE + ": " + ChatColor.DARK_GREEN + cast);
                        } else if (Ranks.isDeveloper(player)) {
                            pl.sendMessage(ChatColor.DARK_RED + "DEVELOPER \u275a " + player.getName() + ChatColor.WHITE + ": " + ChatColor.DARK_GREEN + cast);
                        } else if (Ranks.isStaffManager(player)) {
                            pl.sendMessage(ChatColor.DARK_RED + "STAFF MANAGER \u275a " + player.getName() + ChatColor.WHITE + ": " + ChatColor.DARK_GREEN + cast);
                        } else if (Ranks.isAdmin(player)) {
                            pl.sendMessage(ChatColor.DARK_RED + "ADMIN \u275a " + player.getName() + ChatColor.WHITE + ": " + ChatColor.DARK_GREEN + cast);
                        } else if (Ranks.isSrMod(player)) {
                            pl.sendMessage(ChatColor.DARK_RED + "SR.MOD \u275a " + player.getName() + ChatColor.WHITE + ": " + ChatColor.DARK_GREEN + cast);
                        } else if (Ranks.isMod(player)) {
                            pl.sendMessage(ChatColor.RED + "MODERATOR \u275a " + player.getName() + ChatColor.WHITE + ": " + ChatColor.DARK_GREEN + cast);
                        } else if (Ranks.isSeaborgia(player)) {
                            pl.sendMessage(ChatColor.DARK_BLUE + "TEAM SEABORGIA \u275a " + player.getName() + ChatColor.WHITE + ": " + ChatColor.DARK_GREEN + cast);
                        } else {
                            pl.sendMessage(ChatColor.DARK_BLUE + "UNKNOWN \u275a " + player.getName() + ChatColor.WHITE + ": " + ChatColor.DARK_GREEN + cast);
                        }
                    }
                }
            }
        } else {
            sender.sendMessage(Messages.noPerms);
        }

        return false;
    }

}
