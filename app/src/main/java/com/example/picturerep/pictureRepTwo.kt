package com.example.picturerep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureRepTwo : AppCompatActivity() {
    lateinit var btnNextThree:Button
    lateinit var btnBackTwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_rep_two)
        btnNextThree= findViewById(R.id.btnnextThree)
        btnNextThree.setOnClickListener {
            val intent= Intent(this,pictureRepThree::class.java)
            startActivity(intent)
        }
        btnBackTwo= findViewById(R.id.btnBackTwo)
        btnBackTwo.setOnClickListener {
            val intent= Intent(this,pictureRepOne::class.java)
            startActivity(intent)
        }
    }
}