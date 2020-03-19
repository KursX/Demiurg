package com.kursx.demiurg

import androidx.lifecycle.ViewModel
import com.kursx.demiurg.factory.DeadOrLivingFactory
import com.kursx.demiurg.factory.LifeFactory
import com.kursx.demiurg.model.Cell
import com.kursx.demiurg.model.Name

class CellsViewModel : ViewModel() {

    private val cells = ArrayList<Cell>()

    private val deadOrLivingFactory = DeadOrLivingFactory()
    private val lifeFactory = LifeFactory()

    fun count() = cells.size

    fun get(position: Int) = cells[position]

    fun create() {
        cells.add(0, deadOrLivingFactory.createCell())
        if (cells.size > 2) {
            var deathLine = true
            var liveLine = true
            for (index in 0..2) {
                if (cells[index].name != Name.Living) {
                    liveLine = false
                }
                if (cells[index].name != Name.Dead) {
                    deathLine = false
                }
            }
            when {
                deathLine -> {
                    cells.getOrNull(3)?.let { cell ->
                        if (cell.name == Name.Life) {
                            cells.removeAt(3)
                        }
                    }
                }
                liveLine -> {
                    cells.add(0, lifeFactory.createCell())
                }
            }
        }
    }
}
