package com.vmakd1916gmail.com.dagger2study.ui.auth.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.vmakd1916gmail.com.dagger2study.R
import com.vmakd1916gmail.com.dagger2study.databinding.FragmentAuthBinding
import com.vmakd1916gmail.com.dagger2study.di.DependencyManager
import com.vmakd1916gmail.com.dagger2study.ui.auth.viewmodels.AuthViewModel
import javax.inject.Inject

const val TAG = "AuthFragment"
class AuthFragment: Fragment(R.layout.fragment_auth) {
    private var _binding: FragmentAuthBinding? = null
    val mBinding get() = _binding!!

    private val viewModel by lazy { DependencyManager.authViewModel() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAuthBinding.inflate(layoutInflater, container, false)

        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.testStatus.observe(viewLifecycleOwner, Observer {
            Log.d(TAG, "onViewCreated: $it")
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}