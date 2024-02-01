package com.example.pizzaorderapp

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this
    abstract fun setUpEvents()//이벤트들을 처리하기 위해 모아둔
    abstract fun setValues()



}