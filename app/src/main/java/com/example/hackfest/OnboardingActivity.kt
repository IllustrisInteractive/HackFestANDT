package com.example.hackfest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class OnboardingActivity: AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding)

        val next1 = findViewById<Button>(R.id.button).setOnClickListener {
            var intent: Intent = Intent(this, OnboardingActivity1::class.java)
            startActivity(intent)
        }
    }
}