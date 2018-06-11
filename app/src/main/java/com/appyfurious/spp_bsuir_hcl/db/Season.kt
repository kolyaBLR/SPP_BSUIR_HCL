package com.appyfurious.spp_bsuir_hcl.db

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Season : RealmObject() {
    @PrimaryKey
    var id = UUID.randomUUID().toString()
    var number: String? = null
    var videos: RealmList<Video> = RealmList()
}