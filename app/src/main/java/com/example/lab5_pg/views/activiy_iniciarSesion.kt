package com.example.lab5_pg.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.lab5_pg.R
import com.example.lab5_pg.databinding.ActivityActiviyIniciarSesionBinding

class activiy_iniciarSesion : AppCompatActivity() {

    private lateinit var binding : ActivityActiviyIniciarSesionBinding
    private val nombre:String = "elmais"
    private val contrasenia:String = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityActiviyIniciarSesionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnIniciar.setOnClickListener{

//            Toast.makeText(this, "${binding.txtCorreo.text} ${binding.txtPass.text}", Toast.LENGTH_SHORT ).show()

            if(binding.txtCorreo.text!!.toString() == nombre && binding.txtPass.text!!.toString() == contrasenia){
                val intent = Intent(this, menu_activity::class.java)
                startActivity(intent)
                return@setOnClickListener
            }else{
                Toast.makeText(this, "Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }

        binding.tvCrearCuenta.setOnClickListener {
            val intent = Intent(this, activity_crearCuenta::class.java)
            startActivity(intent)

        }
    }
}