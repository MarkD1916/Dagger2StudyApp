package com.vmakd1916gmail.com.dagger2study


import android.app.Application
import android.content.Context
import com.vmakd1916gmail.com.dagger2study.di.app.AppComponent
import com.vmakd1916gmail.com.dagger2study.di.app.DaggerAppComponent

class BaseApplication : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is BaseApplication -> appComponent
        else -> applicationContext.appComponent
    }
