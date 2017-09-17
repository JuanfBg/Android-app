package co.edu.konradlorenz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.florescu.android.rangeseekbar.RangeSeekBar;
import android.support.design.widget.FloatingActionButton;

public class BudgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);
        RangeSeekBar<Integer> rangeSeekBar = new RangeSeekBar<>(this);
        // Set the range
        rangeSeekBar.setRangeValues(2000, 10000);
        rangeSeekBar.setSelectedMinValue(2000);
        rangeSeekBar.setSelectedMaxValue(10000);

    }
}
