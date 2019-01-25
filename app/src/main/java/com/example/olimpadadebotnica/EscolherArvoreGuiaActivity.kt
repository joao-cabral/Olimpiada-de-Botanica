package com.example.olimpadadebotnica

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_escolher_arvore_guia.*

class EscolherArvoreGuiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escolher_arvore_guia)

        card_bromelia.setOnClickListener {
            val intent = Intent(this, BromeliaActivity::class.java)
            startActivity(intent)
        }

        card_heliconia.setOnClickListener {
            val intent = Intent(this, HeliconiaActivity::class.java)
            startActivity(intent)
        }
    }
}
