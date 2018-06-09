package com.appyfurious.spp_bsuir_hcl.repositories

import com.appyfurious.spp_bsuir_hcl.db.Film
import io.realm.Realm

class FilmRepository {

    fun create(film: Film) {
        Realm.getDefaultInstance().executeTransaction {
            it.insert(film)
        }
    }

    fun get(body: (List<Film>) -> Unit) {
        Realm.getDefaultInstance().executeTransaction {
            body(it.where(Film::class.java).findAll())
        }
    }
}