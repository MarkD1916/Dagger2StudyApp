package com.vmakd1916gmail.com.dagger2study.di.app

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import com.vmakd1916gmail.com.dagger2study.other.TokenPreferences
import com.vmakd1916gmail.com.dagger2study.ui.auth.viewmodels.AuthViewModel
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






}