package com.example.picturerep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureRepOne : AppCompatActivity() {
    lateinit var btnNextTwo:Button
    lateinit var btnBackOne:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_rep_one)
        btnNextTwo= findViewById(R.id.btnNextTwo)
        btnNextTwo.setOnClickListener {
            val intent= Intent(this,pictureRepTwo::class.java)
            startActivity(intent)
        }
        btnBackOne= findViewById(R.id.btnBackOne)
        btnBackOne.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}