package com.example.tiketbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val daftar = findViewById<Button>(R.id.btnDaftar)
        daftar.setOnClickListener {
            val intent = Intent(this, Register_page::class.java)
            startActivity(intent)
        }
    }
}