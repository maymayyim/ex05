package com.egco428.ex05

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBtn.setOnClickListener {
            var intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("user",username.text.toString())
            intent.putExtra("pass",password.text.toString())
            startActivity(intent)

        }
        cancelBtn.setOnClickListener {
            username.setText("")
            password.setText("")
        }
    }
}
