package com.vmakd1916gmail.com.dagger2study


import android.app.Application
import com.vmakd1916gmail.com.dagger2study.di.app.AppComponent
import com.vmakd1916gmail.com.dagger2study.di.app.DaggerAppComponent

class BaseApplication : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        initAppComponent()

    }

    fun initAppComponent(){
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}