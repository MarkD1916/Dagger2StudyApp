package com.vmakd1916gmail.com.dagger2study.data.remote.auth.api

import com.vmakd1916gmail.com.dagger2study.data.remote.auth.request.UserRequest
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.SimpleResponse
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.TokenResponse
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface AuthApi {
    @POST("auth/users/")
    suspend fun registerUser(@Body user: UserRequest): Response<UserResponse>

    @POST("auth/token/login/")
    suspend fun authUser(@Body user: UserRequest): Response<TokenResponse>

    @POST("auth/token/logout/")
    suspend fun logoutUser(): Response<SimpleResponse>
}