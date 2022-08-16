package cc.wanforme.nukkit.insp;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cc.wanforme.nukkit.pspd.SimpleNSPlugin;

@Component
public class InjectNSPlugin extends PluginBase {

	@Autowired
	private SimpleNSPlugin nsplugin;
	
    @Override
    public void onLoad() {
        this.getLogger().info(">>>>> " + nsplugin.getDash1());
    }

    @Override
    public void onEnable() {
        this.getLogger().info(">>>>> " + nsplugin.getDash2());
    }

    @Override
    public void onDisable() {
    	
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ("test2".equals(command.getName().toLowerCase())) {
        	 this.getLogger().info("hello inject plugin");
        }
        return true;
    }

}
