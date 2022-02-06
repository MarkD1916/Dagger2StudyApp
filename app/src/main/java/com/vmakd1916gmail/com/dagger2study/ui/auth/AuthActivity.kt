package com.vmakd1916gmail.com.dagger2study.ui.auth

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.vmakd1916gmail.com.dagger2study.databinding.ActivityAuthBinding
import com.vmakd1916gmail.com.dagger2study.databinding.ActivityHomeBinding
import com.vmakd1916gmail.com.dagger2study.other.AuthRetrofitImpl
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}