package com.example.bmi_calculator_top_version

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Click1(view: View) {
        var Male: ImageView=findViewById(R.id.Male)
        Male.setBackgroundColor(Color.RED)
        var Female: ImageView = findViewById(R.id.Female)
        Female.setBackgroundColor(Color.GREEN)

        var TextMale:TextView = findViewById(R.id.textMale)
        TextMale.setTextColor(Color.RED)
        var TextFemale:TextView = findViewById(R.id.textFemale)
        TextFemale.setTextColor(Color.GREEN)

    }
    fun Click2(view: View) {
        var Male: ImageView=findViewById(R.id.Male)
        Male.setBackgroundColor(Color.GREEN)
        var Female: ImageView = findViewById(R.id.Female)
        Female.setBackgroundColor(Color.RED)

        var TextMale:TextView = findViewById(R.id.textMale)
        TextMale.setTextColor(Color.GREEN)
        var TextFemale:TextView = findViewById(R.id.textFemale)
        TextFemale.setTextColor(Color.RED)
    }

    fun ClickRast(view: View) {
        var et1 = findViewById<EditText>(R.id.et1).text.toString()
        var et2 = findViewById<EditText>(R.id.et2).text.toString()
        var et3 = findViewById<EditText>(R.id.et3).text.toString()
        if (et1.isEmpty()){
            var tv12 = findViewById<TextView>(R.id.tv12)
            tv12.setText("Введите значения")
        }
        else{
            var Rost = et1.toDouble()
            var Ves = et2.toInt()
            var age = et3.toInt()
            Raschet(this,Rost,Ves,age).sost()
        }

    }
}