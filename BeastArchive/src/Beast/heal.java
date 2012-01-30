package Beast;

	import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
	import org.bukkit.command.Command;
	import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

	public class heal implements CommandExecutor {
		public heal(main plugin) {
			
		}
		
		public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			if(commandLabel.equalsIgnoreCase("Heal")) {	
				
				Player p = (Player) sender;
				
				if(p.hasPermission("beastarchive.heal")) {
					if(p.getHealth() != 20) {
						p.setHealth(20);
						sender.sendMessage(ChatColor.BLUE + "Health Set to Full!");
						} else if (p.getHealth() == 20) {
							sender.sendMessage(ChatColor.RED + "Already Full Health!");
					} 
						return true;
					
				} else {
					sender.sendMessage(ChatColor.RED + "Insufficient Permissions!");
				}
			}
			return false;
		}
	}


