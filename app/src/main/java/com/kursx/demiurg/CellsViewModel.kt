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

    fun create(): List<Updater> {
        cells.add(0, deadOrLivingFactory.createCell())
        val updaters = arrayListOf(Updater(Updater.Type.Insert, 0))
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
                            updaters.add(Updater(Updater.Type.Remove, 3))
                        }
                    }
                }
                liveLine -> {
                    cells.add(0, lifeFactory.createCell())
                    updaters.add(Updater(Updater.Type.Insert, 0))
                }
            }
        }
        return updaters
    }
}
