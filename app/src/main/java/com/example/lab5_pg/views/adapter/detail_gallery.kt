package com.example.lab5_pg.views.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab5_pg.R
import com.example.lab5_pg.model.resultado
import com.squareup.picasso.Picasso

class detail_gallery (private val listResultado:List<resultado>) :
    RecyclerView.Adapter<detail_gallery.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail ,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        val fotoLocal : ImageView = item.findViewById(R.id.imgLocal)
        val fotoVisit : ImageView = item.findViewById(R.id.imgVisit)
        val tvResult : TextView = item.findViewById(R.id.tvResultado)

        fun position(model: resultado){
            Picasso.get().load(model.imgLocal).into(fotoLocal)
            Picasso.get().load(model.imgVisit).into(fotoVisit)
            tvResult.text = model.tvResultado
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.position(listResultado[position])
    }

    override fun getItemCount():Int = listResultado.size

}