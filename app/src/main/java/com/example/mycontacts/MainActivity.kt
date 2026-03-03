package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
val firstName = "Leelah"
val lastName = "Jaffer"
val address = "70 Ice Cream Road, Cape Town"
val isMale = false
val dayOfBirth = "15"
val monthOfBirth = "June"
val yearOfBirth = "2007"
        println(firstName)
        println(lastName)
        println(address)
        println(isMale)
        println(dayOfBirth)
        println(monthOfBirth)
        println(yearOfBirth)



        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}