package com.vmakd1916gmail.com.dagger2study.ui.auth

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vmakd1916gmail.com.dagger2study.BaseApplication
import com.vmakd1916gmail.com.dagger2study.R
import com.vmakd1916gmail.com.dagger2study.appComponent
import com.vmakd1916gmail.com.dagger2study.databinding.ActivityAuthBinding
import com.vmakd1916gmail.com.dagger2study.databinding.ActivityHomeBinding
import com.vmakd1916gmail.com.dagger2study.di.auth.AuthComponent

import com.vmakd1916gmail.com.dagger2study.other.AuthRetrofitImpl
import com.vmakd1916gmail.com.dagger2study.ui.auth.fragments.AuthFragment
import com.vmakd1916gmail.com.dagger2study.ui.auth.viewmodels.AuthViewModel
import javax.inject.Inject

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

//    var authComponent: AuthComponent = (application as BaseApplication).appComponent.authComponent().create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
