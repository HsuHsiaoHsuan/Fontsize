package com.example.freeman.fontsize

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var pages: MutableList<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pages = ArrayList()
        pages.add(FirstFragment.newInstance())
        pages.add(SecondFragment.newInstance())

        viewpager.adapter = PagerAdapter(supportFragmentManager, pages.toList())

        Log.e("FREEMAN", resources.displayMetrics.density.toString())

//        var display: DisplayMetrics = resources.displayMetrics
//        var conf: Configuration = resources.configuration

//        display.densityDpi = DisplayMetrics.DENSITY_XXXHIGH
//        conf.densityDpi = DisplayMetrics.DENSITY_XXXHIGH
//        resources.updateConfiguration(conf, display)
    }
}
