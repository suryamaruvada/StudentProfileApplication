package com.example.studentprofileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect XML layout
        setContentView(R.layout.activity_main)

        // Connect button with ID
        val showButton = findViewById<Button>(R.id.btnShow)

        // Button click listener
        showButton.setOnClickListener {

            // Show Toast message
            Toast.makeText(
                this,
                "Student Profile Details Displayed!",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}