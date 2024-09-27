package com.example.home_work_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home_work_8.databinding.FragmentEUBinding


class EUFragment : Fragment() {
    private lateinit var binding: FragmentEUBinding
    private val listEU = arrayListOf(
        Country("144.2 million","17.1 million km²","Russia","https://i.pinimg.com/736x/1d/91/bb/1d91bb08615863ba06d0ce2ef270ead8.jpg"),
        Country("6.975 million","199,900 km²","Kyrgyzstan","https://i.pinimg.com/736x/65/d1/c1/65d1c1371d3ef4c313b687a16e2e8d7c.jpg"),
        Country("1.412 billion","9.597 million km²","China","https://i.pinimg.com/236x/df/90/e3/df90e392f1e76e8eccfce705d4f0aaee.jpg"),
        Country("38 million","603,628 km²","Ukraine","https://i.pinimg.com/236x/14/50/06/145006d08439a62c780714586fa4b3f4.jpg"),
        Country("9.228 million","207,560 km²","Belarus","https://i.pinimg.com/236x/a4/2f/f7/a42ff7f06292e4e5323f37dccb531ee4.jpg`")
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEUBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addData4()
    }
    private fun addData4() {
        val adapter = CountryAdapter(listEU)
        binding.rvCountryEU.adapter = adapter
    }
}