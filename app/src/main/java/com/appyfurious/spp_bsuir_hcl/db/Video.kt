package com.appyfurious.spp_bsuir_hcl.db

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Video : RealmObject() {
    @PrimaryKey
    var id = UUID.randomUUID().toString()
    var link: String? = null
    var description: String? = null
    var preview: String? = null
}