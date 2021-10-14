package com.example.parsexmlretrofit

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var tvName : TextView
    lateinit var tvUri : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        val aName = intent.getStringExtra("aName")
        val aUri = intent.getStringExtra("aUri")
        tvName = findViewById(R.id.textView2)
        tvUri = findViewById(R.id.textView3)
        tvName.text=aName
        tvUri.text=aUri
    }
}