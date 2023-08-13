package com.example.tea

import android.util.Log

class MyCar: Car(),SpeedController {



    override fun start(){
        Log.i("car","let's start the car: this is a car overridden + ${getBrandId()}")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}