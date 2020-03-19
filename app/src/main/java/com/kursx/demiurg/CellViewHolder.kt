package com.kursx.demiurg

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kursx.demiurg.model.Cell

class CellViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val emojiBackground: ImageView = view.findViewById(R.id.cell_emoji_background)
    private val emoji: TextView = view.findViewById(R.id.cell_emoji)
    private val title: TextView = view.findViewById(R.id.cell_title)
    private val description: TextView = view.findViewById(R.id.cell_description)

    fun bind(cell: Cell) {
        emojiBackground.setImageResource(cell.emojiBackground())
        emoji.text = cell.emoji
        title.setText(cell.title())
        description.setText(cell.description())
    }
}