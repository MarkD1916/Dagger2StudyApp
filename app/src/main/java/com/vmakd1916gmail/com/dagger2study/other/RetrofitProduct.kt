package com.vmakd1916gmail.com.dagger2study.other

import okhttp3.Interceptor
import retrofit2.Retrofit

interface RetrofitProduct {

    fun buildRetrofitClient() : Retrofit
}