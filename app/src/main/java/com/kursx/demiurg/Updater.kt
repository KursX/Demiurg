package com.kursx.demiurg

data class Updater(
    val type: Type,
    val position: Int
) {
    enum class Type {
        Insert, Remove
    }

    fun update(adapter: CellsAdapter) {
        when(type) {
            Type.Insert -> adapter.notifyItemInserted(position)
            Type.Remove -> adapter.notifyItemRemoved(position)
        }
    }
}