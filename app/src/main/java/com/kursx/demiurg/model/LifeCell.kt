package com.kursx.demiurg.model

import com.kursx.demiurg.R

class LifeCell : Cell {

    override fun emojiBackground() = R.drawable.life

    override fun title() = R.string.life_title

    override fun description() = R.string.life_description

    override val name: Name
        get() = Name.Life

    override val emoji: String
        get() = "\uD83D\uDC23"
}