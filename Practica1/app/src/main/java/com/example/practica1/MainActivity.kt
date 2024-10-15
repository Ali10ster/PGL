package com.example.practica1

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

        //Acceso a los componentes
        val textoIntroducido = findViewById<EditText>(R.id.texto)
        val textoInicio = findViewById<EditText>(R.id.inicioText)
        val textoFinal = findViewById<EditText>(R.id.finalText)
        val botonInvertir = findViewById<Button>(R.id.botonInvertir)
        val botonSubcadena = findViewById<Button>(R.id.botonSubcadena)
        val resultadoInvertido = findViewById<TextView>(R.id.resultadoInvertido)
        val resultadoSubcadena = findViewById<TextView>(R.id.resultadoSubcadena)


        //Eventos
        botonInvertir.setOnClickListener {
            resultadoInvertido.text = textoIntroducido.text.toString().reversed()
        }
        botonSubcadena.setOnClickListener {
            try {
                resultadoSubcadena.text = textoIntroducido.text.substring(textoInicio.text.toString().toInt(), textoFinal.text.toString().toInt())
            }catch (e:Exception){
                resultadoSubcadena.text = "hola"
            }

        }

    }
}