package co.edu.konradlorenz.myapplication.Activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import co.edu.konradlorenz.myapplication.Fragments.AddRestaurantFragment;
import co.edu.konradlorenz.myapplication.Fragments.BudgetFragment;
import co.edu.konradlorenz.myapplication.Fragments.LoginFragment;
import co.edu.konradlorenz.myapplication.Fragments.MapsRouteFragment;
import co.edu.konradlorenz.myapplication.Fragments.restaurantList;
import co.edu.konradlorenz.myapplication.R;



import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Navegation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,restaurantList.OnFragmentInteractionListener,AddRestaurantFragment.OnFragmentInteractionListener , MapsRouteFragment.OnFragmentInteractionListener, LoginFragment.OnFragmentInteractionListener ,BudgetFragment.OnFragmentInteractionListener {
    private GoogleMap mMap;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:


                    return true;

                case R.id.navigation_sesion:
                    //     mTextMessage.setText(R.string.title_sesion);

                    FragmentManager manager = getSupportFragmentManager();
                    manager.beginTransaction().replace(R.id.content2, new LoginFragment()).commit();


                    return true;

                case R.id.navigation_money:
                    // mTextMessage.setText(R.string.title_money);
                    FragmentManager manager2 = getSupportFragmentManager();
                    manager2.beginTransaction().replace(R.id.content2, new BudgetFragment()).commit();

                    return true;
            }
            return false;
        }
    };


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.content2,new MapsRouteFragment()).commit();




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

            BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.navigation_home:

                            FragmentManager manager3 = getSupportFragmentManager();
                            manager3.beginTransaction().replace(R.id.content2, new MapsRouteFragment()).commit();

                            break;

                        case R.id.navigation_sesion:
                            //     mTextMessage.setText(R.string.title_sesion);

                            FragmentManager manager = getSupportFragmentManager();
                            manager.beginTransaction().replace(R.id.content2, new LoginFragment()).commit();


                            break;

                        case R.id.navigation_money:
                            // mTextMessage.setText(R.string.title_money);
                            FragmentManager manager2 = getSupportFragmentManager();
                            manager2.beginTransaction().replace(R.id.content2, new BudgetFragment()).commit();

                            break;
                    }
                    return true;
                }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navegation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content2,new AddRestaurantFragment()).commit();

        } else if (id == R.id.nav_slideshow) {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content2,new restaurantList()).commit();

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
