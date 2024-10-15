package com.example.loginuser

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Acceso a componentes
        val user = findViewById<EditText>(R.id.usuario)
        val pass = findViewById<EditText>(R.id.password)
        val botonentrar = findViewById<Button>(R.id.btenviar)

        botonentrar.setOnClickListener {

            if(user.text.toString().equals("Admin") && pass.text.toString().equals("1906Red")){
                val intento1 = Intent(this@MainActivity, Saludo::class.java)

                intento1.putExtra("usuario", user.text.toString())
                startActivity(intento1)
            }

        }





        }
    }