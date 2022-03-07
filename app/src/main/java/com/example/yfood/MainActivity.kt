package com.example.yfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yfood.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    private fun setupViews() {
        val tabLayout = binding.tabLayout
        val viewPager = binding.viewPager
        val adapter = TabViewPagerAdapter(this)
        viewPager.adapter = adapter
        viewPager.isUserInputEnabled = false // parar de rolar para o lado

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = getString(adapter.tabs[position])
        }.attach()
    }
}