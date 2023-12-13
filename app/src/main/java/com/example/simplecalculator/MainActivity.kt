package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // instantiate the user interface elements
    lateinit var Mtitle: TextView
    lateinit var Jina: EditText
    lateinit var btnSubmit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Mtitle = findViewById(R.id.MtvTitle)
        Jina = findViewById(R.id.TvName)
        btnSubmit = findViewById(R.id.BtnSubmit)
        btnSubmit.setOnClickListener {
            var enteredName = Jina.text.toString()

            if (enteredName == ""){
                Mtitle.text = ""
                Toast.makeText(this@MainActivity,
                    "please enter your name!",
                    Toast.LENGTH_SHORT).show()
            }else{
                var message = "Welcome $enteredName "
                Mtitle.text = message
            }


        }




    }
}