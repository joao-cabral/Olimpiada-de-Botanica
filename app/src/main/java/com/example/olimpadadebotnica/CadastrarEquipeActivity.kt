package com.example.olimpadadebotnica

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastrar_equipe.*

class CadastrarEquipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_equipe)

        button_avancar.setOnClickListener {
            val intent = Intent(this, EscolherArvoreActivity::class.java)
            startActivity(intent)
        }
    }
}
