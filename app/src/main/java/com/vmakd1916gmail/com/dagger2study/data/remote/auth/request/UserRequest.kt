package com.vmakd1916gmail.com.dagger2study.data.remote.auth.request

import com.google.gson.annotations.SerializedName

data class UserRequest (
    @SerializedName("username") val name:String,
    @SerializedName("password") val password:String,
)