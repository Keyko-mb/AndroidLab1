package com.example.mycalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result: TextView = findViewById<TextView>(R.id.result)
        val firstNum: EditText = findViewById<EditText>(R.id.number1)
        val secondNum: EditText = findViewById<EditText>(R.id.number2)

        val addition: Button = findViewById<Button>(R.id.addition)
        val subtraction: Button = findViewById<Button>(R.id.subtraction)
        val multiplication: Button = findViewById<Button>(R.id.multiplication)
        val division: Button = findViewById<Button>(R.id.division)


        addition.setOnClickListener {
            result.text = (firstNum.text.toString().toDouble() + secondNum.text.toString().toDouble()).toString()
        }

        subtraction.setOnClickListener {
            result.text = (firstNum.text.toString().toDouble() - secondNum.text.toString().toDouble()).toString()
        }

        multiplication.setOnClickListener {
            result.text = (firstNum.text.toString().toDouble() * secondNum.text.toString().toDouble()).toString()
        }

        division.setOnClickListener {
            if (secondNum.text.toString().equals("0")) result.text = "Деление на 0"
            else result.text = (firstNum.text.toString().toDouble() / secondNum.text.toString().toDouble()).toString()
        }

    }

}