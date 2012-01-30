package Beast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class kill implements CommandExecutor {
	
	
	public kill(main plugin) {
		// TODO Auto-generated constructor stub
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("Kill")) {
			
			Player p = (Player) sender;
			Player target = p.getServer().getPlayer(args[0]);
			if(p.hasPermission("beastarchive.kill"))
				if(target.getName().toLowerCase().contains(args[0].toLowerCase())) {
			target.setHealth(0);
			target.sendMessage(ChatColor.DARK_PURPLE + sender.getName() + " Killed you!");
			return true;
				}
			} else {
				sender.sendMessage(ChatColor.RED + "Insufficient Permissions");
			}
		return false;
		
	}

}
