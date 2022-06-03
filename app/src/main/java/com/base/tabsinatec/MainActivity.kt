package com.base.tabsinatec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.base.tabsinatec.fragments.FavoriteFragment
import com.base.tabsinatec.fragments.HomeFragment
import com.base.tabsinatec.fragments.SettingFragment
import com.base.tabsinatec.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "GAMES")
        adapter.addFragment(FavoriteFragment(), "PYTHON")
        adapter.addFragment(SettingFragment(), "VISUAL STUDIO")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.tabIconTint = null

        tabs.getTabAt(0)!!.setIcon(R.drawable.games)
        tabs.getTabAt(1)!!.setIcon(R.drawable.python)
        tabs.getTabAt(2)!!.setIcon(R.drawable.vscode)
    }
}