package org.fruitsoda.fucktestplugin.player.management.events

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import org.fruitsoda.fucktestplugin.Main
import org.fruitsoda.fucktestplugin.player.management.PlayerManager

object PlayerQuitEvent : Listener {
    @EventHandler
    fun onPlayerQuitEvent(e: PlayerQuitEvent){
        val playerName:String?
        PlayerManager.getPlayerData(e.player).let {
            playerName = it?.displayName
        }
        if (playerName == null){
            Main.instance?.logger?.info("player name is null")
        }else{
            Main.instance?.logger?.info("player name is ${playerName}")
        }

    }
}