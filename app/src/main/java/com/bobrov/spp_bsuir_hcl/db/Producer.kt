package com.bobrov.spp_bsuir_hcl.db

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Producer : RealmObject() {
    @PrimaryKey
    var id: String = UUID.randomUUID().toString()
    var firstName: String? = null
    var middleName: String? = null
    var lastName: String? = null
    var about: String? = null

    override fun toString() = firstName + " " + lastName
}