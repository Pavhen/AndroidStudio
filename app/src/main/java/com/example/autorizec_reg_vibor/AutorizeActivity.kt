package com.example.autorizec_reg_vibor

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class AutorizeActivity : AppCompatActivity() {
    var pref : SharedPreferences? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autorize)
        pref = getSharedPreferences("Table1", Context.MODE_PRIVATE)

        var loginFromFile = pref?.getString("login", "")




    }


    fun ClickBackside(view: View) {
        val intentback = Intent(this,MainActivity::class.java)
        startActivity(intentback)
    }

    fun clickAutorize(view: View) {
        val loginFromScreen: EditText = findViewById(R.id.editTextTextPersonName)
        var userLogin = loginFromScreen.text.toString()
        val passwordFromScreen: EditText = findViewById(R.id.editTextTextPersonName2)
        var userPassword = passwordFromScreen.text.toString()

        if (userPassword.isEmpty())
        {
            Toast.makeText(this, "Введите пароль", Toast.LENGTH_LONG).show()
        }
        else
        {
            var loginFromFile = pref?.getString("login", "")
            var passwordFromFile = pref?.getString("password", "")

            if ((userLogin == loginFromFile) && (userPassword == passwordFromFile))
            {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }
            else
            {
                val intentnever = Intent(this,dontvhod::class.java)
                startActivity(intentnever)
                //var figas = findViewById<ImageView>(R.id.imageView)
                //figas.visibility = View.VISIBLE
                Toast.makeText(this, "Неправильный логин или пароль", Toast.LENGTH_LONG).show()
            }
        }


    }
}