package org.fruitsoda.fucktestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.plugin.java.JavaPlugin
import org.fruitsoda.fucktestplugin.player.management.PlayerManager

object  PlayerJoinEvent  : Listener, JavaPlugin()  {
    @EventHandler
    fun onPlayerJoinEvent(e: PlayerJoinEvent){
        val msg:String? = this.config.getString("접속메시지")
        e.joinMessage = msg
    }
}