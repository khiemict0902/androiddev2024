package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ForecastFragment firstFragment = new ForecastFragment();
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//
        getSupportFragmentManager().beginTransaction().add(
                R.id.fragment_forcast, firstFragment).commit();


        Log.i("create","It's created");

    }

    protected void onPause(){
        super.onPause();
        Log.i("pause","It's paused");

    }

    protected void onStart(){
        super.onStart();
        Log.i("start","It's started");
    }

    protected void onStop(){
        super.onStop();
        Log.i("stop","It stopped");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i("destroy","It's destroyed");
    }

    protected void onResume(){
        super.onResume();
        Log.i("resume","It's resuming");
    }




}
