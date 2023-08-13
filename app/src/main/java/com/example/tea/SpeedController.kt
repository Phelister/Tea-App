package com.example.tea

import android.util.Log

interface SpeedController {
    //contain declaration of abstract methods
    fun accelerate()
    fun decelerate()
    //contain method declaration too
    fun getBrandId():String{
        return "ASDFGH13456"
    }
}