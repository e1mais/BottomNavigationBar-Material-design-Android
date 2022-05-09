package com.example.lab5_pg.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.lab5_pg.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsViewer : Fragment(), OnMapReadyCallback {

    private lateinit var mapUbication : GoogleMap

    private var latitude:Double = 0.0
    private var longitud:Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            latitude = it.getDouble("keyLat")
            longitud = it.getDouble("keyLong")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_maps_viewer, container, false)
        createMap()
        return view
    }

    override fun onMapReady(p0: GoogleMap) {
        mapUbication = p0
        setLocation(latitude, longitud)
    }

    fun createMap (){
        val mapFragment = childFragmentManager.findFragmentById(R.id.fragMap) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }

    fun setLocation(latitude:Double, longitud:Double){
        val ubication = LatLng(latitude, longitud)
        val marker : MarkerOptions = MarkerOptions().position(ubication).title("Cerca el hospital aleman")
        mapUbication.addMarker(marker)
        mapUbication.animateCamera( CameraUpdateFactory.newLatLngZoom(ubication, 10f ), 2000, null)
    }
}