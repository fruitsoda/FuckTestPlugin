package org.fruitsoda.fucktestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerKickEvent
import org.fruitsoda.fucktestplugin.player.management.PlayerManager

object PlayerKickEvent : Listener{
    @EventHandler
    fun onPlayerKickEvent(e: PlayerKickEvent){
        PlayerManager.deletePlayer(e.player)
    }
}