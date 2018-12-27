package com.bobrov.spp_bsuir_hcl.repositories

import com.bobrov.spp_bsuir_hcl.db.Video
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