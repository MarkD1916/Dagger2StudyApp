package com.vmakd1916gmail.com.dagger2study.other

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class AuthRetrofitImpl @Inject constructor(private val url: String, private val client: OkHttpClient) : RetrofitProduct {

    override fun buildRetrofitClient(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .baseUrl(url)
            .build()
    }
}