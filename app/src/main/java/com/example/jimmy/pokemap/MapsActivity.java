package com.example.jimmy.pokemap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng squirtle = new LatLng(-33.9164579,150.8989448);
        mMap.addMarker(new MarkerOptions().position(squirtle).title("Squirtle Found").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));

        LatLng squirtle1 = new LatLng(-29.9194179,147.8989448);
        mMap.addMarker(new MarkerOptions().position(squirtle1).title("Squirtle Found").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));

        LatLng squirtle2 = new LatLng(-34.9114579,148.6189448);
        mMap.addMarker(new MarkerOptions().position(squirtle2).title("Squirtle Found").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));

        LatLng squirtle3 = new LatLng(-37.9064579,144.8989648);
        mMap.addMarker(new MarkerOptions().position(squirtle3).title("Squirtle Found").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));

        LatLng squirtle4 = new LatLng(-39.9014579,151.2989548);
        mMap.addMarker(new MarkerOptions().position(squirtle4).title("Squirtle Found").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));

        LatLng squirtle5 = new LatLng(-44.8664579,158.498988);
        mMap.addMarker(new MarkerOptions().position(squirtle5).title("Squirtle Found").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));

        LatLng squirtle6 = new LatLng(-31.7964579,161.1986448);
        mMap.addMarker(new MarkerOptions().position(squirtle6).title("Squirtle Found").icon(BitmapDescriptorFactory.fromResource(R.drawable.a)));

    }
}


