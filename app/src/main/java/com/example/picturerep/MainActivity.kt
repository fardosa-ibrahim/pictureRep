package com.example.picturerep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNextOne:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNextOne = findViewById(R.id.btnNextOne)
        btnNextOne.setOnClickListener {
            val intent= Intent(this,pictureRepOne::class.java)
            startActivity(intent)
        }
    }
}