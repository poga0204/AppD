package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editName= findViewById<EditText>(R.id.text1)
        val button: Button = findViewById(R.id.Button)
        button.setOnClickListener{
            if(!editName.getText().toString().isEmpty())
            {
                Toast.makeText(this,"Hey!I'm ${editName.text.toString()} \n Go Corona go", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText( this,"Enter your name bro", Toast.LENGTH_SHORT).show()
            }

        }
    }
}