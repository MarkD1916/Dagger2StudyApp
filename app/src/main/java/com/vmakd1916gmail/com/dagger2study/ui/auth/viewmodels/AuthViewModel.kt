package com.vmakd1916gmail.com.dagger2study.ui.auth.viewmodels

import androidx.lifecycle.*
import com.androiddevs.ktornoteapp.other.asyncUtil.Event
import com.androiddevs.ktornoteapp.other.asyncUtil.Resource
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.request.UserRequest
import com.vmakd1916gmail.com.dagger2study.data.remote.auth.response.TokenResponse
import com.vmakd1916gmail.com.dagger2study.repository.AuthRepositoryImpl
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class AuthViewModel constructor(
    private val repository: AuthRepositoryImpl
) : ViewModel() {

    private val _registerStatus = MutableLiveData<Event<Resource<UserRequest>>>()
    val registerStatus:LiveData<Event<Resource<UserRequest>>> = _registerStatus

    fun registerUser(user: UserRequest) {
        _registerStatus.postValue(Event(Resource.Loading()))
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.registerUser(user)
            if (response.data!=null) {
                _registerStatus.postValue(Event(Resource.Success(user)))
            }
            else {
                _registerStatus.postValue(Event(Resource.Error(response.message!!)))
            }
        }
    }

    private val _authStatus = MutableLiveData<Event<Resource<TokenResponse>>>()
    val authStatus: LiveData<Event<Resource<TokenResponse>>> = _authStatus

    fun authUser(user: UserRequest) {
        _authStatus.postValue(Event(Resource.Loading()))
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.authUser(user)
            if (response.data!=null) {
                val token = response.data.body()
                _authStatus.postValue(Event(Resource.Success(token!!)))
            }
            else {
                _authStatus.postValue(Event(Resource.Error(response.message!!)))
            }
        }
    }

    private val _logoutStatus = MutableLiveData<Event<Resource<Any>>>()
    val logoutStatus: LiveData<Event<Resource<Any>>> = _logoutStatus

    fun logoutUser(){
        _logoutStatus.postValue(Event(Resource.Loading()))
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.logoutUser()
            if (response.data!=null) {
                _logoutStatus.postValue(Event(Resource.Success(Unit)))
            }
            else {
                _logoutStatus.postValue(Event(Resource.Error(response.message!!)))
            }
        }
    }
}

class AuthViewModelFactory @AssistedInject constructor(
    private val newsRepository: AuthRepositoryImpl,
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == AuthViewModel::class.java)
        return AuthViewModel(newsRepository) as T
    }

    @AssistedFactory
    interface Factory {
        fun create(): AuthViewModelFactory
    }
}