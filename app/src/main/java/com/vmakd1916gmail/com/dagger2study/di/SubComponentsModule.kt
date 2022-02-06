package com.vmakd1916gmail.com.dagger2study.di

import com.vmakd1916gmail.com.dagger2study.di.auth.AuthComponent
import dagger.Module

@Module(
    subcomponents = [
        AuthComponent::class
    ]
)
class SubComponentsModule {
}