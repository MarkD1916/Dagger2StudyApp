package com.vmakd1916gmail.com.dagger2study.di.auth

import com.vmakd1916gmail.com.dagger2study.ui.auth.fragments.AuthFragment
import dagger.Subcomponent


@Subcomponent(
    modules = [AuthModule::class,
    ]
)
interface AuthComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): AuthComponent
    }

    fun inject(fragment: AuthFragment)
}