package Beast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class beastcommand implements CommandExecutor {
	 
	public beastcommand(main plugin) {
	}
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)  { 
		if(commandLabel.equalsIgnoreCase("Beast")) {
			Player p = (Player) sender;
			sender.sendMessage(ChatColor.RED + "BeastArchive");
			sender.sendMessage(ChatColor.GREEN + "/heal - Heals Player");
			sender.sendMessage(ChatColor.GREEN + "/repair - Repairs Tool In Hand");
			sender.sendMessage(ChatColor.GREEN + "/getexp <player> - Gets Player Exp Rank!");
			sender.sendMessage(ChatColor.GREEN + "/kill - Kills Player");
			sender.sendMessage(ChatColor.GREEN + "/gmd - Toggles GameMode");
			sender.sendMessage(ChatColor.GREEN + "/food - Fills Food up!");
			sender.sendMessage(ChatColor.GREEN + "/Beast - Displays this Message!");
			sender.sendMessage(ChatColor.GREEN + "/exp <player> - Sets Targets Exp to Level 100!");
			sender.sendMessage(ChatColor.GREEN + "Thanks For using BeastArchive!");
			sender.sendMessage(ChatColor.GREEN + "Made By -_Husky_-");
			System.out.println(p.getName() + "Has Used /beast!");
			return true;
			}
		return false;
		}
}
