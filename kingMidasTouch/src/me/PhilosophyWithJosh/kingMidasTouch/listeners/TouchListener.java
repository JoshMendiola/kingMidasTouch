package me.PhilosophyWithJosh.kingMidasTouch.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import me.PhilosophyWithJosh.kingMidasTouch.Main;

public class TouchListener implements Listener
{
	private Main plugin;
	
	public TouchListener(Main plugin)
	{
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onTouch(PlayerMoveEvent m)
	{
		Player midas = m.getPlayer();
		Location loc = midas.getLocation().clone().subtract(0, 1, 0);
		Block b = loc.getBlock();
		b.setType(Material.GOLD_BLOCK);
	}
	
	
}
