package co.edu.konradlorenz.myapplication.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import co.edu.konradlorenz.myapplication.Fragments.BudgetFragment;
import co.edu.konradlorenz.myapplication.Fragments.LoginFragment;
import co.edu.konradlorenz.myapplication.R;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent1 = new Intent(MapsActivity.this, MapsActivity.class);
                    startActivity(intent1);

                    return true;

                case R.id.navigation_sesion:
               //     mTextMessage.setText(R.string.title_sesion);
                    Intent intent = new Intent(MapsActivity.this, LoginFragment.class);
                    startActivity(intent);

                    return true;

                case R.id.navigation_money:
                   // mTextMessage.setText(R.string.title_money);

                    Intent intent2 = new Intent(MapsActivity.this, BudgetFragment.class);
                    startActivity(intent2);

                    return true;
            }
            return false;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_route);// -> No activity_maps
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //mTextMessage = (TextView) findViewById(R.id.message); ->Error (No message)
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener); ->ExceptionNullPointer
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        //mapFragment.getMapAsync(this); ->ExceptionNullPointer


        /*FloatingActionButton button = (FloatingActionButton) findViewById(R.id.fab_add_restaurant);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //Intent intent = new Intent(MapsActivity.this, ItemListActivity.class);
                //startActivity(intent);
            }
        });
        Line Error (No Button)*/
        
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
        LatLng sydney = new LatLng(4.65,-74.10);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,15));

    }
}