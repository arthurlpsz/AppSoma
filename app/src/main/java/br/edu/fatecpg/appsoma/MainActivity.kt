package br.edu.fatecpg.appsoma

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edtNum1 = findViewById<EditText>(R.id.edt_num1)
        val edtNum2 = findViewById<EditText>(R.id.edt_num2)
        val btnCalc = findViewById<Button>(R.id.btn_calc)
        val btnSubt = findViewById<Button>(R.id.btn_subt)
        val btnMult = findViewById<Button>(R.id.btn_mult)
        val btnDivide = findViewById<Button>(R.id.btn_divide)
        val txtResultado = findViewById<TextView>(R.id.txv_resultado)

        btnCalc.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1 + valor2
            txtResultado.text = "O resultado é: $resultado"
        }

        btnSubt.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1 - valor2
            txtResultado.text = "O resultado é: $resultado"
        }

        btnMult.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1 * valor2
            txtResultado.text = "O resultado é: $resultado"
        }

        btnDivide.setOnClickListener {
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1 / valor2
            txtResultado.text = "O resultado é: $resultado"
        }
    }
}