package com.bobrov.spp_bsuir_hcl.repositories

import com.bobrov.spp_bsuir_hcl.db.Producer
import io.realm.Realm

class ProducerRepository {
    fun create(producer: Producer) {
        Realm.getDefaultInstance().executeTransaction {
            it.insert(producer)
        }
    }

    fun get(body: (List<Producer>) -> Unit) {
        Realm.getDefaultInstance().executeTransaction {
            body(it.where(Producer::class.java).findAll())
        }
    }
}