package com.appyfurious.spp_bsuir_hcl.db

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Series : RealmObject() {
    @PrimaryKey
    var id: String = UUID.randomUUID().toString()
    var name: String? = null
    var description: String? = null
    var preview: String? = null
    var seasons : RealmList<Season> = RealmList()
    var actors: RealmList<Actor> = RealmList()
    var producers: RealmList<Producer> = RealmList()
}