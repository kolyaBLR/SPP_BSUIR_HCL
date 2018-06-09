package com.appyfurious.spp_bsuir_hcl.repositories

import com.appyfurious.spp_bsuir_hcl.db.*
import io.realm.Realm

class VideoRepository {
    fun create(video: Video) {
        Realm.getDefaultInstance().executeTransaction {
            it.insert(video)
        }
    }

    fun get(body: (List<Video>) -> Unit) {
        Realm.getDefaultInstance().executeTransaction {
            body(it.where(Video::class.java).findAll())
        }
    }
}