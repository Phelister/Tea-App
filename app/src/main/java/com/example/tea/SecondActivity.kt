package com.example.tea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("create","created well: On Create Second")
        setContentView(R.layout.activity_second)
        val userName=intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.secondText)
        val message = "Hello $userName , you will get free access for a month"
        textView.text = message
    }

    override fun onStart() {
        super.onStart()

        Log.i("start","started well: On Start Second")
    }

    override fun onResume() {
        super.onResume()
        Log.i("resume","resumed well: On Resume Second")

    }

    override fun onPause() {
        super.onPause()
        Log.i("pause","paused well: On Pause Second")
    }

    override fun onStop() {
        super.onStop()
        Log.i("stop","stopped well: On Stop Second")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("destroy","destroyed well: On Destroy Second")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("restart","restarted well: On Restart Second")
    }
}