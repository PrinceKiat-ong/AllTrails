package com.example.alltrailsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpABtn = findViewById<Button>(R.id.signUpABtn)
        signUpABtn.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }

        val signInBtn = findViewById<Button>(R.id.signInBtn)
        signInBtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}