package com.example.vsconnect_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vsconnect_kotlin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    //É propriedade privada como o nome binding do tipo ActivityLoginBinding
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Atribui a variavel binding um objeto que contem referencias(propriedades)
        // aos elementos definidos no layout
        binding = ActivityLoginBinding.inflate(layoutInflater)

        //acessa a informação do layout botäo(id = btnEntrar)
        //ao clicar setOnClickListener {  } ouvinte de clique
        //val náo pode modificar o valor padráo
        //ponto de partida ------ onde qeur ir
        //sair do login e ir para mainActivity
        binding.btnEntrar.setOnClickListener {
            //criar uma variavel(mainIntent) com a intenção de sair e LoginActivity ir para mainActivity
           val mainIntent = Intent(this@LoginActivity,
               MainActivity::class.java)

            //inicia a intenlçao de or para ian activity
            startActivity(mainIntent)

            //finaliza login
            finish()
        }
        setContentView(binding.root)

    }
}