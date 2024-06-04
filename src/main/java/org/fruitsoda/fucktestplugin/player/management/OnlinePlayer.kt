package org.fruitsoda.fucktestplugin.player.management

import java.util.UUID

data class OnlinePlayer(
    val uuid:UUID,
    var displayName: String,
    var job:String,
    var rank:String,
    var prefix:String,
    var money: ULong
    //뀨
)
