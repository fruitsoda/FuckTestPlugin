package org.fruitsoda.fucktestplugin.player.management.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.fruitsoda.fucktestplugin.player.management.PlayerManager

object StatusCommand:CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (!(sender is Player)){
            sender.sendMessage("플레이어만 사용이 가능합니다.")
            return false
        }
        val player = sender.player
        PlayerManager.getOfflinePlayerData(player!!)?.let {
            player.sendMessage("----------------------------")
            player.sendMessage("이름 : ${it.displayName}")
            player.sendMessage("직업 : ${it.job}")
            player.sendMessage("랭크 : ${it.rank}")
            player.sendMessage("칭호 : ${it.prefix}")
            player.sendMessage("소지 금액 : ${it.money}")
            player.sendMessage("----------------------------")
        }
        return true
    }
}