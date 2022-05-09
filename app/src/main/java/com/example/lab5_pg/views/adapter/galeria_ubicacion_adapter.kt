package com.example.lab5_pg.views.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.lab5_pg.R
import com.example.lab5_pg.model.equipos
import com.squareup.picasso.Picasso


class galeria_ubicacion_adapter (private val listStadium:List<equipos>):
        RecyclerView.Adapter<galeria_ubicacion_adapter.ViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gallery_stadium, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder (item: View): RecyclerView.ViewHolder(item){
        val fotoStadio: ImageView = item.findViewById(R.id.imgStadium)
        val fotoEscudo: ImageView = item.findViewById(R.id.imgLogo)
        val txtEquipo: TextView = item.findViewById(R.id.tvTeam)
        val btnLocation : ImageButton = item.findViewById(R.id.btnLocation)

        fun position(equipos: equipos){
            Picasso.get().load(equipos.estadioUrl).into(fotoStadio)
            Picasso.get().load(equipos.escudoUrl).into(fotoEscudo)
            txtEquipo.text = equipos.nombreEquipo
            val bundle: Bundle = Bundle()
                bundle.putDouble("keyLat", equipos.latitude)
                bundle.putDouble("keyLong", equipos.longitud)

            btnLocation.setOnClickListener{
                it.findNavController().navigate(R.id.action_goto_fragment4_to_mapsViewer,bundle)
            }
        }
    }
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.position(listStadium[position])
        }

        override fun getItemCount():Int = listStadium.size
        }
