package com.appyfurious.spp_bsuir_hcl.repositories

import com.appyfurious.spp_bsuir_hcl.db.Actor
import io.realm.Realm

class ActorRepository {
    fun create(actor: Actor) {
        Realm.getDefaultInstance().executeTransaction {
            it.insert(actor)
        }
    }

    fun get(body: (List<Actor>) -> Unit) {
        Realm.getDefaultInstance().executeTransaction {
            body(it.where(Actor::class.java).findAll())
        }
    }
}