package Beast;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class clear implements CommandExecutor {
	public clear(main plugin) {
	}
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)  { 
		if(commandLabel.equalsIgnoreCase("clear")) {
			Player p = (Player) sender;
			if(p.hasPermission("beastarchive.clear")) {
				p.sendMessage(ChatColor.AQUA + "Inventory Cleared!");
				p.getInventory().clear();
				System.out.println(p.getName() + "Used /clear!");
				} else {
					p.sendMessage(ChatColor.RED + "Insufficient Permissions!");
					System.out.println(p.getName() + "Tried to Use /ic clear and was denied access!");
				}
			return true;
			}
			return false;
		}			
}
