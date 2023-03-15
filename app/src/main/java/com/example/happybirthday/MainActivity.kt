package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Ciao sono una branch diversa!")
        setContentView(R.layout.activity_main)
    }
}