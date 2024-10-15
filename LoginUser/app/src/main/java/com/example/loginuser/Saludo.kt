package com.example.loginuser

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Saludo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_saludo)



        val bundle = intent.extras
        val usuario = bundle?.getString("usuario")

        val tvu = findViewById<TextView>(R.id.saludoUsuario)
        val botonback = findViewById<Button>(R.id.VolverBoton)
        tvu.text = "Hola ${usuario}"

        botonback.setOnClickListener{
            val intento2 = Intent (this@Saludo, MainActivity::class.java)
            startActivity(intento2)
        }
        }
    }