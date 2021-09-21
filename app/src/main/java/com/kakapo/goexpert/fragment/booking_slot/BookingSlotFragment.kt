package com.kakapo.goexpert.fragment.booking_slot

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.goexpert.R

class BookingSlotFragment : Fragment() {

    companion object {
        fun newInstance() = BookingSlotFragment()
    }

    private lateinit var viewModel: BookingSlotViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.booking_slot_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BookingSlotViewModel::class.java)
        // TODO: Use the ViewModel
    }

}