package com.kajan.rolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var roll_Button: Button = findViewById(R.id.roll_button)
        roll_Button.text = "roll dice"

        roll_Button.setOnClickListener {
            roll()
        }
    }

    private fun roll() {
        var roll_text: TextView = findViewById(R.id.roll_text)
        var random = Random.nextInt(6)+1
        roll_text.text = random.toString()
    }
}
