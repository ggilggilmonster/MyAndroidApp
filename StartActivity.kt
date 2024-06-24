package com.example.myandroidapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tv_num = findViewById<TextView>(R.id.tv_number)
        val btn_dice = findViewById<Button>(R.id.btn_roll)

        btn_dice.setOnClickListener {

            val random = Random
            val num = random.nextInt(6) + 1

            tv_num.text = num.toString()

            Log.d("MainActivity", "num = ${num.toString()}")
        }
    }
}