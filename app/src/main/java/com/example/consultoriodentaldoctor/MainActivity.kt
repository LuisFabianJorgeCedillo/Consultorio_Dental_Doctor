package com.example.consultoriodentaldoctor

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btniniciarseccion = findViewById<Button>(R.id.btniniciarseccion) as Button

        btniniciarseccion.setOnClickListener() {
            val intent = Intent(this@MainActivity, MainActivity2_inicioseccionpant::class.java)
            startActivity(intent)
        }

    }
}