package net.ghostrealms;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Created by James on 7/19/2015.
 */
public class WorldBackEnd extends JavaPlugin{
    public void onEnable(){
        getLogger().log(Level.INFO, "Loaded " + getDescription().getName());
    }
}

