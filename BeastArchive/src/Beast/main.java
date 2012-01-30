package Beast;


import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;



import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin {
	public static FileConfiguration config;
	private static final Logger log = Logger.getLogger("Minecraft");
	public void onEnable() {
		this.createConfig();
		heal myExecutor6 = new heal(this);
		food myExecutor1 = new food(this);
		exp myExecutor3 = new exp(this);
		gmd myExecutor4 = new gmd(this);
		clear myExecutor7 = new clear(this);
		kill myExecutor5 = new kill(this);
		gmdtype executor = new gmdtype(this);
		beastcommand myExecutor2 = new beastcommand(this);
		getCommand("Heal").setExecutor(myExecutor6);
		getCommand("Kill").setExecutor(myExecutor5);
		getCommand("Beast").setExecutor(myExecutor2);
		getCommand("Food").setExecutor(myExecutor1);
		getCommand("Exp").setExecutor(myExecutor3);
		getCommand("gmd").setExecutor(myExecutor4);
		getCommand("checkgmd").setExecutor(executor);
		getCommand("clear").setExecutor(myExecutor7);
		log.info("[BeastArchive] Has Been Enabled!");
	}
	public void onDisable() {
		log.info("[BeastArchive] Has Been Disabled!");
	}
	private void createConfig() {
		 boolean exists = new File("plugins/BeastArchive/config.yml").exists();
		 if(!exists){
		 new File("plugins/BeastArchive").mkdir();
		 YamlConfiguration config = YamlConfiguration.loadConfiguration(new File("plugins/BeastArchive/config.yml"));
		 	config.options().header("BeastArchive, made by _Husky_ and xCreeeeepz!");
		    
		    try {
				config.save("plugins/BeastArchive/config.yml");
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
	}

}
