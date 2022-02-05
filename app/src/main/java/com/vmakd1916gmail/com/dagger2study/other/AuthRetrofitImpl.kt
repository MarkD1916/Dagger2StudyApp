package com.vmakd1916gmail.com.dagger2study.other

import okhttp3.Interceptor
import retrofit2.Retrofit
import javax.inject.Inject

class AuthRetrofitImpl @Inject constructor(private val url: String) : RetrofitProduct {

    override fun buildRetrofitClient(): Retrofit {
        return Retrofit.Builder().baseUrl(url).build()
    }
}