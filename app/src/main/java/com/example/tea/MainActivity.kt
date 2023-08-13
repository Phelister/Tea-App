package com.example.tea

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    this is the controller class of activity_main ui
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    //val used for read only variables
    Log.i("create","created well: On Create")
     var car=Car()
    car.start()
    var driver=Driver("Eric")
    driver.showDetails()




    val greetings = findViewById<TextView>(R.id.textView)
    val input=findViewById<EditText>(R.id.personaName)
    val submit = findViewById<Button>(R.id.button)
    val welcome = findViewById<TextView>(R.id.welcome)
    val next = findViewById<Button>(R.id.next)
    var enteredName=""
    // onclick listener of the button
    submit.setOnClickListener{
        enteredName=input.text.toString()
        if(enteredName.isEmpty()){
            next.visibility=INVISIBLE
            welcome.text = ""
            Toast.makeText(applicationContext,"Please enter your name",Toast.LENGTH_SHORT).show()
        }
        else {
            val message = "Welcome $enteredName"
            welcome.text = message
            //input.setText("")
            input.text.clear()
            next.visibility=VISIBLE
        }
    }

    next.setOnClickListener{
        //task in android
        val intent= Intent(this,SecondActivity::class.java)
        intent.putExtra("USER" ,enteredName)
        startActivity(intent)

    }


    }

    override fun onStart() {
        super.onStart()

        Log.i("start","started well: On Start")
    }

    override fun onResume() {
        super.onResume()
        Log.i("resume","resumed well: On Resume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("pause","paused well: On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("stop","stopped well: On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("destroy","destroyed well: On Destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("restart","restarted well: On Restart")
    }
}