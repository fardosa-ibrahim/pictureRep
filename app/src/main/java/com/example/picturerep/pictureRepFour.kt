package com.example.picturerep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureRepFour : AppCompatActivity() {
    lateinit var btnBackFour: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_rep_four)
        btnBackFour = findViewById(R.id.btnBackFour)
        btnBackFour.setOnClickListener {
            val intent = Intent(this, pictureRepThree::class.java)
            startActivity(intent)
        }
    }
}