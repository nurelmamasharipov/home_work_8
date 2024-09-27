 package com.example.home_work_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.navigation.fragment.findNavController
import com.example.home_work_8.databinding.FragmentContinentBinding


 class ContinentFragment : Fragment() {

    private lateinit var binding: FragmentContinentBinding

     private val list = arrayListOf(
         Continent("https://i.pinimg.com/564x/77/f4/f2/77f4f2c2fbbd6dce0cfe34bf951ee801.jpg", "NA"),
         Continent("https://i.pinimg.com/564x/ad/a7/02/ada702c26799e66c002ed85ab76fdd0e.jpg", "SA"),
         Continent("https://i.pinimg.com/236x/f5/de/7a/f5de7a28e2a71d0ad7f7c8171fc2ee55.jpg", "AF"),
         Continent("https://i.pinimg.com/236x/c6/ba/5d/c6ba5d5299b693dcde58f527da437d7c.jpg", "EU")
     )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContinentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addData()
        binding.apply {
            rvContinent[0].setOnClickListener{
                findNavController().navigate(R.id.action_continentFragment_to_NAFragment)
            }
            rvContinent[1].setOnClickListener{
                findNavController().navigate(R.id.action_continentFragment_to_SAFragment)
            }
            rvContinent[2].setOnClickListener{
                findNavController().navigate(R.id.action_continentFragment_to_AFFragment)
            }
            rvContinent[3].setOnClickListener{
                findNavController().navigate(R.id.action_continentFragment_to_EUFragment)
            }
        }
    }
     private fun addData() {
         val adapter = ContinentsAdapter(list)
         binding.rvContinent.adapter = adapter
     }
}