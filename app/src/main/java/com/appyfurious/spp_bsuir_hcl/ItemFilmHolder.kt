package com.appyfurious.spp_bsuir_hcl

import android.support.v7.widget.AppCompatSpinner
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class ItemFilmHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val name = view.findViewById<EditText>(R.id.nameFilm)
    val imageLink = view.findViewById<EditText>(R.id.linkImageFilm)
    val tags = view.findViewById<EditText>(R.id.tagsFilm)
    val video = view.findViewById<AppCompatSpinner>(R.id.filmVideoID)
    val addButton = view.findViewById<Button>(R.id.addFilmButton)
    val imageView = view.findViewById<ImageView>(R.id.filmImageView)
}