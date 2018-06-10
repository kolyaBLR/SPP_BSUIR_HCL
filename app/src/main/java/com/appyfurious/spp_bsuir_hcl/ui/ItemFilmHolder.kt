package com.appyfurious.spp_bsuir_hcl.ui

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.appyfurious.spp_bsuir_hcl.R

class ItemFilmHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val name = view.findViewById<TextView>(R.id.itemNameFilm)!!
    val imageView = view.findViewById<ImageView>(R.id.itemImageFilm)!!
    val tags = view.findViewById<TextView>(R.id.itemTagsFilm)!!
}