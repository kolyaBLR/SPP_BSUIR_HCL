package com.bobrov.spp_bsuir_hcl.ui.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bobrov.spp_bsuir_hcl.R
import com.bobrov.spp_bsuir_hcl.db.Film
import com.bobrov.spp_bsuir_hcl.ui.adapter.holder.ItemFilmHolder
import com.squareup.picasso.Picasso

class ItemFilmAdapter(val context: Context, val items: List<Film>) : RecyclerView.Adapter<ItemFilmHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemFilmHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_film, parent, false)
        return ItemFilmHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ItemFilmHolder, position: Int) {
        val item = items[position]
        holder.apply {
            this.name.text = item.name
            this.tags.text = item.tags.joinToString(", ")
            item.imageLink?.let {
                Picasso.get().load(it).into(holder.imageView)
            }
            preview.text = item.video?.description
            actors.text = item.actors.joinToString(", ") {
                "${it.firstName ?: ""} ${it.middleName ?: ""} ${it.lastName ?: ""}"
            }
            producers.text = item.producers.joinToString(", ") {
                "${it.firstName ?: ""} ${it.middleName ?: ""} ${it.lastName ?: ""}"
            }
            button.setOnClickListener {
                try {
                    context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(item.video?.link)))
                } catch (ex: Exception) {
                }
            }
        }
    }
}