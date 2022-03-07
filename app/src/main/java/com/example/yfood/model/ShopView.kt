package com.example.yfood.model

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.example.yfood.databinding.ItemShopBinding
import com.squareup.picasso.Picasso

class ShopView(viewGroup: ViewGroup) : ATViewHolder<Shop, ItemShopBinding>(
    ItemShopBinding::inflate,
    viewGroup
) {
    override fun bind(item: Shop) {

        binding.shopDescription.text = item.description
        Picasso.get()
            .load(item.url)
            .into(binding.imagemShop)
    }
}