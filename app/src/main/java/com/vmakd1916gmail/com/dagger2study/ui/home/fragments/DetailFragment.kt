package com.vmakd1916gmail.com.login_logout_register.ui.auth.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vmakd1916gmail.com.dagger2study.databinding.FragmentDetaileBinding

private const val TAG = "RegisterFragment"


class DetailFragment : Fragment(), View.OnClickListener {
    private var _binding: FragmentDetaileBinding? = null
    val mBinding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetaileBinding.inflate(layoutInflater, container, false)

        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        }


override fun onClick(v: View) {

}

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}
}