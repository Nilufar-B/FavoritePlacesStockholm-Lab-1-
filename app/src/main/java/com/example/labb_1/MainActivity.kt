package com.example.labb_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin: Button = findViewById(R.id.btn_signIn)
        val btnAbout: Button = findViewById(R.id.btn_about)

        btnAbout.setOnClickListener{
            val about = Intent(this, AboutApplication_activity::class.java)
            startActivity(about)
        }

        btnLogin.setOnClickListener{
            val signIn = Intent(this, SignIn_activity::class.java)
            startActivity(signIn)
        }


    }
}