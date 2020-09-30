package com.lishuaihua.udidtool

import android.app.Application
import android.content.Context

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        context =this
    }
    companion object {
        @get:Synchronized
        lateinit var context :Context
    }
}