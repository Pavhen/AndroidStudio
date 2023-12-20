package com.example.autorizec_reg_vibor

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuActivity : AppCompatActivity() {
    var pref : SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        pref = getSharedPreferences("Table1", Context.MODE_PRIVATE)
    }

    fun ClickexitClear(view: View) {
        val editor = pref?.edit()
        editor?.clear()
        editor?.apply()
        finish()
        val intentBack = Intent(this,MainActivity::class.java)
        startActivity(intentBack)

    }
}