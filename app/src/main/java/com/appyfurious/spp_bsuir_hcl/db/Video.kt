package com.appyfurious.spp_bsuir_hcl.db

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Video : RealmObject() {

    @PrimaryKey
    var id: String = UUID.randomUUID().toString()
    var name: String? = null
    var link: String? = null
    var description: String? = null
    var preview: String? = null

    override fun toString() = name ?: ""

}