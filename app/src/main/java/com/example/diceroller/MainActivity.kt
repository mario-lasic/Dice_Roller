package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.btn_roll)
        rollButton.text = "Roll a dice!"
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val diceText: TextView = findViewById(R.id.txt_diceRoll)
        val randomInt = Random().nextInt(6) + 1
        diceText.text = randomInt.toString()
    }
}