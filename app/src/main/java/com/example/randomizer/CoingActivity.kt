package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class CoingActivity : AppCompatActivity() {

    lateinit var imageView1:  ImageView
    lateinit var button: Button
    lateinit var button2:Button

    val coinImages: IntArray = intArrayOf(

        R.drawable.moneda,
        R.drawable.moneda2


    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coing)


        imageView1=findViewById(R.id.imageView3)
        button=findViewById(R.id.buttonFlip)
        button2=findViewById(R.id.buttonBackF)


        button.setOnClickListener {
            val random= Random
            imageView1.setImageResource(coinImages[random.nextInt(coinImages.size)])


        }

        button2.setOnClickListener {
            finish()
        }
    }
}