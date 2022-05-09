package com.example.lab5_pg.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.lab5_pg.R
import com.example.lab5_pg.databinding.ActivityMenuBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class menu_activity : AppCompatActivity(){

    private lateinit var binding : ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val menuFuvol: BottomNavigationView = binding.btnNavigation
        setupWithNavController(menuFuvol , findNavController(this, R.id.frag_navgraph))
    }
}