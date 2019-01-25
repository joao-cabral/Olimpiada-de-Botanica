package com.example.olimpadadebotnica

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_jogar.setOnClickListener {
            val intent = Intent(this, CodigoSala2Activity::class.java)
            startActivity(intent)
        }

        button_guia.setOnClickListener {
            val intent = Intent(this, CadastrarGuiaActivity::class.java)
            startActivity(intent)
        }
    }
}
