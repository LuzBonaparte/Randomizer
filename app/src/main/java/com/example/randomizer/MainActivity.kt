package com.example.randomizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRoll = findViewById<Button>(R.id.buttonMainRoll)
        val buttonCoin = findViewById<Button>(R.id.buttonMainCoin)

        buttonRoll.setOnClickListener {
            startActivity(Intent(this,RollActivity::class.java))
        }

        buttonCoin.setOnClickListener {
            startActivity(Intent(this,CoingActivity::class.java))
        }
    }
}