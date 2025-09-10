package com.example.examen1_valdezfrancisco

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val traducir: Button = findViewById(R.id.btnTraducir)
        val convertir: Button = findViewById(R.id.btnConvertir)
        val abajo: Button = findViewById(R.id.btnAbajo)
        var opcion: TextView = findViewById(R.id.txtOpcion)
        val palabra: EditText = findViewById(R.id.txtPalabra)

        traducir.setOnClickListener {
            opcion.text = "Palabra a Traducir: "
            abajo.text = "TRADUCEME!"
            if (palabra.text.isNotBlank()){
                abajo.setOnClickListener {
                    if (palabra != null){
                        val map= mapOf("i" to "1",
                            "3" to "e",
                            "6" to "a",
                            "7" to "n")
                        for ((key, value) in map){

                        }
                    } else{
                        palabra.text.toString()
                    }
                }
            } else{
            }
        }

        convertir.setOnClickListener {
            opcion.text = "Palabra a Traducir: "
            abajo.text = "TRADUCEME!"
            if (palabra.text.isNotBlank()){
                abajo.setOnClickListener {
                    if (palabra != null){
                        val map= mapOf("i" to "1",
                            "e" to "3",
                            "a" to "6",
                            "n" to "7")
                        for (letra){

                        }
                    } else{
                        palabra.text.toString()
                    }
                }
            } else{
            }
        }



    }
}