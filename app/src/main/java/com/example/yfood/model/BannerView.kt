package com.example.yfood.model

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.example.yfood.databinding.ItemBannerBinding
import com.squareup.picasso.Picasso

class BannerView(viewGroup: ViewGroup) : ATViewHolder<Banner, ItemBannerBinding>(
    ItemBannerBinding::inflate,
    viewGroup
) {
    override fun bind(item: Banner) {
        Picasso.get()
            .load(item.bannerUrl)
            .into(binding.imagemBanner)
    }
}