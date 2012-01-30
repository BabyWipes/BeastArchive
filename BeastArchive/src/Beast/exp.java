package Beast;
 
import org.bukkit.command.CommandExecutor;
 
 
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
        public class exp implements CommandExecutor {
        	private main plugin;
        	public exp(main instance) {
        	    plugin = instance;
        	}
        	int fnum = plugin.config.getInt("Exp Level");
                public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)  { // Fixed the command header to the correct version
                        if (commandLabel.equalsIgnoreCase("Exp"))  { // only continue if the "sender" was a player (could have been the server console too)
                            Player p = (Player) sender; // assign the sender to "p"
                            if(p.hasPermission("beastarchive.exp")) {
                            	if(p.getTotalExperience() != fnum) {
                            		 p.sendMessage(ChatColor.GREEN + "Setting Level to " + fnum);
                                	 p.setTotalExperience(fnum);
                                	 return true;
                            	}
                            } 
                        }
						return false;
                }
        }