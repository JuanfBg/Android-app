package co.edu.konradlorenz.myapplication.Activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import co.edu.konradlorenz.myapplication.Fragments.AddRestaurantFragment;
import co.edu.konradlorenz.myapplication.Fragments.BudgetFragment;
import co.edu.konradlorenz.myapplication.Fragments.CommentFragment;
import co.edu.konradlorenz.myapplication.Fragments.MapsRouteFragment;
import co.edu.konradlorenz.myapplication.Fragments.PerfilFragment;
import co.edu.konradlorenz.myapplication.Fragments.RestaurantList;
import co.edu.konradlorenz.myapplication.R;

public class Navegation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,CommentFragment.OnFragmentInteractionListener,PerfilFragment.OnFragmentInteractionListener,RestaurantList.OnFragmentInteractionListener,AddRestaurantFragment.OnFragmentInteractionListener , MapsRouteFragment.OnFragmentInteractionListener,BudgetFragment.OnFragmentInteractionListener {






        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         getSupportFragmentManager().beginTransaction()
                .replace(R.id.content2,new MapsRouteFragment(),"Maps")
                .addToBackStack("Maps")
                .commit();




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
                            manager3.beginTransaction().replace(R.id.content2, new MapsRouteFragment(),"Maps").addToBackStack("Maps").commit();;

                            break;

                        case R.id.navigation_sesion:
                            //     mTextMessage.setText(R.string.title_sesion);


                            break;

                        case R.id.navigation_money:
                            // mTextMessage.setText(R.string.title_money);
                            FragmentManager manager2 = getSupportFragmentManager();
                            manager2.beginTransaction().replace(R.id.content2, new BudgetFragment(),"Maps").addToBackStack("Maps").commit();

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

        if (id == R.id.nav_perfil) {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content2, new PerfilFragment(),"Maps").addToBackStack("Maps").commit();

        } else if (id == R.id.nav_res) {

            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content2,new RestaurantList(),"Maps").addToBackStack("Maps").commit();

        } else if (id == R.id.nav_add_res) {

            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content2,new AddRestaurantFragment(),"Maps").addToBackStack("Maps").commit();


        } else if (id == R.id.nav_ajust) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.content2,new CommentFragment(),"Maps").addToBackStack("Maps").commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


}
