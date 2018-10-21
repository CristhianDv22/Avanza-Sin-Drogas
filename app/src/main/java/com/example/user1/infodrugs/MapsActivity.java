package com.example.user1.infodrugs;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(4.8080726, -75.6885772);
        LatLng sydney1 = new LatLng(4.8151081, -75.7235224);
        LatLng sydney2 = new LatLng(-34, 135);
        LatLng sydney3 = new LatLng(-34, 125);
        LatLng sydney4 = new LatLng(-34, 143);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Cimder centro de reabilitación"));
        mMap.addMarker(new MarkerOptions().position(sydney1).title("Corporación la nueva primavera"));
        mMap.addMarker(new MarkerOptions().position(sydney2).title("Marker in Sydney"));
        mMap.addMarker(new MarkerOptions().position(sydney3).title("Marker in Sydney"));
        mMap.addMarker(new MarkerOptions().position(sydney4).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
