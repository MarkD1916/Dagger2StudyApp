package com.vmakd1916gmail.com.dagger2study.di.app

import android.app.Application
import com.vmakd1916gmail.com.dagger2study.BaseApplication
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

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: BaseApplication)

    fun authComponent(): AuthComponent.Factory
}