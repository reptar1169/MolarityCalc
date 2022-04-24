package com.example.calc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun getVol(view: View){

            val mw: EditText = findViewById(R.id.mw_edit_text)
            val mass: EditText = findViewById(R.id.mass_edit_text)
            val conc: EditText = findViewById(R.id.conc_edit_text)
            val numMW = mw.text.toString().toFloat()
            val numMass = mass.text.toString().toFloat()
            val numConc = conc.text.toString().toFloat()

            val mwxmass = numMass / ((numConc/1000) * (numMW/1000))

            val tvVol = findViewById<TextView>(R.id.vol_text_view)

            val result = mwxmass.toString()

                tvVol.text = result


        }

    }



