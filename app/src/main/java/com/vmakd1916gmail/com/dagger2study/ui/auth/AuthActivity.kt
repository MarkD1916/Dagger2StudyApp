package com.vmakd1916gmail.com.dagger2study.ui.auth

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vmakd1916gmail.com.dagger2study.databinding.ActivityAuthBinding
import com.vmakd1916gmail.com.dagger2study.databinding.ActivityHomeBinding
import com.vmakd1916gmail.com.dagger2study.other.AuthRetrofitImpl
import com.vmakd1916gmail.com.dagger2study.ui.auth.fragments.TAG
import com.vmakd1916gmail.com.dagger2study.ui.auth.viewmodels.AuthViewModel
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}