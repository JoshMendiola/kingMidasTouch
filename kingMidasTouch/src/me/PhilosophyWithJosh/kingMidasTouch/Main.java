package me.PhilosophyWithJosh.kingMidasTouch;

import org.bukkit.plugin.java.JavaPlugin;

import me.PhilosophyWithJosh.kingMidasTouch.listeners.ItemListener;
import me.PhilosophyWithJosh.kingMidasTouch.listeners.TouchListener;

public class Main extends JavaPlugin
{
	public void onEnable()
	{
		new TouchListener(this);
		new ItemListener(this);
	}
}
