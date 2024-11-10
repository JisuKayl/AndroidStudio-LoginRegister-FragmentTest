package com.example.jkfb_fragment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager : ViewPager = findViewById(R.id.viewPager) as ViewPager
        var tabLayout : TabLayout = findViewById(R.id.tabLayout) as TabLayout

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)

        fragmentAdapter.addFragment(FirstFragment(), "Login")
        fragmentAdapter.addFragment(SecondFragment(), "Register")

        viewPager.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(viewPager)
    }
}