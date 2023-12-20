package com.example.autorizec_reg_vibor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Clickin(view: View) {
        val intentin = Intent(this, AutorizeActivity::class.java)
        startActivity(intentin)
    }
    fun clickup(view: View) {
        val intentup = Intent(this,RegActivity::class.java)
        startActivity(intentup)
    }
}