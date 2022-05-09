package com.example.lab5_pg.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab5_pg.R
import com.example.lab5_pg.model.equipos
import com.example.lab5_pg.views.adapter.galeria_adapter
import com.example.lab5_pg.views.adapter.galeria_ubicacion_adapter

class fragment_teams : Fragment() {

    private lateinit var galeria_ubicacion: galeria_ubicacion_adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_teams, container, false)
    }

    private val listaDinamicaStadium: List<equipos> = listOf(
        equipos("Chelsea FC",
                "https://img.uefa.com/imgml/TP/teams/logos/140x140/52914.png",
                "https://dws2fz4z8ntt9.cloudfront.net/wp-content/uploads/sites/5/2018/04/chelsea-2.png",
            "Estadio Stanford Bridge",51.481756521157365, -0.19098868878558953
        ),
        equipos(
            "Bayern Munich",
            "https://img.uefa.com/imgml/TP/teams/logos/140x140/50037.png",
            "https://64.media.tumblr.com/5137592da85ff4908d3bda7e3e96f825/tumblr_p6d4c2mmwo1tz1baoo1_1280.png",
            "Estadio Allianze Arena",48.224362326378774, 11.624808024099636
        ),
        equipos(
            "Liverpool",
            "https://img.uefa.com/imgml/TP/teams/logos/140x140/7889.png",
            "https://www.fivestardays.com/content/img/product/large/family-liverpool-fc-stadium-18101041.jpg",
            "Estadio de Andfield",
            53.43089010550772, -2.960824637780438
        )

    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycle = view.findViewById<RecyclerView>(R.id.rcStadios)

        recycle.apply { layoutManager = LinearLayoutManager(activity)
            galeria_ubicacion = galeria_ubicacion_adapter(listaDinamicaStadium)
            adapter = galeria_ubicacion
        }

    }


}