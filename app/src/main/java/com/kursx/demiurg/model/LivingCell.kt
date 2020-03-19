package com.kursx.demiurg.model

import com.kursx.demiurg.R

class LivingCell : Cell {

    override fun emojiBackground() = R.drawable.living

    override fun title() = R.string.living_title

    override fun description() = R.string.living_description

    override val emoji: String
        get() = "\uD83D\uDCA5"

    override val name: Name
        get() = Name.Living
}