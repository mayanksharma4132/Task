package com.example.hp.task;

import android.Manifest;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.JsonObject;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.annotations.MarkerViewOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.style.layers.PropertyFactory;
import com.mapbox.mapboxsdk.style.layers.SymbolLayer;
import com.mapbox.mapboxsdk.style.sources.GeoJsonSource;
import com.mapbox.mapboxsdk.style.sources.Source;

import java.util.ArrayList;
import java.util.List;

import static com.mapbox.mapboxsdk.style.layers.Property.NONE;
import static com.mapbox.mapboxsdk.style.layers.Property.VISIBLE;
import static com.mapbox.mapboxsdk.style.layers.PropertyFactory.visibility;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, MapboxMap.OnMapClickListener {


    private MapView mapView;
    private MapboxMap mapboxMap;
    private Marker marker;
    private ArrayList<MarkerView> markerViews;
    private MarkerView markerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting map instance
        Mapbox.getInstance(this, getString(R.string.access_token));
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);


    }
    @Override
    public void onMapReady(MapboxMap mapboxMap) {
        //initalizing map
        MainActivity.this.mapboxMap = mapboxMap;

        IconFactory iconFactory = IconFactory.getInstance(MainActivity.this);
        Icon icon = iconFactory.fromResource(R.drawable.a);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(26.971827, 76.398275)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(
                18.276589, 77.060687)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.b);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(28.406225, 77.179232)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(
                18.196402, 78.707029)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.c);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(29.275001, 76.841521)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(
                16.665994, 78.031607)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.d);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(28.201615, 76.334955)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(16.746858, 76.849618)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.e);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(27.796453, 75.765067)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(16.948868, 80.057873)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.f);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(27.754253, 77.706906)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(16.448868, 77.057873)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.g);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(28.894586, 75.372132)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(15.408322, 77.145115)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.h);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(28.561426, 74.485640)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(15.980097, 77.018473)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.i);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(28.910913, 78.044617)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(16.980097, 77.018473)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.j);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(27.534740, 77.073698)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(15.180097, 77.018473)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.k);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(29.830594, 75.955030)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(
                18.276589, 80.606654)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.l);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(26.971827, 76.398275)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(
                18.436852, 79.551306)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.m);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(28.392288, 74.899683)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(15.408322, 77.145115)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.n);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(28.910913, 78.04461)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(16.746858, 75.583201)).icon(icon));
        icon = iconFactory.fromResource(R.drawable.o);
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(29.594414, 74.527854)).icon(icon));
        mapboxMap.addMarker(new MarkerOptions().position(new LatLng(16.9542, 76.4620)).icon(icon));

        double lat = 27.6084;
        double lng = 74.9644;
        List<Feature> markerCordinates = new ArrayList<>();

        // for delhi area
        for(int i=0;i<10;i++)
        {
            markerCordinates.add(Feature.fromGeometry(Point.fromLngLat(lng,lat)));
            lat=lat+0.25;
        }
        lat = 27.6084;
        lng = 74.9644;
        lng+=0.25;
        for(int i=0;i<10;i++){

            markerCordinates.add(Feature.fromGeometry(Point.fromLngLat(lng,lat)));
            lng=lng+0.25;
        }

        FeatureCollection featureCollection = FeatureCollection.fromFeatures(markerCordinates);
        Source geoJsonSource = new GeoJsonSource("marker-source",featureCollection);
        mapboxMap.addSource(geoJsonSource);
        Bitmap icon1 = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.drawable.first);
        mapboxMap.addImage("first",icon1);
        SymbolLayer markers = new SymbolLayer("marker-layer", "marker-source").withProperties(PropertyFactory.iconImage("first"));
        markers.setProperties(visibility(VISIBLE));
        markers.setMinZoom(4);
        mapboxMap.addLayer(markers);

        //For Hydrabad area
        List<Feature> markerCordinates1 = new ArrayList<>();
        lng=76.4620;
        lat=16.1542;
        for(int i=0;i<10;i++)
        {
            markerCordinates1.add(Feature.fromGeometry(Point.fromLngLat(lng,lat)));
            lat=lat-0.15;
            lng=lng+0.15;
        }
        lat = 16.1542;
        lng = 76.4620;
        lat+=0.1;
        for(int i=0;i<10;i++){

            markerCordinates1.add(Feature.fromGeometry(Point.fromLngLat(lng,lat)));
            lng=lng+0.25;
            lat=lat+0.25;
        }

        FeatureCollection featureCollection1 = FeatureCollection.fromFeatures(markerCordinates1);
        Source geoJsonSource1 = new GeoJsonSource("marker-source-1",featureCollection1);
        mapboxMap.addSource(geoJsonSource1);
        Bitmap icon2 = BitmapFactory.decodeResource(MainActivity.this.getResources(), R.drawable.second);
        mapboxMap.addImage("second",icon2);
        SymbolLayer markers1 = new SymbolLayer("marker-layer-1", "marker-source-1").withProperties(PropertyFactory.iconImage("second"));
        markers1.setMinZoom(4);
        mapboxMap.addLayer(markers1);
        //for Delhi area
        List<Feature> markerCordinates2 = new ArrayList<>();
        lng=79.4397;
        lat=16.4747;
        //lat increase
        for(int i=0;i<10;i++)
        {
            markerCordinates2.add(Feature.fromGeometry(Point.fromLngLat(lng,lat)));
            lat+=0.25;
        }
        lng=79.4397;
        lat=16.4747;
        lng-=0.25;
        for(int i=0;i<10;i++)
        {
            markerCordinates2.add(Feature.fromGeometry(Point.fromLngLat(lng,lat)));
            lng-=0.25;
        }
        FeatureCollection featureCollection2= FeatureCollection.fromFeatures(markerCordinates2);
        Source geoJsonSource2 = new GeoJsonSource("marker-source-2",featureCollection2);
        mapboxMap.addSource(geoJsonSource2);
        Bitmap icon3 = BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.third);
        mapboxMap.addImage("third",icon3);
        SymbolLayer markers2 = new SymbolLayer("marker-layer-2","marker-source-2").withProperties(PropertyFactory.iconImage("third"));
        markers2.setMinZoom(4);
        mapboxMap.addLayer(markers2);
        //for Hydrabed area
        List<Feature> markerCordinates3 = new ArrayList<>();
        lat=29.3095;
        lng=76.3118;
        //lng increase
        for(int i=0;i<10;i++){
            markerCordinates3.add(Feature.fromGeometry(Point.fromLngLat(lng,lat)));
            lng+=0.25;
        }
        lat=29.3095;
        lng=76.3118;
        lng-=0.25;
        //lng decrease
        for(int i=0;i<10;i++){
            markerCordinates3.add(Feature.fromGeometry(Point.fromLngLat(lng,lat)));
            lng-=0.25;
        }
        FeatureCollection featureCollection3= FeatureCollection.fromFeatures(markerCordinates3);
        Source geoJsonSource3 = new GeoJsonSource("marker-source-3",featureCollection3);
        mapboxMap.addSource(geoJsonSource3);
        Bitmap icon4 = BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.forth);
        mapboxMap.addImage("forth",icon4);
        SymbolLayer markers3 = new SymbolLayer("marker-layer-3","marker-source-3").withProperties(PropertyFactory.iconImage("forth"));
        markers3.setMinZoom(4);
        mapboxMap.addLayer(markers3);
        mapboxMap.addOnMapClickListener(this);

    }


    @Override
    public void onMapClick(@NonNull LatLng point) {
        CameraPosition position = new CameraPosition.Builder()
                .target(new LatLng(point)) // Sets the new camera position
                .zoom(17) // Sets the zoom
                .bearing(180) // Rotate the camera
                .tilt(30) // Set the camera tilt
                .build(); // Creates a CameraPosition from the builder

        mapboxMap.animateCamera(CameraUpdateFactory
                .newCameraPosition(position), 7000);

    }
    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }



}
