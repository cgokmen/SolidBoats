package com.cemgokmen.SolidBoats;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class SolidBoats extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("SolidBoats v" + this.getDescription().getVersion() + " by Funstein successfully activated!");
		getServer().getPluginManager().registerEvents(new SolidBoatsListener(), this);
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll(this);
		getLogger().info("SolidBoats v" + this.getDescription().getVersion() + " by Funstein successfully deactivated!");
	}
	


}
