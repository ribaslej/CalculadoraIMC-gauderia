package com.example.calculadoraimc

import android.content.Intent
import android.os.Bundle
import android.provider.Settings.Global.putString
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PESO: String = "EXTRA_PESO"
        const val EXTRA_ALTURA: String = "EXTRA_ALTURA"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val peso = findViewById<EditText>(R.id.peso)
        val altura = findViewById<EditText>(R.id.altura)
        val calcular = findViewById<Button>(R.id.calcular)
        calcular.setOnClickListener {
            val intent = Intent(this, ResultadoIMC::class.java)
            val passPeso = peso.getText().toString()
            val passAltura = altura.getText().toString()

            intent.putExtra("EXTRA_PESO", passPeso)
            intent.putExtra("EXTRA_ALTURA", passAltura)

            startActivity(intent)
        }
    }
}