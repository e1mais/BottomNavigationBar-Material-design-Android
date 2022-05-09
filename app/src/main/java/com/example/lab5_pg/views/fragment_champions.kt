package com.example.lab5_pg.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab5_pg.R
import com.example.lab5_pg.model.champion
import com.example.lab5_pg.model.resultado
import com.example.lab5_pg.views.adapter.galeria_adapter

class fragment_champions : Fragment() {

    private lateinit var adapter_gallery:galeria_adapter
//    private val detail : List<resultado> = listOf(
//        resultado(
//            "https://img.uefa.com/imgml/TP/teams/logos/140x140/52914.png",
//            "https://img.uefa.com/imgml/TP/teams/logos/140x140/52919.png",
//            "1 - 0"
//        ),
//        resultado(
//            "https://img.uefa.com/imgml/TP/teams/logos/140x140/52747.png",
//            "https://img.uefa.com/imgml/TP/teams/logos/140x140/50037.png",
//            "0 - 1"
//        ),
//        resultado(
//            "https://img.uefa.com/imgml/TP/teams/logos/140x140/1652.png",
//            "https://img.uefa.com/imgml/TP/teams/logos/140x140/7889.png",
//            "0 - 2"
//        )
//    )
    private val galleriaList: List<champion> = listOf(
        champion(
            "Chelsea Football Club",
            "Oporto",
            "Champions 2021",
            "https://th.bing.com/th/id/R.9c3f4b94970b55588282b9c028f60e4c?rik=rI72rDXKIEmtNQ&pid=ImgRaw&r=0"
        ),
        champion(
            "Bayern Munich",
            "Lisboa",
            "Champions 2020",
            "https://th.bing.com/th/id/OIP.5I8xDopYMhiyPz4_pxOsZQHaE8?pid=ImgDet&rs=1"
        ),
        champion(
            "Liverpool",
            "Madrid",
            "Champions 2019",
            "https://depesoyucatan.com/wp-content/uploads/2019/06/D8AXGebX4AEUT06.jpg"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_champions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycle = view.findViewById<RecyclerView>(R.id.reciclerViewChampion)

        recycle.apply { layoutManager = LinearLayoutManager(activity)
            adapter_gallery = galeria_adapter(galleriaList)
            adapter = adapter_gallery
        }

    }

}