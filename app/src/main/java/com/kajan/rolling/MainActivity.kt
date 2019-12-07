package com.kajan.rolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var roll_Button: Button = findViewById(R.id.roll_button)
        roll_Button.text = "roll dice"

        roll_Button.setOnClickListener {
            Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
        }
    }
}
