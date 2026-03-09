package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.util.Log.d

class MainActivity : AppCompatActivity() {
    private val isMal: Any
        get() {
            TODO()
        }

    override fun onCreate(savedInstanceState: Bundle?) {




        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
val firstName = "Leelah"
val lastName = "Jaffer"
val address = "Cape Town"
val isMale = false
val dayOfBirth = "15"
val monthOfBirth = "June"
val yearOfBirth = 2007
       Log.d(
           "Good Morning",firstName+"" + lastName+"from"+address+", you are a"+isMale+
                   "and you're born on"+dayOfBirth+"" + monthOfBirth+"" + yearOfBirth)

// the current year
val currentYear = 2026

// Calculate age
val age = currentYear - yearOfBirth

// Years until 100
val yearsUntil100 = 100 - age

// Age in months
val ageInMonths = age * 12

// Age in days (skip leap years)
val ageInDays = age * 365

// Remainder when age divided by 5
val remainder = age % 5

        Log.d("ContactActivity", "Current Age: $age")
        Log.d("ContactActivity", "Years until 100: $yearsUntil100")
        Log.d("ContactActivity", "Age in Months: $ageInMonths")
        Log.d("ContactActivity", "Age in Days (no leap years): $ageInDays")
        Log.d("ContactActivity", "Remainder when age ÷ 5: $remainder")










        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}