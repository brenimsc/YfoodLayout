package com.example.yfood

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.yfood.ui.MarketplaceFragment
import com.example.yfood.ui.RestaurantFragment

class TabViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    val tabs = arrayOf(R.string.restaurants, R.string.marketplace, R.string.drinks)
    private val fragments = arrayOf(RestaurantFragment(), MarketplaceFragment(), MarketplaceFragment())

    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}