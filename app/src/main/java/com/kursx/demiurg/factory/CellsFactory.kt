package com.kursx.demiurg.factory

import com.kursx.demiurg.model.Cell

interface CellsFactory {

    fun createCell(): Cell
}