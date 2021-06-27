package com.denbofa.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ColorListActivity : AppCompatActivity() {
    private lateinit var homeClick: Button
    private lateinit var blueClick: Button
    private lateinit var pinkClick: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_list)

        homeClick = findViewById(R.id.home)
        blueClick = findViewById(R.id.blue)
        pinkClick = findViewById(R.id.pink)

        blueClick.setOnClickListener{
            val intent: Intent = Intent(this, BlueColorActivity:: class.java)
            startActivity(intent)
        }

        pinkClick.setOnClickListener{
            val intent: Intent = Intent(this, PinkColorActivity:: class.java)
            startActivity(intent)
        }

        homeClick.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity:: class.java)
            startActivity(intent)
        }

    }
}