package com.bobrov.spp_bsuir_hcl.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.bobrov.spp_bsuir_hcl.R
import com.bobrov.spp_bsuir_hcl.db.Actor
import com.bobrov.spp_bsuir_hcl.db.Film
import com.bobrov.spp_bsuir_hcl.db.Producer
import com.bobrov.spp_bsuir_hcl.db.Video
import com.bobrov.spp_bsuir_hcl.repositories.FilmRepository
import kotlinx.android.synthetic.main.activity_film_created.*

class FilmCreatedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_created)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.new_film -> {
                if (nameFilm.text.isEmpty() || linkImageFilm.text.isEmpty() || tagsFilm.text.isEmpty()
                       || descriptionFilm.text.isEmpty() || videoUrl.text.isEmpty() ||
                        addActor.text.isEmpty() || addProducer.text.isEmpty()) {
                    Toast.makeText(this@FilmCreatedActivity, R.string.not_empty_values, Toast.LENGTH_SHORT).show()
                } else {
                    FilmRepository().create(Film().apply {
                        this.name = nameFilm.text.toString()
                        this.video = Video().apply {
                            this.link = videoUrl.text.toString()
                            this.description = descriptionFilm.text.toString()
                        }
                        this.imageLink = linkImageFilm.text.toString()
                        tagsFilm.text.toString().split(", ").map { tags.add(it) }
                        this.producers.add(Producer().apply { this.firstName = addProducer.text.toString() })
                        this.actors.add(Actor().apply { this.firstName = addActor.text.toString() })
                        Toast.makeText(this@FilmCreatedActivity, R.string.succerr_film_created, Toast.LENGTH_SHORT).show()
                        finish()
                    })
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
