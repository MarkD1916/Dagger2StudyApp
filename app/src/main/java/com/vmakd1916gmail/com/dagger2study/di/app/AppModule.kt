package com.vmakd1916gmail.com.dagger2study.di.app

import android.app.Application
import com.vmakd1916gmail.com.dagger2study.other.TokenPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(
    includes = [
        NetworkModule::class,
    ]
)
class AppModule{


    @Singleton
    @Provides
    fun provideTokenPreferences(context: Application) =
        TokenPreferences(context)
//
//    @Provides
//    @Singleton
//    fun provideAuthInterceptor(authTokenPreferences: TokenPreferences): AuthTokenInterceptor =
//        AuthTokenInterceptor(authTokenPreferences)



}