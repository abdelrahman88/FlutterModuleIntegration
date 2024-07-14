package com.example.fluttermoduleintegration

import android.app.Application
import android.content.Context


class MyApp : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
//        MultiDex.install(this)
    }
}