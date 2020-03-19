package com.kursx.demiurg.factory

import com.kursx.demiurg.model.Cell
import com.kursx.demiurg.model.DeadCell
import com.kursx.demiurg.model.LivingCell
import kotlin.random.Random

class DeadOrLivingFactory : CellsFactory {

    override fun createCell(): Cell {
        return if (Random.nextBoolean()) {
            LivingCell()
        } else {
            DeadCell()
        }
    }
}