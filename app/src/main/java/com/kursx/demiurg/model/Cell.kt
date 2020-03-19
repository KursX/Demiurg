package com.kursx.demiurg.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

interface Cell {

    @DrawableRes
    fun emojiBackground(): Int

    @StringRes
    fun title(): Int

    @StringRes
    fun description(): Int

    val emoji: String
    val name: Name
}