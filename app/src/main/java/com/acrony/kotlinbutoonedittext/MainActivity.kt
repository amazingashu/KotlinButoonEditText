package com.acrony.kotlinbutoonedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnClick:Button
    lateinit var etName:EditText
    lateinit var tvView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnClick=findViewById(R.id.btnClick)
        tvView=findViewById(R.id.textView)
        etName=findViewById(R.id.etname)

        btnClick.setOnClickListener {
            Toast.makeText(applicationContext,"I am Clicked",Toast.LENGTH_LONG).show()
           // tvView.setText("I am TextView")
            tvView.setText(etName.text)
        }


    }
}
