package com.appyfurious.spp_bsuir_hcl.repositories

import com.appyfurious.spp_bsuir_hcl.db.Series
import io.realm.Realm

class SeriesRepository {
    fun create(series: Series) {
        Realm.getDefaultInstance().executeTransaction {
            it.insert(series)
        }
    }

    fun get(body: (List<Series>) -> Unit) {
        Realm.getDefaultInstance().executeTransaction {
            body(it.where(Series::class.java).findAll())
        }
    }
}