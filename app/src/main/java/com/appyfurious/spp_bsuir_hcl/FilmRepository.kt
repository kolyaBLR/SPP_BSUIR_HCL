package com.appyfurious.spp_bsuir_hcl

import io.realm.Realm

class FilmRepository {

    fun create() {
        Realm.getDefaultInstance().executeTransaction {

        }
    }
    fun get(body: (List<Film>) -> Unit) {
        Realm.getDefaultInstance().executeTransaction {
            body(it.where(Film::class.java).findAll())

        }
    }
}