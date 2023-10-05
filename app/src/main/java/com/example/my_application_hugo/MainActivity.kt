package com.example.my_application_hugo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        splash()

        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)

        var resultado = findViewById<TextView>(R.id.resultado)


        val botonSaludar = findViewById<Button>(R.id.botonSaludar)

        botonSaludar.setOnClickListener {

            var num1 = numero1.text.toString().toInt()
            var num2 = numero2.text.toString().toInt()

            resultado.setText(sumar(num1, num2).toString())



        }

        val btnCambiar = findViewById<Button>(R.id.btnCambiar)

        btnCambiar.setOnClickListener {

        }



    }

    fun sumar(numero1:Int, numero2:Int): Int{

        return numero1 + numero2

    }

    fun cambiar(){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun splash(){
        object: CountDownTimer(5600, 1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val intent = Intent(applicationContext, MainActivity2::class.java).apply {  }
                startActivity(intent)
                finish()
            }

        }.start()
    }
}