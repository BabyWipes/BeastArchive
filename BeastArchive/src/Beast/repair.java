package Beast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class repair implements CommandExecutor {

	public repair(main plugin) {
	}

	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)  { 
		if(commandLabel.equalsIgnoreCase("repairit")) {
			Player p = (Player) sender;
			if(p.hasPermission("beastarchive.repairit")) {
				p.getItemInHand().setDurability((short)0);
			} else {
				sender.sendMessage(ChatColor.RED + "Insufficient Permissions");
			}
			return true;
				} 
				
				
		return false;
			}
			
}
