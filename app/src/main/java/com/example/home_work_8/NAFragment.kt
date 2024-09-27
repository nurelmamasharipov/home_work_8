package com.example.home_work_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home_work_8.databinding.FragmentNABinding


class NAFragment : Fragment() {

    private lateinit var binding: FragmentNABinding

    private val listNA = arrayListOf(
        Country("38.93 million","9.985 million km²","Canada","https://i.pinimg.com/236x/14/90/52/14905260c71f7295ef87ce9a425cdde2.jpg"),
        Country("127.5 million","1.973 million km²","Mexico","https://i.pinimg.com/736x/53/ce/ac/53ceac4137f9cdbd7b0d384e6ca62763.jpg"),
        Country("333.3 million","9.834 million km²","USA","https://i.pinimg.com/236x/82/4c/bb/824cbb1495c3bb527109feb69700ec03.jpg"),
        Country("11.21 million","109,884 km²","Cuba","https://i.pinimg.com/236x/8c/39/b5/8c39b56971fd15feaa95667c2f0536e9.jpg"),
        Country("5.181 million","51,100 km²","Costa Rica","https://i.pinimg.com/236x/2e/81/23/2e8123204ebac307d254c12e7e14c69f.jpg")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNABinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addData1()
    }
    private fun addData1() {
        val adapter = CountryAdapter(listNA)
        binding.rvCountryNA.adapter = adapter
    }
}