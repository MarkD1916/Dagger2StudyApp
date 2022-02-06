package com.vmakd1916gmail.com.dagger2study.di.auth

import com.vmakd1916gmail.com.dagger2study.data.remote.auth.api.AuthApi
import com.vmakd1916gmail.com.dagger2study.repository.AuthRepositoryImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Suppress("unused")
@Module
object AuthApiModule {

    @AuthScope
    @Provides
    fun provideAuthApi(@Named("auth")retrofit: Retrofit): AuthApi{
        return retrofit.create(AuthApi::class.java)
    }

    @AuthScope
    @Provides
    fun provideAuthRepository(
        authApi: AuthApi
    ): AuthRepositoryImpl = AuthRepositoryImpl(authApi)
}