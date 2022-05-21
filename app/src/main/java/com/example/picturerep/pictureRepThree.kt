package com.example.picturerep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureRepThree : AppCompatActivity() {
    lateinit var btnNextFour: Button
    lateinit var btnBackThree: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_rep_three)
        btnNextFour = findViewById(R.id.btnNextFour)
        btnNextFour.setOnClickListener {
            val intent = Intent(this, pictureRepFour::class.java)
            startActivity(intent)
        }
        btnBackThree = findViewById(R.id.btnBackThree)
        btnBackThree.setOnClickListener {
            val intent = Intent(this, pictureRepTwo::class.java)
            startActivity(intent)
        }
    }
}