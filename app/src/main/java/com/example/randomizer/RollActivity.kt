package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class RollActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var button: Button
    lateinit var button2 : Button

    val rollImages: IntArray = intArrayOf(

        R.drawable.uno,
        R.drawable.dos,
        R.drawable.ntres,
        R.drawable.cuatro,
        R.drawable.cinco,
        R.drawable.seis



    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll)


        imageView=findViewById(R.id.imageView)
        button=findViewById(R.id.buttonRRoll)
        button2=findViewById(R.id.buttonBack)


        button.setOnClickListener {
            val random=Random
            imageView.setImageResource(rollImages[random.nextInt(rollImages.size)])


        }

        button2.setOnClickListener {
            finish()
        }


    }
}