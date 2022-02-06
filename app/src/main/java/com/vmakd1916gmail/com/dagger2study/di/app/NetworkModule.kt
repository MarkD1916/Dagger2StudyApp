package com.vmakd1916gmail.com.dagger2study.di.app

import com.vmakd1916gmail.com.dagger2study.AUTH_BASE_URL
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.interceptors.AuthTokenInterceptor
import com.vmakd1916gmail.com.dagger2study.di.auth.AuthApiModule
import com.vmakd1916gmail.com.dagger2study.di.auth.AuthScope
import com.vmakd1916gmail.com.dagger2study.other.AuthRetrofitImpl
import com.vmakd1916gmail.com.dagger2study.other.TokenPreferences
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module(
    includes = [

    ]
)
class NetworkModule{

//    @Singleton
//    @Provides
//    @Named("main")
//    fun providesMainRetrofit(): Retrofit {
//        return AuthRetrofitImpl("https://vmakdsocialnetwork.herokuapp.com/").buildRetrofitClient()
//    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
//            .addInterceptor(authTokenInterceptor)
            .build()
    }

    @Singleton
    @Provides
    @Named("auth")
    fun providesAuthRetrofit(client: OkHttpClient): Retrofit {
        return AuthRetrofitImpl(AUTH_BASE_URL,client).buildRetrofitClient()
    }
}