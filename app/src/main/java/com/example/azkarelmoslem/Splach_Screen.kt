package com.example.azkarelmoslem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splach__screen.*

class Splach_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach__screen)

        tv_splach.alpha = 0f
        tv_splach.animate().setDuration(1500).alpha(1f).withEndAction{

            intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in , android.R.anim.fade_out)
            finish()
        }

    }
}
