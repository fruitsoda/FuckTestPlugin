package org.fruitsoda.fucktestplugin

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    companion object{
        var instance : Main?=null
    }
    override fun onEnable() {
        instance = this
        //EventManager.registerEvents()
        CommandManager.registerCommands()
        logger.info("FUCKKKKKKK!!!!!!!!")
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
