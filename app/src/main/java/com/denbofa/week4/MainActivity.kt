package com.denbofa.week4

import android.content.Intent
import android.content.Intent.ACTION_CALL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var signUpClick: Button
    private lateinit var gameClick: Button
    private lateinit var contactClick: Button
    private lateinit var serviceClick: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpClick = findViewById(R.id.signUpBut)
        gameClick = findViewById(R.id.gameBut)
        contactClick = findViewById(R.id.contactBut)
        serviceClick = findViewById(R.id.serviceBut)

        signUpClick.setOnClickListener{
            val intent: Intent = Intent(this, SignUpActivity:: class.java)
            startActivity(intent)
        }

        gameClick.setOnClickListener{
            val intent: Intent = Intent(this, ColorListActivity:: class.java)
            startActivity(intent)
        }

        contactClick.setOnClickListener{
            val intent: Intent = Intent(this, CallUs:: class.java)
            startActivity(intent)
        }

        serviceClick.setOnClickListener{
            val intent: Intent = Intent(this, ServiceActivity:: class.java)
            startActivity(intent)
        }

    }
}

