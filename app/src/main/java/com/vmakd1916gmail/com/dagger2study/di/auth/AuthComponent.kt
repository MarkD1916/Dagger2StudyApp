package com.vmakd1916gmail.com.dagger2study.di.auth

import com.vmakd1916gmail.com.dagger2study.ui.auth.AuthActivity
import dagger.Subcomponent

@Subcomponent(
    modules = [AuthApiModule::class,
        AuthViewModelModule::class]
)
interface AuthComponent {

    @Subcomponent.Factory
    interface  Factory{
        fun create() : AuthComponent
    }

    fun inject(authActivity: AuthActivity)
}