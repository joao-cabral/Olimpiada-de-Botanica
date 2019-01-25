package com.example.olimpadadebotnica

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastrar_guia.*

class CadastrarGuiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_guia)

        button_avancar_guia.setOnClickListener {
            val intent = Intent(this, EscolherArvoreGuiaActivity::class.java)
            startActivity(intent)
        }
    }
}
