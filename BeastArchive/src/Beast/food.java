package Beast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class food implements CommandExecutor {
	 
	public food(main plugin) {
	}
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)  { 
		if(commandLabel.equalsIgnoreCase("food")) {
			
			Player p = (Player) sender;
			
			if(p.hasPermission("beastarchive.food")) {
				if(p.getFoodLevel() != 100) {
					p.setFoodLevel(100);
					sender.sendMessage(ChatColor.GREEN + "Setting Food to Full");
			} else if(p.getFoodLevel() == 100) {
				sender.sendMessage(ChatColor.RED + "Already Full Food!");
		}
		}
		return true;
	}
		return false;
}
}