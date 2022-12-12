package com.maventech.testgit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        f2()
        f3()
    }

    private fun f3() {
        //added f3
    }

    private fun f2() {
        //added feature 2
    }
}