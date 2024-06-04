package org.fruitsoda.fucktestplugin

import org.fruitsoda.fucktestplugin.player.management.events.PlayerJoinEvent
import org.fruitsoda.fucktestplugin.player.management.events.PlayerKickEvent
import org.fruitsoda.fucktestplugin.player.management.events.PlayerQuitEvent

object EventManager {
    fun registerEvents(){
        Main.instance?.let{
            it.server.pluginManager.run {
                registerEvents(PlayerJoinEvent, it)
                registerEvents(PlayerKickEvent, it)
                registerEvents(PlayerQuitEvent, it)
            }
        }
    }
}