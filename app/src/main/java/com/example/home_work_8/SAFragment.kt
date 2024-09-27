package com.example.home_work_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home_work_8.databinding.FragmentSABinding


class SAFragment : Fragment() {
    private lateinit var binding: FragmentSABinding

    private val listSA = arrayListOf(
        Country("46.23 million","2.78 million km²","Argentina","https://i.pinimg.com/236x/ed/53/0c/ed530c3a478f5389b009e91446f89dca.jpg"),
        Country("215.3 million","8.51 million km²","Brazil","https://i.pinimg.com/736x/1c/d4/c7/1cd4c78bd9486690e38f7b589ee7870b.jpg"),
        Country("3.423 million","176,215 km²","Uruguay","https://i.pinimg.com/236x/47/ec/ac/47ecac1fc0348a1c2f141e6815a62e8e.jpg"),
        Country("34.05 million","1.285 million km²","Peru","https://i.pinimg.com/236x/3a/d3/30/3ad33024ebf4ef3f489b098440d3bec2.jpg"),
        Country("19.6 million","756,626 km²","Chili","https://i.pinimg.com/564x/38/24/42/3824428ebcce058ebdde21974ff35532.jpg")
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSABinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addData2()
    }
    private fun addData2() {
        val adapter = CountryAdapter(listSA)
        binding.rvCountrySA.adapter = adapter
    }
}