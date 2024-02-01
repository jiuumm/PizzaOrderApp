package com.example.pizzaorderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pizzaorderapp.adapters.MainViewPagerAdapter
import com.example.pizzaorderapp.databinding.ActivityMainBinding
class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpEvents()
        setValues()
    } override fun setUpEvents() {

        //버튼 클릭등의 이벤트 관련 코드 모음.
    }

    override fun setValues() {
    //화면에 데이터를 표시하기 위한 코드 모음.
    mvpa = MainViewPagerAdapter(supportFragmentManager)
        binding.mainViewPager.adapter = mvpa

        //탭레이아웃과 연결
        binding.mainTabLayout.setupWithViewPager(binding.mainViewPager)

    }


}