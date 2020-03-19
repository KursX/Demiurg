package com.kursx.demiurg.model

import com.kursx.demiurg.R

class DeadCell : Cell {

    override fun emojiBackground() = R.drawable.dead

    override fun title() = R.string.dead_title

    override fun description() = R.string.dead_description

    override val emoji: String
        get() = "💀"

    override val name: Name
        get() = Name.Dead
}