package com.example.pizzaorderapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorderapp.fragments.ChickenStoreListFragment
import com.example.pizzaorderapp.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm:FragmentManager) :FragmentPagerAdapter(fm){
    override fun getPageTitle(position: Int): CharSequence? {

        return when(position){
            0 -> "피자가게"
            else-> "치킨가게"
        }
    }

    override fun getCount(): Int {
    return 2

    }

    override fun getItem(position: Int): Fragment {
    return when(position){
        0-> PizzaStoreListFragment()
        else -> {
            ChickenStoreListFragment()
        }
    }
    }


}