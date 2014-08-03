
package com.gamemster2468.stafftools;

import com.gamemster2468.thematrixapi.Messages;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author Brandons Account
 */
public class QLHandler implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getInventory().getTitle().equalsIgnoreCase("[ST] Quick Links")) {
            if (event.getCurrentItem() != null && event.getCurrentItem().getType() != null) {
                event.setCancelled(true);
                Player player = (Player) event.getWhoClicked();
                if (event.getCurrentItem().hasItemMeta() && event.getCurrentItem().getItemMeta().hasDisplayName()) {
                    event.setCancelled(true);
                    ItemStack clicked = event.getCurrentItem();
                    if (clicked != null) {
                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aWebsite")) {
                            player.chat("Sorry, but the website is currently down! It will be back soon! :)");

                        }
                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aReport Rule Breakers")) {
                            player.chat("§fReport rule breakers here: http://bit.ly/1of7cVW");

                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aAppeal Bans")) {
                            player.chat("§fAppeal bans by adding this user on skype: matrix.ban.appeal");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aFeedback")) {
                            player.chat("§fSubmit your feedback and or suggestions here: support.thematrixmc.com");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aTeamSpeak")) {
                            player.chat("§fMatrix Teamspeak IP: matrixmc.eu");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aSwearing")) {
                            player.chat("§fWatch the langauge please.");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aCaps")) {
                            player.chat("§fWatch the caps please.");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aDisrespect")) {
                            player.chat("§fPlease do not disrespect other players.");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aStaff Disrespect")) {
                            player.chat("§fPlease do not disrespect staff.");

                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aSpam")) {
                            player.chat("§fPlease do not spam.");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aDirty Chat")) {
                            player.chat("§fPlease keep chat clean.");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aBreaking rules [LAST WARNING]")) {
                            player.chat("§fStop breaking the rules! This is your LAST warning!");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aStaff Guide")) {
                            player.sendMessage(Messages.TAG + "§3Matrix staff guide: §a§lhttp://bit.ly/1pJvsgZ");
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aBan Report")) {
                            player.sendMessage(Messages.TAG + "§3Report bans here: §a§lhttp://www.bit.ly/1kVWKhl");
                        }
                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aPremium")) {
                            player.chat("Purchase premium here: store.thematrixmc.com");
                        }
                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aMod Apps")) {
                            player.chat("§fApply for moderator here: http://bit.ly/1teQ4mz");
                        }
                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aTeaming")) {
                            player.chat("§fPlease do not team.");
                        }
                        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§aRanks")) {
                            player.chat("§fAll of the matrix ranks: §aOwner§f, §4Developer§f, §4StaffManager§f, §4Admin§f, §4SeniorMod§f, §cModerator§c, §1Seaborgia§f, §dYoutuber§f, §eVIP§f, §bDiamond§f, §6Gold§f, §7Iron§f, and §9Default");
                        }
                    }

                }
            }
        }
    }

}
