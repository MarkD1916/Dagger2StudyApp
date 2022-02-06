package com.vmakd1916gmail.com.dagger2study.data.remote.auth.response

import com.google.gson.annotations.SerializedName

data class TokenResponse(
    @SerializedName("auth_token") val token: String
)