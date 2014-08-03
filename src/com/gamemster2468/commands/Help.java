/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamemster2468.commands;

import com.gamemster2468.thematrixapi.Ranks;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Brandons Account
 */
public class Help implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String args[]) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (Ranks.isStaff(player) && Ranks.isSrStaff(player)) {
                sender.sendMessage(ChatColor.DARK_AQUA + "====== " + ChatColor.GREEN + " Matrix Sr Staff Commands" + ChatColor.DARK_AQUA + " ======");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/help - " + ChatColor.LIGHT_PURPLE + "Shows this menu.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/tokens - " + ChatColor.LIGHT_PURPLE + "Amount of tokens.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/hub - " + ChatColor.LIGHT_PURPLE + "Teleports you back to the hub.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/helpop - " + ChatColor.LIGHT_PURPLE + "Sends a message to all online staff.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/ping - " + ChatColor.LIGHT_PURPLE + "Gets users ping.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/globalwho - " + ChatColor.LIGHT_PURPLE + "Global information.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/who - " + ChatColor.LIGHT_PURPLE + "Local information.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/staff - " + ChatColor.LIGHT_PURPLE + "Broadcast staff only message.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/st - " + ChatColor.LIGHT_PURPLE + "Opens staff tool GUI.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/tempban - " + ChatColor.LIGHT_PURPLE + "Temp bans player.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/kick - " + ChatColor.LIGHT_PURPLE + "Kicks player from network.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/whereis - " + ChatColor.LIGHT_PURPLE + "Finds target.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/nick - " + ChatColor.LIGHT_PURPLE + "Changes nickname.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/say - " + ChatColor.LIGHT_PURPLE + "Broadcasts a message.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/unban - " + ChatColor.LIGHT_PURPLE + "Unbans user.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/ban - " + ChatColor.LIGHT_PURPLE + "Perma ban user.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/setrank - " + ChatColor.LIGHT_PURPLE + "Changes users rank.");
                sender.sendMessage(ChatColor.DARK_AQUA + "====== " + ChatColor.GREEN + " Matrix Sr Staff Commands" + ChatColor.DARK_AQUA + " ======");
            } else if (Ranks.isStaff(player)) {
                sender.sendMessage(ChatColor.DARK_AQUA + "====== " + ChatColor.GREEN + " Matrix Staff Commands" + ChatColor.DARK_AQUA + " ======");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/help - " + ChatColor.LIGHT_PURPLE + "Shows this menu.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/tokens - " + ChatColor.LIGHT_PURPLE + "Amount of tokens.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/hub - " + ChatColor.LIGHT_PURPLE + "Teleports you back to the hub.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/helpop - " + ChatColor.LIGHT_PURPLE + "Sends a message to all online staff.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/ping - " + ChatColor.LIGHT_PURPLE + "Gets users ping.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/globalwho - " + ChatColor.LIGHT_PURPLE + "Global information.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/who - " + ChatColor.LIGHT_PURPLE + "Local information.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/staff - " + ChatColor.LIGHT_PURPLE + "Broadcast staff only message.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/st - " + ChatColor.LIGHT_PURPLE + "Opens staff tool GUI.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/tempban - " + ChatColor.LIGHT_PURPLE + "Temp bans player.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/kick - " + ChatColor.LIGHT_PURPLE + "Kicks player from network.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/whereis - " + ChatColor.LIGHT_PURPLE + "Finds target.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/nick - " + ChatColor.LIGHT_PURPLE + "Changes nickname.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.RED + "/say - " + ChatColor.LIGHT_PURPLE + "Broadcasts a message.");
                sender.sendMessage(ChatColor.DARK_AQUA + "====== " + ChatColor.GREEN + " Matrix Staff Commands" + ChatColor.DARK_AQUA + " ======");
            } else {
                sender.sendMessage(ChatColor.DARK_AQUA + "====== " + ChatColor.GREEN + " Matrix Commands" + ChatColor.DARK_AQUA + " ======");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/help - " + ChatColor.LIGHT_PURPLE + "Shows this menu.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/tokens - " + ChatColor.LIGHT_PURPLE + "Amount of tokens.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/hub - " + ChatColor.LIGHT_PURPLE + "Teleports you back to the hub.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/helpop - " + ChatColor.LIGHT_PURPLE + "Sends a message to all online staff.");
                sender.sendMessage(ChatColor.YELLOW + "\u271a " + ChatColor.AQUA + "/ping - " + ChatColor.LIGHT_PURPLE + "Gets users ping.");
                sender.sendMessage(ChatColor.DARK_AQUA + "====== " + ChatColor.GREEN + " Matrix Commands" + ChatColor.DARK_AQUA + " ======");
            }
        }

        return false;
    }

}
