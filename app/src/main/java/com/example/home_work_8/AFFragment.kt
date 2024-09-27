package com.example.home_work_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home_work_8.databinding.FragmentAFBinding
import com.example.home_work_8.databinding.ItemCountryBinding


class AFFragment : Fragment() {

    private lateinit var binding: FragmentAFBinding
    private val listAF = arrayListOf(
        Country("44.9 million","2.382 million km²","AAlgerian","https://i.pinimg.com/236x/cb/9a/fe/cb9afe27f700851eee960a38f78d5410.jpg"),
        Country("111 million","1.002 million km²","Egypt","https://i.pinimg.com/236x/73/e5/c0/73e5c094e98bc8d99e7d58fc7033c6ae.jpg"),
        Country("37.46 million","446,550 km²","Marroko","https://i.pinimg.com/236x/de/1a/19/de1a192dc570f020a15712a2efa94fb5.jpg"),
        Country("218.5 million","923,768 km²","Niger","https://i.pinimg.com/236x/4a/bc/35/4abc3511312ba0139ba041979d5f8c4d.jpg"),
        Country("17.32 million","196,190 km²","Senegal","https://i.pinimg.com/236x/8a/c5/e5/8ac5e5b9c1c3a70040d73b2fa9e43866.jpg")
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAFBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addData3()
    }
    private fun addData3() {
        val adapter = CountryAdapter(listAF)
        binding.rvCountryAF.adapter = adapter
    }

}