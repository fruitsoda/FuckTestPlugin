package org.fruitsoda.fucktestplugin

import org.bukkit.plugin.java.JavaPlugin
import java.io.File

class Main : JavaPlugin() {
    companion object{
        var instance : Main?=null
    }
    override fun onEnable() {
        instance = this
        //EventManager.registerEvents()
        CommandManager.registerCommands()
        EventManager.registerEvents()
        logger.info("FUCKKKKKKK!!!!!!!!")

        saveConfig()
        val cFile = File(dataFolder, "config.yml")
        if (cFile.length().toInt() == 0){
            config.options().copyDefaults(true)
            saveConfig()
        }
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
