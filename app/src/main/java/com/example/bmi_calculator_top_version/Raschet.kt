package com.example.bmi_calculator_top_version

import android.content.Context

class Raschet (var context: Context, var Rost:Double, var ves:Int,var age:Int){
    fun sost() {
       val Rost_m = Rost/100
        val Bmi = (66+(13.7 * ves + 5*Rost-6.8*age ))
    }
}