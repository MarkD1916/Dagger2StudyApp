package com.vmakd1916gmail.com.dagger2study.di.app

import android.app.Application
import com.vmakd1916gmail.com.dagger2study.di.SubComponentsModule
import com.vmakd1916gmail.com.dagger2study.di.auth.AuthComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        SubComponentsModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: Application,
        ): AppComponent
    }

    fun authComponent(): AuthComponent.Factory

}

