package com.example.olimpadadebotnica

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_codigo_sala2.*

class CodigoSala2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_codigo_sala2)

        button_entrar_guia.setOnClickListener {
            val intent = Intent(this, CadastrarEquipeActivity::class.java)
            startActivity(intent)
        }
    }
}
