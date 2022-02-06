package com.vmakd1916gmail.com.dagger2study.ui.home

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.vmakd1916gmail.com.dagger2study.R
import com.vmakd1916gmail.com.dagger2study.databinding.ActivityHomeBinding
import com.vmakd1916gmail.com.dagger2study.other.AuthRetrofitImpl
import dagger.android.support.DaggerAppCompatActivity
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Named

const val TAG = "HomeActivity"
class HomeActivity : AppCompatActivity(){

    lateinit var navController: NavController
    private var _binding: ActivityHomeBinding? = null
    val mBinding get() = _binding!!

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)


    }

}