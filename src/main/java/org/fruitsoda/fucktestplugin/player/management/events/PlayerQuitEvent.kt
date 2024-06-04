package org.fruitsoda.fucktestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import org.fruitsoda.fucktestplugin.player.management.PlayerManager

object PlayerQuitEvent : Listener {
    @EventHandler
    fun onPlayerQuitEvent(e: PlayerQuitEvent){
        //PlayerManager.deletePlayer(e.player)
    }
}