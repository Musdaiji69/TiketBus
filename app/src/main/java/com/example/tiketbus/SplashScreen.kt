package com.example.tiketbus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    //deklarasi variabel timer splash muncul
    private val SPLASH_TIME_OUT:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //kode untuk menjalankan activity selanjutnya
        Handler().postDelayed({
            startActivity(Intent(this, Register_page::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}