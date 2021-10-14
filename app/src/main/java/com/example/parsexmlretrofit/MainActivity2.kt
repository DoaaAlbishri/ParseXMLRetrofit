package com.example.parsexmlretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //get data from intent
        val intent = intent
        val authers = intent.getStringArrayListExtra("authors")
        tv = findViewById(R.id.textView)
        tv.text =""

    }
}