package com.kajan.rolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

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

        var drawable_Resource = when(random){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        roll_text.text = random.toString()
        diceImage = findViewById(R.id.dice_img)
        diceImage.setImageResource(drawable_Resource)
    }
}
