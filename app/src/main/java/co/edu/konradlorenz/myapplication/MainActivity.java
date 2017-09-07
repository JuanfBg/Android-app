package co.edu.konradlorenz.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                Intent intent1 = new Intent(MainActivity.this, MainActivity.class);
                  startActivity(intent1);

                    return true;
                case R.id.navigation_sesion:
                    mTextMessage.setText(R.string.title_sesion);
                            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                            startActivity(intent);



             /*   case R.id.navigation_money:
                    mTextMessage.setText(R.string.title_money);

            Intent intent2 = new Intent(MainActivity.this, Presupuesto.class);
                                                    startActivity(intent2);

                    return true;*/
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
