package com.example.labb_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutApplication_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_application)

        val btn_home: Button = findViewById(R.id.btn_home1)

        btn_home.setOnClickListener{
            val homePage = Intent(this, MainActivity::class.java)
            startActivity(homePage)
        }
    }
}