/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamemster2468.stafftools;

import com.gamemster2468.thematrixapi.Messages;
import com.gamemster2468.thematrixapi.Ranks;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author Brandons Account
 */
public class STCommand implements CommandExecutor {

    private SpectateGUI spectategui = new SpectateGUI();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String args[]) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (Ranks.isStaff(player)) {
                if (args.length == 0) {
                    player.openInventory(STGUI.getSTGUI());
                } else {
                    if (args[0].contains("1")) {
                        spectategui.openSpectateGUI(player, Bukkit.getOnlinePlayers(), 1, new ItemStack(Material.SKULL_ITEM, 1, (byte) 3));
                    } else if (args[0].contains("2")) {
                        player.openInventory(QLGUI.getQLGUI());

                    } else if (args[0].contains("3")) {
                        player.openInventory(VGUI.getVGUI());

                    } else {

                        sender.sendMessage(Messages.TAG + ChatColor.DARK_GRAY + "Usage: /st [1, 2, 3]");
                    }
                }
            } else {
            }
        }
        return false;
    }

}
