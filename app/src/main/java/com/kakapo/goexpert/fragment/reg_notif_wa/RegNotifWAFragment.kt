package com.kakapo.goexpert.fragment.reg_notif_wa

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.goexpert.R

class RegNotifWAFragment : Fragment() {

    companion object {
        fun newInstance() = RegNotifWAFragment()
    }

    private lateinit var viewModel: RegNotifWAViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.reg_notif_w_a_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegNotifWAViewModel::class.java)
        // TODO: Use the ViewModel
    }

}