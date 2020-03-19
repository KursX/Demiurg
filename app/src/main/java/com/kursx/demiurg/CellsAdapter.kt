package com.kursx.demiurg

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CellsAdapter(
    private val cellsViewModel: CellsViewModel
) : RecyclerView.Adapter<CellViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CellViewHolder {
        return CellViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false))
    }

    override fun getItemCount() = cellsViewModel.count()

    override fun onBindViewHolder(holder: CellViewHolder, position: Int) {
        holder.bind(cellsViewModel.get(position))
    }
}