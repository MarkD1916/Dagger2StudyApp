package com.vmakd1916gmail.com.dagger2study.di

import android.app.Application
import com.vmakd1916gmail.com.dagger2study.di.app.DaggerAppComponent
//import com.vmakd1916gmail.com.dagger2study.di.auth.DaggerAuthComponent


class DependencyManager private constructor(
    application: Application
) {

    companion object {
        private lateinit var instance: DependencyManager

        fun init(application: Application) {
            instance = DependencyManager(application)
        }

        fun authViewModel() = instance.authComponent.create().getAuthViewModel()

    }

    private val appComponent = DaggerAppComponent.factory().create(application)

    private val authComponent = appComponent.authComponent()
//    private val authComponent = DaggerAuthComponent.factory().create(appComponent)

}
