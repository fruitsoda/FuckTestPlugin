package org.fruitsoda.fucktestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent

object BlockBreakEvent:Listener, JavaPlugin(){
    @EventHandler
    fun onBreakBlockEvent(e: BlockBreakEvent){
        val msg1:String = this.config.getString("블록메시지.첫번째")!!
        val msg2:String = this.config.getString("블록메시지.두번째")!!
        e.player.sendMessage(msg1)
        e.player.sendMessage(msg2)
    }
}