package com.example.labb_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WelcomePage_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        val displayUsername: TextView = findViewById(R.id.tv_user)
        val tvPlaces: TextView = findViewById(R.id.tvPlaces)
        val tvRestaurant: TextView = findViewById(R.id.tvRestaurant)
        val tvMuseum: TextView = findViewById(R.id.tvMuseer)
        val tvParker: TextView = findViewById(R.id.tvParker)

        displayUsername.text = intent.getStringExtra("key")

        val btn_home: Button = findViewById(R.id.btn_home)

        btn_home.setOnClickListener{
            val homePage = Intent(this, MainActivity::class.java)
            startActivity(homePage)
        }

        tvPlaces.setOnClickListener{
            val link = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zleep.com/se/erbjudanden/stockholms-topp-10-utsikter/"))
            startActivity(link)
        }

        tvRestaurant.setOnClickListener{
            val link = Intent(Intent.ACTION_VIEW, Uri.parse("https://viewstockholm.com/sv/restauranger-stockholm/"))
            startActivity(link)
        }

        tvMuseum.setOnClickListener{
            val link = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.varldenshaftigaste.se/topplistor/stockholms-20-basta-museer/"))
            startActivity(link)
        }

        tvParker.setOnClickListener{
            val link = Intent(Intent.ACTION_VIEW, Uri.parse("https://viewstockholm.com/sv/stockholm-basta-parker/"))
            startActivity(link)
        }
    }
}