package com.vmakd1916gmail.com.dagger2study


import android.app.Application
import com.vmakd1916gmail.com.dagger2study.di.DependencyManager

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DependencyManager.init(this)

    }

}