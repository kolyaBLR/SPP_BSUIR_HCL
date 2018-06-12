package com.appyfurious.spp_bsuir_hcl.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import com.appyfurious.spp_bsuir_hcl.R
import com.appyfurious.spp_bsuir_hcl.db.Actor
import com.appyfurious.spp_bsuir_hcl.db.Film
import com.appyfurious.spp_bsuir_hcl.db.Producer
import com.appyfurious.spp_bsuir_hcl.db.Video
import com.appyfurious.spp_bsuir_hcl.repositories.ActorRepository
import com.appyfurious.spp_bsuir_hcl.repositories.FilmRepository
import com.appyfurious.spp_bsuir_hcl.repositories.ProducerRepository
import com.appyfurious.spp_bsuir_hcl.repositories.VideoRepository
import kotlinx.android.synthetic.main.activity_film_created.*

class FilmCreatedActivity : AppCompatActivity() {

    private var videos: ArrayList<Video> = ArrayList();
    private var actors: ArrayList<Actor> = ArrayList()
    private var producers: ArrayList<Producer> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_created)
        var videoString = ArrayList<String>()
        var actorString = ArrayList<String>()
        var producerString = ArrayList<String>()
        videoString.add("Выбрать")
        actorString.add("Выбрать")
        producerString.add("Выбрать")

        VideoRepository().get {
            it.map {
                videos.add(it)
                videoString.add(it.toString())
            }
        }

        ActorRepository().get {
            it.map {
                actors.add(it)
                actorString.add(it.toString())
            }
        }

        ProducerRepository().get {
            it.map {
                producers.add(it)
                producerString.add(it.toString())
            }
        }

        filmVideoID.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, videoString)

        addVideoButton.setOnClickListener({
            if (nameFilm.text.isEmpty() || linkImageFilm.text.isEmpty() || tagsFilm.text.isEmpty() || filmVideoID.selectedItemId == 0L) {
                Toast.makeText(this@FilmCreatedActivity
                        , "Все поля обязательны для заполнения!!!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FilmRepository().create(Film().apply {
                this.name = nameFilm.text.toString()
                this.imageLink = linkImageFilm.text.toString()
                tagsFilm.text.toString().split(", ").map {
                    tags.add(it)
                }
                this.video = videos[(filmVideoID.selectedItemId - 1).toInt()]
            })
        })
    }
}
