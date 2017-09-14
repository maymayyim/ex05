package com.egco428.ex05

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var myUser = hashMapOf<String, String>("username" to "maymayyim", "password" to "123456")
        val bundle = intent.extras
        var user: String = ""
        var pass: String = ""
        if(bundle != null) {
            user = bundle.getString("user")
            pass = bundle.getString("pass")
        }

        if(myUser["username"].equals(user) && myUser["password"].equals(pass)){
            username1.text = user
            password1.text = pass
        }else{
            finish()
        }


    }
}
