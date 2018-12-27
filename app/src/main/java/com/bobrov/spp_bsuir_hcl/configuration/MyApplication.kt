package com.bobrov.spp_bsuir_hcl.configuration

import android.app.Application
import com.bobrov.spp_bsuir_hcl.repositories.FilmRepository
import io.realm.Realm

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        FilmRepository().create()
    }
}