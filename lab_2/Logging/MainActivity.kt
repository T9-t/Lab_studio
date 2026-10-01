package com.example.logging

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.EditText
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val text = findViewById<EditText>(R.id.editText)
        val logButton = findViewById<Button>(R.id.button_log)
        val timberButton = findViewById<Button>(R.id.button_timber)

        logButton.setOnClickListener {
            val textToLog = text.text.toString()
            Log.v("From EditText", textToLog)
        }

        Timber.plant(Timber.DebugTree())

        timberButton.setOnClickListener {
            val textToLog = text.text.toString()
            Timber.v(textToLog)
        }
    }
}