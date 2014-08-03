/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gamemster2468.thematrixapi;


import com.gamemster2468.commands.Announce;
import com.gamemster2468.commands.Demote;
import com.gamemster2468.commands.Fly;
import com.gamemster2468.commands.Help;
import com.gamemster2468.commands.HelpOp;
import com.gamemster2468.commands.Hub;
import com.gamemster2468.commands.Reload;
import com.gamemster2468.commands.Resign;
import com.gamemster2468.commands.Restart;
import com.gamemster2468.commands.Say;
import com.gamemster2468.commands.SetRank;
import com.gamemster2468.commands.UpdateRank;
import com.gamemster2468.listeners.Listeners;
import com.gamemster2468.matrixantispam.Cooldown;
import com.gamemster2468.matrixantispam.SpamProtect;
import com.gamemster2468.matrixantispam.SwearFilter;
import com.gamemster2468.stafftools.QLHandler;
import com.gamemster2468.stafftools.STCommand;
import com.gamemster2468.stafftools.STGUIHandler;
import com.gamemster2468.stafftools.SpectateGUI;
import com.gamemster2468.stafftools.VGUIHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Brandons Account
 */
public class TheMatrixAPI extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {

        plugin = this;

        getCommand("Announce").setExecutor(new Announce());
        getCommand("Fly").setExecutor(new Fly());
        getCommand("Help").setExecutor(new Help());
        getCommand("HelpOp").setExecutor(new HelpOp());
        getCommand("Hub").setExecutor(new Hub());
        getCommand("Reload").setExecutor(new Reload());
        getCommand("Restart").setExecutor(new Restart());
        getCommand("Say").setExecutor(new Say());
        getCommand("ST").setExecutor(new STCommand());
        getCommand("SetRank").setExecutor(new SetRank());
        getCommand("UpdateRank").setExecutor(new UpdateRank());
        getCommand("Resign").setExecutor(new Resign());
        getCommand("Demote").setExecutor(new Demote());

        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new Ranks(), this);
        pm.registerEvents(new Listeners(), this);
        pm.registerEvents(new QLHandler(), this);
        pm.registerEvents(new STGUIHandler(), this);
        pm.registerEvents(new SpectateGUI(), this);
        pm.registerEvents(new VGUIHandler(), this);
        pm.registerEvents(new Cooldown(), this);
        pm.registerEvents(new SwearFilter(), this);
        pm.registerEvents(new SpamProtect(), this);

        getLogger().info("API has been enabled!");

    }

    @Override
    public void onDisable() {

        plugin = null;

        getLogger().info("API has been disabled!");
    }

    public static Plugin getPlugin() {
        return plugin;

    }

}
