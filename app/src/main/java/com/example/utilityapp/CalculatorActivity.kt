package com.example.utilityapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {

    private lateinit var tvCalculatorMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        tvCalculatorMessage = findViewById(R.id.tvCalculatorMessage)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        tvCalculatorMessage.text = message
    }
}