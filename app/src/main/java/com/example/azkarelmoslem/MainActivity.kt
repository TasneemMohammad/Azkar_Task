package com.example.azkarelmoslem

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var context :  Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_azkar_el_sabah.setOnClickListener{

            intent = Intent(context , Azkar_El_Sabah::class.java)
            startActivity(intent)
        }

        btn_azkar_el_massaa.setOnClickListener{

            intent = Intent(context , Azkar_El_Masaa::class.java)
            startActivity(intent)
        }

    }
}
