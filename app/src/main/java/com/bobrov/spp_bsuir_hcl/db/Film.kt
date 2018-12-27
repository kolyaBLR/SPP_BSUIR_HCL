package com.bobrov.spp_bsuir_hcl.db

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Film : RealmObject() {

    @PrimaryKey
    var id: String = UUID.randomUUID().toString()
    var name: String? = null
    var tags: RealmList<String> = RealmList()
    var imageLink: String? = null
    var video: Video? = null
    var actors: RealmList<Actor> = RealmList()
    var producers: RealmList<Producer> = RealmList()
}
