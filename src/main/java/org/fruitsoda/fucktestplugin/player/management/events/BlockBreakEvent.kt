package org.fruitsoda.fucktestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.fruitsoda.fucktestplugin.Main

object BlockBreakEvent:Listener{

    @EventHandler
    //tlqkf
    fun onBreakBlockEvent(e: BlockBreakEvent){
        val msg1:String = Main.instance!!.config.getString("blockMessage.first")!!
        val msg2:String = Main.instance!!.config.getString("blockMessage.second")!!
        e.player.sendMessage(msg1)
        e.player.sendMessage(msg2)
    }
}