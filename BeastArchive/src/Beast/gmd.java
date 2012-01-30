package Beast;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
 
public class gmd implements CommandExecutor {
       
       
        public gmd(main plugin) {
        }
 
        public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
                if(commandLabel.equalsIgnoreCase("gmd")) {
                                                
                        Player p = (Player) sender;
                        Player target = Bukkit.getPlayer(args[0]);
                        if(p.hasPermission("beastarchive.gamemode")) {
                        	if(args[0] == null) {
                        		if(p.getGameMode() == GameMode.CREATIVE) {
                                    p.setGameMode(GameMode.SURVIVAL);
                                    p.sendMessage(ChatColor.GREEN + "You Are Now in Survival!");
                            } else if (p.getGameMode() == GameMode.SURVIVAL) {
                                    p.setGameMode(GameMode.CREATIVE);
                                    p.sendMessage(ChatColor.GREEN +"You Are Now in Creative!");
                            } else {
                                    p.sendMessage(ChatColor.DARK_AQUA + "Insufficient Permissions!");
                            }
                        	}
                        if(target.getGameMode() == GameMode.CREATIVE) {
                                target.setGameMode(GameMode.SURVIVAL);
                                target.sendMessage(ChatColor.GREEN + "You Are Now in Survival!");
                        } else if (target.getGameMode() == GameMode.SURVIVAL) {
                                target.setGameMode(GameMode.CREATIVE);
                                target.sendMessage(ChatColor.GREEN +"You Are Now in Creative!");
                        } else {
                                p.sendMessage(ChatColor.DARK_AQUA + "Insufficient Permissions!");
                        }
                                        } else {
                                                p.sendMessage(ChatColor.DARK_AQUA + "Insufficient Permissions");
                                        }
                }
        
                return true;
               
        }
       
 
}
 