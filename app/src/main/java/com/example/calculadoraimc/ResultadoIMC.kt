package com.example.calculadoraimc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_resultado_imc.*


class ResultadoIMC : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_imc)

        initToolbar()
        calcularIMC()

    }

    private fun calcularIMC() {
        intent = getIntent()
        val peso = intent.getStringExtra(MainActivity.EXTRA_PESO)?.toFloat()
        val altura = intent.getStringExtra(MainActivity.EXTRA_ALTURA)?.toFloat()
        val imc = peso!! / (altura!! * altura)
        var textView = findViewById<TextView>(R.id.resultIMC)
        if (imc < 18.5) {
            resultIMC.text = "O seu IMC é:\n" + "%.2f".format(imc)
            textView.setTextColor(Color.parseColor("#FF018786"))
        }
        else if (imc >= 18.6 && imc < 25) {
            resultIMC.text = "O seu IMC é:\n" + "%.2f".format(imc)
            textView.setTextColor(Color.parseColor("#0BCA12"))
        }
        else if (imc >= 25 && imc < 30) {
            resultIMC.text = "O seu IMC é:\n" + "%.2f".format(imc)
            textView.setTextColor(Color.parseColor("#BD8954"))
        }
        else if (imc >=30 && imc < 35) {
            resultIMC.text = "O seu IMC é:\n" + "%.2f".format(imc)
            textView.setTextColor(Color.parseColor("#F47F0B"))
        }
        else if (imc >= 35 && imc < 40) {
            resultIMC.text = "O seu IMC é:\n" + "%.2f".format(imc)
            textView.setTextColor(Color.parseColor("#FA0303"))
        }else {
            resultIMC.text = "O seu IMC é:\n" + "%.2f".format(imc)
            textView.setTextColor(Color.parseColor("#5E016E"))
        }
    }
    private fun initToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}