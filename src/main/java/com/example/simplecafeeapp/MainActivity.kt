package com.example.simplecafeeapp

import android.widget.TextView
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rbRobusta = findViewById<RadioButton>(R.id.rbRobusta)
        val rbExpresso = findViewById<RadioButton>(R.id.rbEspresso)
        val rbLuwak = findViewById<RadioButton>(R.id.rbLuwak)

        val cbCream = findViewById<CheckBox>(R.id.cbCream)
        val cbSugar = findViewById<CheckBox>(R.id.cbSugar)

        val rbFriedRice = findViewById<RadioButton>(R.id.rbFriedRice)
        val rbFriedNoodle = findViewById<RadioButton>(R.id.rbFriedNoodle)
        val tvTotal = findViewById<TextView>(R.id.tvTotal)
        val payButton = findViewById<Button>(R.id.btnPay)

        payButton.setOnClickListener {

            var totalPrice = 0

            // Coffee Type
            if (rbRobusta.isChecked) {
                totalPrice += 10000
            }

            if (rbExpresso.isChecked) {
                totalPrice += 20000
            }

            if (rbLuwak.isChecked) {
                totalPrice += 30000
            }

            // Mix Type
            if (cbCream.isChecked) {
                totalPrice += 1000
            }

            if (cbSugar.isChecked) {
                totalPrice += 500
            }

            // Added Menu
            if (rbFriedRice.isChecked) {
                totalPrice += 10000
            }

            if (rbFriedNoodle.isChecked) {
                totalPrice += 15000
            }

            tvTotal.text = "Rp. $totalPrice"

        }
    }
}