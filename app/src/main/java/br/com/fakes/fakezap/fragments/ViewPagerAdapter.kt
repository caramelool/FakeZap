package br.com.fakes.fakezap.fragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by logonrm on 19/03/2018.
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragments = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment = fragments[position]
    override fun getCount(): Int = fragments.size

    fun add(vararg fragment: Fragment) {
        fragments.addAll(fragment)
        notifyDataSetChanged()
    }
}