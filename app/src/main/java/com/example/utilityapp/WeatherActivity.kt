package com.example.utilityapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WeatherActivity : AppCompatActivity() {

    private lateinit var tvWeatherMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        tvWeatherMessage = findViewById(R.id.tvWeatherMessage)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        tvWeatherMessage.text = message
    }
}