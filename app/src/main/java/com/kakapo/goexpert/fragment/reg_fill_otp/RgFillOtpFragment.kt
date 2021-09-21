package com.kakapo.goexpert.fragment.reg_fill_otp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.goexpert.R

class RgFillOtpFragment : Fragment() {

    companion object {
        fun newInstance() = RgFillOtpFragment()
    }

    private lateinit var viewModel: RgFillOtpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.rg_fill_otp_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RgFillOtpViewModel::class.java)
        // TODO: Use the ViewModel
    }

}