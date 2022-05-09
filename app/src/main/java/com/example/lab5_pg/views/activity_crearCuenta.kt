package com.example.lab5_pg.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.lab5_pg.R
import com.example.lab5_pg.databinding.ActivityCrearCuentaBinding

class activity_crearCuenta : AppCompatActivity() {
    private lateinit var binding: ActivityCrearCuentaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCrearCuentaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val toolbar : Toolbar = binding.toolCrearCuenta

        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("Crear cuenta")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.btnCrearCuenta.setOnClickListener{
            Toast.makeText(this, "El usuario ha sido creado", Toast.LENGTH_SHORT).show()
            finish()

        }
    }
}