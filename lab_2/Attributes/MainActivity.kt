package com.example.attributes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val text = findViewById<EditText>(R.id.editText)

        val button_text_b = findViewById<Button>(R.id.button_text_black)
        val button_text_r = findViewById<Button>(R.id.button_text_red)

        val button_8sp = findViewById<Button>(R.id.button_8sp)
        val button_24sp = findViewById<Button>(R.id.button_24sp)

        val button_background_w = findViewById<Button>(R.id.button_background_white)
        val button_background_y = findViewById<Button>(R.id.button_background_yellow)


        button_text_b.setOnClickListener {
            text.setTextColor(Color.BLACK)
        }
        button_text_r.setOnClickListener {
            text.setTextColor(Color.RED)
        }

        button_8sp.setOnClickListener {
            text.setTextSize(8f)
        }
        button_24sp.setOnClickListener {
            text.setTextSize(24f)
        }

        button_background_w.setOnClickListener {
            text.setBackgroundColor(Color.WHITE)
        }
        button_background_y.setOnClickListener {
            text.setBackgroundColor(Color.YELLOW)
        }
    }
}