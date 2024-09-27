package com.example.home_work_8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.home_work_8.databinding.ItemCountryBinding

class CountryAdapter(private val items: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(private val binding: ItemCountryBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: Country) {
            binding.ivCountry.load(item.image)
            binding.tvArea.text = item.area
            binding.tvPopularity.text = item.popularity
            binding.tvLanguage.text = item.language
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        return CountryViewHolder(
            ItemCountryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
}