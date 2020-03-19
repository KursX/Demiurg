package com.kursx.demiurg.factory

import com.kursx.demiurg.model.Cell
import com.kursx.demiurg.model.LifeCell

class LifeFactory : CellsFactory {

    override fun createCell(): Cell {
        return LifeCell()
    }
}