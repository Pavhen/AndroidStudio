package com.example.autorizec_reg_vibor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class dontvhod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dontvhod)
    }

    fun sign(view: View) {
        val intentsig = Intent(this,RegActivity::class.java)
        startActivity(intentsig)
    }
}