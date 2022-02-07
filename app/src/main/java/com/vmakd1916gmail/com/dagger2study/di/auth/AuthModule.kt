package com.vmakd1916gmail.com.dagger2study.di.auth

import com.vmakd1916gmail.com.dagger2study.data.remote.auth.api.AuthApi
import com.vmakd1916gmail.com.dagger2study.repository.AuthRepositoryImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named

@Module
class AuthModule {


    @Provides
    fun provideAuthApi(@Named("auth")retrofit: Retrofit): AuthApi =
        retrofit.create(AuthApi::class.java)


    @Provides
    fun provideAuthRepository(
        authApi: AuthApi
    ): AuthRepositoryImpl = AuthRepositoryImpl(authApi)




}

