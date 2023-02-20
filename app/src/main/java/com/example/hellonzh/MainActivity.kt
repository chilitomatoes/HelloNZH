package com.example.hellonzh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instance Name : Type / Class Name
class MainActivity : AppCompatActivity() {
    //onCreate = main function
    // fun = function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Load UI to memory
        //R = resources
        setContentView(R.layout.activity_main)

        //Linking UI to program
        //Declare variable here
        //val = value (displayed), var = variable (user input)
        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val textViewName: TextView = findViewById(R.id.textViewName)
        val buttonShow: Button = findViewById(R.id.buttonShow) // preferred
        val buttonHide = findViewById<Button>(R.id.buttonHide) // casting

        //Insert event handler
        buttonShow.setOnClickListener {
            imageViewQR.visibility = View.VISIBLE
            textViewName.visibility = View.VISIBLE
        }

        buttonHide.setOnClickListener {
            imageViewQR.visibility = View.INVISIBLE
            textViewName.visibility = View.INVISIBLE
        }
    }
}