package com.appyfurious.spp_bsuir_hcl.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import com.appyfurious.spp_bsuir_hcl.R
import com.appyfurious.spp_bsuir_hcl.repositories.FilmRepository
import com.appyfurious.spp_bsuir_hcl.ui.adapter.ItemFilmAdapter
import kotlinx.android.synthetic.main.activity_main.*

class FilmActivity : AppCompatActivity() {

    private val filmRepository = FilmRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listFilm.layoutManager = LinearLayoutManager(this)
        filmRepository.get {
            listFilm.adapter = ItemFilmAdapter(this, it)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.new_film -> startActivity(Intent(this@FilmActivity,
                    FilmCreatedActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}
