package com.vmakd1916gmail.com.dagger2study.di.app

import com.vmakd1916gmail.com.dagger2study.di.auth.AuthScope
import com.vmakd1916gmail.com.dagger2study.other.AuthRetrofitImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    @Named("main")
    fun providesAuthRetrofit(): Retrofit {
        return AuthRetrofitImpl("https://vmakdsocialnetwork.herokuapp.com/").buildRetrofitClient()
    }

    @Singleton
    @Provides
    @Named("auth")
    fun providesMainRetrofit(): Retrofit {
        return AuthRetrofitImpl("http://www.my_api_main.com/").buildRetrofitClient()
    }
}