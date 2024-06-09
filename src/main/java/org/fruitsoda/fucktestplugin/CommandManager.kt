package org.fruitsoda.fucktestplugin

import org.fruitsoda.fucktestplugin.player.management.commands.AddPlayerData
import org.fruitsoda.fucktestplugin.player.management.commands.ChangePrefixCommand
import org.fruitsoda.fucktestplugin.player.management.commands.CheckUserData
import org.fruitsoda.fucktestplugin.player.management.commands.StatusCommand

object CommandManager {
    fun registerCommands(){
        Main.instance?.let{
            it.server.run{
                getPluginCommand("status")!!.setExecutor(StatusCommand)
                getPluginCommand("changePrefix")!!.setExecutor(ChangePrefixCommand)
                getPluginCommand("addPlayerData")!!.setExecutor(AddPlayerData)
                getPluginCommand("checkUserData")!!.setExecutor(CheckUserData)
            }
        }
    }
}