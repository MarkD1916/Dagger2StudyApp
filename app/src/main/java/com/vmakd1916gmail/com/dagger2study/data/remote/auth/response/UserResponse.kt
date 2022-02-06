package com.vmakd1916gmail.com.dagger2study.data.remote.auth.response

import com.google.gson.annotations.SerializedName

data class UserResponse (
    @SerializedName("username") val name:String,
    @SerializedName("password") val password:String,
)