package com.example.utilityapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnOpenCalculator: Button
    private lateinit var btnOpenWeather: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenCalculator = findViewById(R.id.btnOpenCalculator)
        btnOpenWeather = findViewById(R.id.btnOpenWeather)

        btnOpenCalculator.setOnClickListener {
            val intent = Intent().apply {
                action = "com.example.myapplication.OPEN"
                putExtra("EXTRA_MESSAGE", "Welcome to the Calculator App")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }

        btnOpenWeather.setOnClickListener {
            val intent = Intent().apply {
                action = "com.example.exam1.OPEN"
                putExtra("EXTRA_MESSAGE", "Welcome to the Weather App")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}