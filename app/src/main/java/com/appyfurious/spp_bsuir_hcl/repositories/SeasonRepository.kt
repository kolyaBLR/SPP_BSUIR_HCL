package com.appyfurious.spp_bsuir_hcl.repositories

import com.appyfurious.spp_bsuir_hcl.db.Season
import io.realm.Realm

class SeasonRepository {
    fun create(season: Season) {
        Realm.getDefaultInstance().executeTransaction {
            it.insert(season)
        }
    }

    fun get(body: (List<Season>) -> Unit) {
        Realm.getDefaultInstance().executeTransaction {
            body(it.where(Season::class.java).findAll())
        }
    }
}