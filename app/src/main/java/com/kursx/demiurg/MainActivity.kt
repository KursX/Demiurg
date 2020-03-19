package com.kursx.demiurg

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val recyclerView = findViewById<RecyclerView>(R.id.main_recycler)
        val viewModel = ViewModelProvider(this)[CellsViewModel::class.java]
        val adapter = CellsAdapter(viewModel)
        findViewById<View>(R.id.main_button).setOnClickListener {
            val updaters = viewModel.create()
            for (updater in updaters) {
                updater.update(adapter)
            }
            recyclerView.scrollToPosition(0)
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}
