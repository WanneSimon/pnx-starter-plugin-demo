package cc.wanforme.nukkit.pspd;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cc.wanforme.nukkit.springDemo.DashInfo;

@Component
public class SimpleNSPlugin extends PluginBase {

	@Autowired
	@Qualifier("dash1")
	private DashInfo dash1;
	
	@Autowired
	@Qualifier("dash2")
	private DashInfo dash2;
	
    @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.WHITE + "I've been loaded!");
        getLogger().info("dash1: " + dash1.toString());
    }

    @Override
    public void onEnable() {
    	getLogger().info("dash2: " + dash2.toString());
    	
        this.getLogger().info(TextFormat.DARK_GREEN + "I've been enabled!");

        this.getLogger().info(String.valueOf(this.getDataFolder().mkdirs()));
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "I've been disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ("test".equals(command.getName().toLowerCase())) {
        	 this.getLogger().info("hello");
        }
        return true;
    }

    
    public DashInfo getDash1() {
		return dash1;
	}
    
    public DashInfo getDash2() {
		return dash2;
	}
}
