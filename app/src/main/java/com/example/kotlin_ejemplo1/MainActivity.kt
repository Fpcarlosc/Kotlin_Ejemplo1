package com.example.kotlin_ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)
        val texto = findViewById<TextView>(R.id.textView)

        boton.setOnClickListener{texto.text = cambiarTexto()}
    }

   /* fun cambiarTexto():String{
        return "hola"
    }*/
    fun cambiarTexto() = "hola"
}
