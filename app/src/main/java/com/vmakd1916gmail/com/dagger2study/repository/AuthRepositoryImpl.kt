package com.vmakd1916gmail.com.dagger2study.repository

import com.androiddevs.ktornoteapp.other.asyncUtil.Resource
import com.androiddevs.ktornoteapp.other.getAuthResponseFromServer
import com.androiddevs.ktornoteapp.other.safeCall
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.request.UserRequest
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.SimpleResponse
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.TokenResponse
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.UserResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor() : AuthRepository {

//    suspend fun registerUser(userResponse: UserRequest): Resource<Response<UserResponse>> {
//
//        return withContext(Dispatchers.IO) {
//            safeCall {
//                val call = authApi.registerUser(userResponse)
//                val result = getAuthResponseFromServer(call)
//                Resource.Success(result)
//            }
//        }
//    }
//
//
//    suspend fun authUser(user: UserRequest): Resource<Response<TokenResponse>> {
//
//        return withContext(Dispatchers.IO) {
//            safeCall {
//                val call = authApi.authUser(user)
//                val result = getAuthResponseFromServer(call)
//                Resource.Success(result)
//            }
//        }
//    }
//
//    suspend fun logoutUser(): Resource<Response<SimpleResponse>> {
//        return withContext(Dispatchers.IO) {
//            safeCall {
//                val call = authApi.logoutUser()
//                val result = getAuthResponseFromServer(call)
//                Resource.Success(result)
//            }
//        }
//    }
}