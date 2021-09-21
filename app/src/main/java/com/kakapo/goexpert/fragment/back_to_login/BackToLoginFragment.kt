package com.kakapo.goexpert.fragment.back_to_login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.goexpert.R

class BackToLoginFragment : Fragment() {

    companion object {
        fun newInstance() = BackToLoginFragment()
    }

    private lateinit var viewModel: BackToLoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.back_to_login_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BackToLoginViewModel::class.java)
        // TODO: Use the ViewModel
    }

}