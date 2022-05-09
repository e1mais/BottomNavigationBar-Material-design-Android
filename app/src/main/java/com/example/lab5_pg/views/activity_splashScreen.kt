package com.example.lab5_pg.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.compose.setContent
import com.example.lab5_pg.R
import com.example.lab5_pg.databinding.ActivitySplashScreenBinding
import java.io.IOException

class activity_splashScreen : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        try{
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash_screen)

            binding = ActivitySplashScreenBinding.inflate(layoutInflater)
            val view = binding.root
            setContentView(view)

            val animLoad = AnimationUtils.loadAnimation(this, R.anim.animacion)
            val imgLogo: ImageView = binding.img
            imgLogo.startAnimation(animLoad)

            val intent = Intent(this, activiy_iniciarSesion::class.java )

            animLoad.setAnimationListener(object : Animation.AnimationListener{

                override fun onAnimationStart(p0: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    startActivity(intent)
                    finish()
                }

                override fun onAnimationRepeat(p0: Animation?) {

                }
            })
        }catch (e : IOException){
            e.printStackTrace()
        }
    }
}