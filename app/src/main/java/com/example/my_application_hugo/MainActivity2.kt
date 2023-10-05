package com.example.my_application_hugo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val radio1 = findViewById<RadioButton>(R.id.radio1)
        val radio2 = findViewById<RadioButton>(R.id.radio2)
        val btnspiner = findViewById<Button>(R.id.btnspiner)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val opciones = arrayListOf<String>("Java", "kotlin", "C++", "GO")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones)

        spinner.adapter = adaptador

        btnspiner.setOnClickListener{
            when(spinner.selectedItem.toString()){
                "Java" -> Toast.makeText(this, "El mejor Lenguaje", Toast.LENGTH_LONG).show()
                "kotlin" -> Toast.makeText(this, "Kotlin", Toast.LENGTH_LONG).show()
                "C++" -> Toast.makeText(this, "C++", Toast.LENGTH_LONG).show()
                "GO" -> Toast.makeText(this, "Go", Toast.LENGTH_LONG).show()
            }
        }

        radio1.setOnClickListener(){
            Toast.makeText(this, "Presiono Radio 1", Toast.LENGTH_SHORT).show()
        }

    }

    fun cambiar2(){
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
}