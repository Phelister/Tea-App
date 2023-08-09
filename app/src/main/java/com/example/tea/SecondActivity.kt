package com.example.tea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userName=intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.secondText)
        val message = "Hello $userName , you will get free access for a month"
        textView.text = message
    }
}