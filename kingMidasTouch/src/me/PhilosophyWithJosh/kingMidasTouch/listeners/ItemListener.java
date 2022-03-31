package me.PhilosophyWithJosh.kingMidasTouch.listeners;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import me.PhilosophyWithJosh.kingMidasTouch.Main;

public class ItemListener implements Listener
{
	private Main plugin;
	private ArrayList<Material> itemsToCheck = new ArrayList<Material>();
	private ArrayList<Material> itemsToReplace = new ArrayList<Material>();
	
	public ItemListener(Main pugin)
	{
		this.plugin = plugin;
		
		itemsToCheck.add(Material.IRON_AXE);
		itemsToCheck.add(Material.IRON_HOE);
		itemsToCheck.add(Material.IRON_PICKAXE);
		itemsToCheck.add(Material.IRON_SWORD);
		itemsToCheck.add(Material.IRON_SHOVEL);
		itemsToCheck.add(Material.IRON_HELMET);
		itemsToCheck.add(Material.IRON_CHESTPLATE);
		itemsToCheck.add(Material.IRON_LEGGINGS);
		itemsToCheck.add(Material.IRON_BOOTS);
		itemsToCheck.add(Material.IRON_INGOT);
		
		itemsToReplace.add(Material.GOLDEN_AXE);
		itemsToReplace.add(Material.GOLDEN_HOE);
		itemsToReplace.add(Material.GOLDEN_PICKAXE);
		itemsToReplace.add(Material.GOLDEN_SWORD);
		itemsToReplace.add(Material.GOLDEN_SHOVEL);
		itemsToReplace.add(Material.GOLDEN_HELMET);
		itemsToReplace.add(Material.GOLDEN_CHESTPLATE);
		itemsToReplace.add(Material.GOLDEN_LEGGINGS);
		itemsToReplace.add(Material.GOLDEN_BOOTS);
		itemsToReplace.add(Material.GOLD_INGOT);
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onTouch(PlayerMoveEvent i)
	{
		Player midas = i.getPlayer();
		for(int k = 0; k < itemsToCheck.size();k++)
		{
			if(midas.getInventory().contains(itemsToCheck.get(k)))
			{
				midas.getInventory().remove(itemsToCheck.get(k));
				midas.getInventory().addItem(new ItemStack(itemsToReplace.get(k)));
			}
		}
	}
}
