package com.example.alltrailsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val signInABtn = findViewById<Button>(R.id.signInABtn)
        signInABtn.setOnClickListener {
            finish()
        }
    }
}