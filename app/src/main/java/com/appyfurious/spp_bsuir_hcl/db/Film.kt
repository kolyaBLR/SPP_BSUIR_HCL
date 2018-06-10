package com.appyfurious.spp_bsuir_hcl.db

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Film(): RealmObject() {

    @PrimaryKey
    var id = UUID.randomUUID().toString()
    var name: String ?= null
    var tags: List<String> = RealmList()
    var imageLink: String ?= null
    var videoId: String ?= null
    var actors : RealmList<Actor> = RealmList()
    var producers : RealmList<Producer> = RealmList()
}












