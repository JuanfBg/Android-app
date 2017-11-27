package co.edu.konradlorenz.myapplication.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

import co.edu.konradlorenz.myapplication.R;

/**
 * Created by juanf on 26/11/2017.
 */

public class PlacePickerActivity extends AppCompatActivity{
    int REQUEST_PLACE_PICKER = 1;
    TextView tvPlace;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picket);
    }



    public void goPlacePicker(View view){

        PlacePicker.IntentBuilder intentBuilder = new PlacePicker.IntentBuilder();
        try {
            Intent intent = intentBuilder.build(this);

            startActivityForResult(intent, REQUEST_PLACE_PICKER);


        }catch (GooglePlayServicesRepairableException e){
            e.printStackTrace();
        }catch (GooglePlayServicesNotAvailableException e){
            e.printStackTrace();
        }

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == REQUEST_PLACE_PICKER) {
            if (resultCode == Activity.RESULT_OK) {
                final Place place = PlacePicker.getPlace(data, this);
                Log.i("Seguimiento","Llegó mensaje: " +place.getAddress());
                Toast.makeText(this,"dirección : "+ place.getAddress(), Toast.LENGTH_SHORT);
                tvPlace.setText(place.getAddress());

            }

        }
    }
}
