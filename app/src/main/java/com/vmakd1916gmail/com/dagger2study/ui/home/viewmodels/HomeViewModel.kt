package com.vmakd1916gmail.com.dagger2study.ui.home.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor() : ViewModel() {

    private val _testLiveData = MutableLiveData<String>("Hello Dagger")
    val testLiveData = _testLiveData
}