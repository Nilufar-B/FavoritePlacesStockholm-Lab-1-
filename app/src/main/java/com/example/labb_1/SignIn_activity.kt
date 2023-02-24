package com.example.labb_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import java.util.ArrayList


class User (val userName: String, val password: String)

class SignIn_activity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val submitButton: Button = findViewById(R.id.btnLogin)
        val registerButton: Button = findViewById(R.id.btnRegister)
        val userNameInput: TextInputEditText = findViewById(R.id.it_username)
        val passwordInput: EditText = findViewById(R.id.it_password)
        val btnHome: Button = findViewById(R.id.btn_home2)

        btnHome.setOnClickListener {
            val homePage = Intent(this, MainActivity::class.java)
            startActivity(homePage)
        }


        val users = arrayListOf(
            User("Clara", "Qwerty123"),
            User("Marc","12345"),
            User("Anneli", "Anneli000")
        )

        submitButton.setOnClickListener{

            val username: String = userNameInput.text.toString()
            val usersPassword: String = passwordInput.text.toString()

             for(user in users){
                 if (user.userName == username && user.password == usersPassword){
                  //   println("User exists")

                    val welcomePage = Intent(this, WelcomePage_activity::class.java).apply {
                         putExtra("key", userNameInput.text.toString())
                 }
                     startActivity(welcomePage)
                     break

             }else if(user.userName == username && user.password != usersPassword){
                     Toast.makeText(this,"Invalid password", Toast.LENGTH_SHORT).show()
                     break
             }
                 else{
                    // println("User doesn't exists")
                     Toast.makeText(this,"User not found!", Toast.LENGTH_SHORT).show()
                     break
             }


            }

        }

        //register new user but don't save in arrayList and if we go back and try to sign in again user not found

       registerButton.setOnClickListener{
           val username: String = userNameInput.text.toString()
           val password: String = passwordInput.text.toString()

        if (username.isNotEmpty() && password.isNotEmpty()){

                users.add(User(username, password))
            println("New user : $username, password: $password")

            val welcomePage = Intent(this, WelcomePage_activity::class.java).apply {
                putExtra("key", userNameInput.text.toString())

            }
            startActivity(welcomePage)

            }else{
                println("Empty")
            }
        }

    }
}


