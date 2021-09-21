package com.kakapo.goexpert.fragment.master_data

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.goexpert.R

class MasterDataFragment : Fragment() {

    companion object {
        fun newInstance() = MasterDataFragment()
    }

    private lateinit var viewModel: MasterDataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.master_data_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MasterDataViewModel::class.java)
        // TODO: Use the ViewModel
    }

}