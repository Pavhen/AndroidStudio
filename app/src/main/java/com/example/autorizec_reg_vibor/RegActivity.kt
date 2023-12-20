package com.example.autorizec_reg_vibor

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class RegActivity : AppCompatActivity() {
    var pref: SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        pref = getSharedPreferences("Table1", Context.MODE_PRIVATE)
    }







    fun Clickback(view: View) {
        val intentbacks = Intent(this,MainActivity::class.java)
        startActivity(intentbacks)
    }

    fun Click1(view: View) {
        var figa = findViewById<ImageView>(R.id.imageView2)
        //figa.setImageResource(R.drawable.figa)
        figa.visibility = View.VISIBLE


    }


    fun clickREG(view: View) {
        val editor = pref?.edit()
        var name1: EditText = findViewById(R.id.editTextTextPersonName5)
        var name2: EditText = findViewById(R.id.editTextTextPersonName6)
        var name3: EditText = findViewById(R.id.editTextTextPersonName7)
        var loginFromScreen: TextView = findViewById(R.id.editTextTextPersonName3)
        var passwordFromScreen: TextView = findViewById(R.id.editTextTextPersonName4)

        editor?.putString("name1", name1.toString())
        editor?.putString("name2", name2.toString())
        editor?.putString("login", loginFromScreen.text.toString())
        editor?.putString("password", passwordFromScreen.text.toString())
        editor?.apply()
        finish()
        val intentclosereg = Intent(this, MenuActivity::class.java)
        startActivity(intentclosereg)

        }
    }



