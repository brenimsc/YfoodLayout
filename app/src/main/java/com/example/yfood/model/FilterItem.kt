package com.example.yfood.model

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import androidx.annotation.DrawableRes
import com.example.yfood.R
import com.google.android.material.chip.Chip

data class FilterItem(
    val id: Int,
    val text: String,
    @DrawableRes val iconLeft: Int? = null,
    val iconsSize:Float = 26.0f,
    @DrawableRes val iconRight: Int? = null

    )

fun FilterItem.toChip(context: Context) : Chip {
    val chip = if (this.iconRight == null) {
        LayoutInflater.from(context).inflate(R.layout.chip_choice, null, false) as Chip
    } else {
        Chip(ContextThemeWrapper(context, com.google.android.material.R.style.Widget_MaterialComponents_Chip_Choice))
    }


    chip.setChipStrokeColorResource(R.color.light_gray)
    chip.chipStrokeWidth = 2f
    if (this.iconLeft != null ){
        chip.chipIconSize = iconsSize
        chip.setChipIconResource(this.iconLeft)
        chip.iconStartPadding = 20f
    } else {
        chip.chipIcon = null
    }

    this.iconRight?.let {
        chip.setChipBackgroundColorResource(R.color.white)
        chip.setCloseIconResource(it)
        chip.isCloseIconVisible = true
    }

    chip.text = this.text
    return chip
}