package com.vmakd1916gmail.com.dagger2study.ui.auth.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.androiddevs.ktornoteapp.other.asyncUtil.Event
import com.androiddevs.ktornoteapp.other.asyncUtil.Resource
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.request.UserRequest
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.TokenResponse
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.UserResponse
import com.vmakd1916gmail.com.dagger2study.repository.AuthRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class AuthViewModel @Inject constructor(private val repository: AuthRepositoryImpl) :
    ViewModel() {

//    private val _registerStatus = MutableLiveData<Event<Resource<UserRequest>>>()
//    val registerStatus:LiveData<Event<Resource<UserRequest>>> = _registerStatus
//
//    fun registerUser(user: UserRequest) {
//        _registerStatus.postValue(Event(Resource.Loading()))
//        viewModelScope.launch(Dispatchers.IO) {
//            val response = repository.registerUser(user)
//            if (response.data!=null) {
//                _registerStatus.postValue(Event(Resource.Success(user)))
//            }
//            else {
//                _registerStatus.postValue(Event(Resource.Error(response.message!!)))
//            }
//
//        }
//    }
//
//    private val _authStatus = MutableLiveData<Event<Resource<TokenResponse>>>()
//    val authStatus: LiveData<Event<Resource<TokenResponse>>> = _authStatus
//
//    fun authUser(user: UserRequest) {
//        _authStatus.postValue(Event(Resource.Loading()))
//        viewModelScope.launch(Dispatchers.IO) {
//            val response = repository.authUser(user)
//            if (response.data!=null) {
//                val token = response.data.body()
//                _authStatus.postValue(Event(Resource.Success(token!!)))
//            }
//            else {
//                _authStatus.postValue(Event(Resource.Error(response.message!!)))
//            }
//        }
//    }
//
//    private val _logoutStatus = MutableLiveData<Event<Resource<Any>>>()
//    val logoutStatus: LiveData<Event<Resource<Any>>> = _logoutStatus
//
//    fun logoutUser(){
//        _logoutStatus.postValue(Event(Resource.Loading()))
//        viewModelScope.launch(Dispatchers.IO) {
//            val response = repository.logoutUser()
//            if (response.data!=null) {
//                _logoutStatus.postValue(Event(Resource.Success(Unit)))
//            }
//            else {
//                _logoutStatus.postValue(Event(Resource.Error(response.message!!)))
//            }
//        }
//    }
}