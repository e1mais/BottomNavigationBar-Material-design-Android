package com.example.lab5_pg.views.adapter

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab5_pg.R
import com.example.lab5_pg.model.champion
import com.example.lab5_pg.model.resultado
import com.example.lab5_pg.views.fragment_champions
import com.squareup.picasso.Picasso

class galeria_adapter (private val listChampion:List<champion>) :
        RecyclerView.Adapter<galeria_adapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate( R.layout.item_gallery ,parent,false)
            return ViewHolder(view)
        }

        class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
            val fotoImg:ImageView = item.findViewById(R.id.imgChampion)
            val tituloCampion: TextView = item.findViewById(R.id.tvJornada)
            val textoCampion: TextView = item.findViewById(R.id.tvEquipo)
            val textoCiudad: TextView = item.findViewById(R.id.tvCiudad)

            fun position(model:champion ){
                tituloCampion.text = model.jornada
                textoCampion.text = model.equipoCampion
                textoCiudad.text = model.ciudad
                Picasso.get().load(model.imgUrl).into(fotoImg)

            }
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.position(listChampion[position])
        }

        override fun getItemCount():Int = listChampion.size

    }

