package com.denbofa.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PinkColorActivity : AppCompatActivity() {
    private lateinit var displayClick: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pink_color)

        displayClick = findViewById(R.id.colorDis)

        displayClick.setOnClickListener{
            val intent: Intent = Intent(this, ColorListActivity:: class.java)
            startActivity(intent)
        }

    }
}