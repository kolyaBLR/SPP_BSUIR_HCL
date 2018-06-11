package com.appyfurious.spp_bsuir_hcl.repositories

import com.appyfurious.spp_bsuir_hcl.db.Actor
import com.appyfurious.spp_bsuir_hcl.db.Producer
import io.realm.Realm
import java.util.*

class UserRepository {

    companion object {
        const val ACTOR = 0
        const val PRODUCER = 1
    }

    fun insertUser(userType: Int, firstName: String, middleName: String, lastName: String, about: String) {
        Realm.getDefaultInstance().executeTransaction {
            when(userType) {
                ACTOR -> {
                    val user = it.createObject(Actor::class.java, UUID.randomUUID().toString())
                    user.firstName = firstName
                    user.middleName = middleName
                    user.lastName = lastName
                }
                PRODUCER -> {
                    val user = it.createObject(Producer::class.java, UUID.randomUUID().toString())
                    user.firstName = firstName
                    user.middleName = middleName
                    user.lastName = lastName
                }
            }
        }
    }
}