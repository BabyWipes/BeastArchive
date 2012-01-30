package Beast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmdtype implements CommandExecutor {

	public gmdtype(main plugin) {
	}

	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)  {
		Player p = (Player) sender;
		Player target = p.getServer().getPlayer(args[0]);
		if(commandLabel.equalsIgnoreCase("checkgmd")) {
			if(p.hasPermission("beastarchive.checkgmd")) {
				if(target.getName().toLowerCase().contains(args[0].toLowerCase())) {
					target.getGameMode();
					sender.sendMessage(ChatColor.BLUE + target.getName() + " GameMode is " +  target.getGameMode());
				}
			}
		}
		return false;	
}


}
 