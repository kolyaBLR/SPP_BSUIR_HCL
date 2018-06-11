package com.appyfurious.spp_bsuir_hcl.configuration

import android.app.Application
import io.realm.Realm

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}