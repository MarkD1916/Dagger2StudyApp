package com.vmakd1916gmail.com.dagger2study.di.auth

import com.vmakd1916gmail.com.dagger2study.di.app.AppComponent
import com.vmakd1916gmail.com.dagger2study.ui.auth.viewmodels.AuthViewModel
import dagger.Subcomponent

@AuthScope
@Subcomponent(
    modules = [
    ]
)
interface AuthComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): AuthComponent
    }

    fun getAuthViewModel(): AuthViewModel

}