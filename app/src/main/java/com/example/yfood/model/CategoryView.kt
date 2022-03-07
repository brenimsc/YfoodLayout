package com.example.yfood.model

import android.graphics.drawable.GradientDrawable
import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.example.yfood.databinding.ItemCategoryBinding
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso

class CategoryView(viewGroup: ViewGroup) : ATViewHolder<Category, ItemCategoryBinding>(
    ItemCategoryBinding::inflate,
    viewGroup
) {
    override fun bind(item: Category) {
        binding.descriptionCategory.text = item.nome

        Picasso.get()
            .load(item.logoUrl)
            .into(binding.imageCategory, object : Callback {
                override fun onSuccess() {
                    val shape = GradientDrawable()
                    shape.cornerRadius = 10f
                    shape.setColor(item.color.toInt())
                    binding.backgroundCategory.background = shape
                }

                override fun onError(e: Exception?) {
                    TODO("Not yet implemented")
                }

            })



    }
}