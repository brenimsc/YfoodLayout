package com.example.yfood.model

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.example.yfood.R
import com.example.yfood.databinding.ItemShopBinding
import com.example.yfood.databinding.ItemShopCompleteBinding
import com.squareup.picasso.Picasso

class ShopCompleteView(viewGroup: ViewGroup) : ATViewHolder<ShopComplete, ItemShopCompleteBinding>(
    ItemShopCompleteBinding::inflate,
    viewGroup
) {
    override fun bind(item: ShopComplete) {

        binding.shopDescription.text = item.description
        Picasso.get()
            .load(item.url)
            .into(binding.imagemShop)
        binding.textStar.text = item.rate.toString()
        binding.textSubtitle.text = itemView.context.getString(R.string.shopCategory, item.category, item.distance)
        binding.textPrice.text = itemView.context.getString(R.string.shopPrice, item.time, item.price)
    }
}