package com.example.gpsmapappversion2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
//AL EJECUTAR LA APLICACION USAR CLICK IZQ REPETIDAMENTE PARA HACER ZOOM EL BOTON + TIENDE A BUGEAR EL MAPA//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        LatLng ovalle = new LatLng(-30.60234931192974, -71.19912068509755);
        googleMap.addMarker(new MarkerOptions().position(ovalle).title("Ovalle"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(ovalle));

    }
}