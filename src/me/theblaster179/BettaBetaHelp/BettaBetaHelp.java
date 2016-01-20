package me.theblaster179.BettaBetaHelp;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;

public class BettaBetaHelp extends JavaPlugin{
	
	Logger log = Logger.getLogger("Mincraft");
	
	public void onEnable(){
		
		boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
			if(cmd.getName().equalsEgnoreCase("help")){
				player.sendMessage(ChatColor.YELLOW + "-=[" + ChatColor.AQUA + " Common Command List " + ChatColor.YELLOW + "]=-");
				player.sendMessage(ChatColor.YELLOW + "/help" + ChatColor.BLUE + " Lists most common commands");
				player.sendMessage(ChatColor.YELLOW + "/fullhelp" + ChatColor.AQUA + " Lists all commands available");
				player.sendMessage(ChatColor.YELLOW + "/sethome" + ChatColor.BLUE + " Sets your home");
				player.sendMessage(ChatColor.YELLOW + "/delhome" + ChatColor.AQUA + " Deletes your home");
				player.sendMessage(ChatColor.YELLOW + "/home" + ChatColor.BLUE + " Teleports you to your home");
				player.sendMessage(ChatColor.YELLOW + "/lwc" + ChatColor.AQUA + " LWC base command");
				player.sendMessage(ChatColor.YELLOW + "/msg" + ChatColor.BLUE + " Private messages another player");
				player.sendMessage(ChatColor.YELLOW + "/r" + ChatColor.AQUA + " Quick reply through private message");
				player.sendMessage(ChatColor.YELLOW + "/balance" + ChatColor.BLUE + " Returns your balance in dollars");
				player.sendMessage(ChatColor.YELLOW + "/pay" + ChatColor.AQUA + " Pays another user the amount specified");
				player.sendMessage(ChatColor.YELLOW + "/afk" + ChatColor.BLUE + " Marks you as away from keyboard/paused");
				player.sendMessage(ChatColor.BLUE + "=====================================================");
				return false;
			}
		}
		log.info("BettaBetaHelp has been enabled successfully!");
	}
	
	public void onDisable(){
		log.info("BettaBetaHelp has been disabled successfully!");
	}

}
