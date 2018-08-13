package com.oushangfeng.pinneddemo.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.*

/**
 *@author: EdsionLi
 *@description: 首页viewpager适配器
 *@date: Created in 2018/3/16 下午1:53
 *@modified by:
 */
class HostMainTabPageAdapter(fm: FragmentManager, fragments: ArrayList<Fragment>) : FragmentPagerAdapter(fm) {

    private var fragments = fragments

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size
}
