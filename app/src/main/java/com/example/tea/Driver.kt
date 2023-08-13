package com.example.tea

import android.util.Log

class Driver(name: String) {
    var driverName=""
//    lateinit var drive:String   ---can also do this
    init {
        driverName=name
    }
    fun showDetails(){
        Log.i("driver","our new driver is $driverName")
    }

}