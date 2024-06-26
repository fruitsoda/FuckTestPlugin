package org.fruitsoda.fucktestplugin.player.management.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.fruitsoda.fucktestplugin.player.management.PlayerManager

object ChangePrefixCommand:CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        if(!(sender is Player)){
            sender.sendMessage("플레이어만 사용이 가능합니다.")
            return false
        }

        val player = sender.player
        PlayerManager.getPlayerData(player!!)?.let{
            it.prefix = "changePrefix"
        }
        return true
    }
}