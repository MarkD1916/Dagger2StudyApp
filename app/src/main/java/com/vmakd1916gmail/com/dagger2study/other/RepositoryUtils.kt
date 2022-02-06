package com.androiddevs.ktornoteapp.other


import com.androiddevs.ktornoteapp.other.asyncUtil.Resource
import retrofit2.Response

inline fun <T> safeCall(action: () -> Resource<T>): Resource<T> {
    return try {
        action()
    } catch (e: Exception) {
        Resource.Error(e.message ?: "An unknown error occurred")
    }

}

fun <T> getAuthResponseFromServer(response: Response<T>): Response<T> {
    if (response.isSuccessful) {
        return response
    } else {
        throw Exception(response.message())
    }
}

