package org.fruitsoda.fucktestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.fruitsoda.fucktestplugin.player.management.PlayerManager

object PlayerJoinEvent : Listener {
    @EventHandler
    fun onPlayerJoinEvent(e: PlayerJoinEvent){
        PlayerManager.addPlayer(e.player)
    }
}