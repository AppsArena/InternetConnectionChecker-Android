package com.droidapps.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.droidapps.internetconnectionchecker.InternetConnection;
import com.droidapps.internetconnectionchecker.interfaces.InternetConnectionListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //check internet connection and perform action
        new InternetConnection(this, new InternetConnectionListener() {
            @Override
            public void onInternetConnectionEnable() {
                //TODO PERFORM TASKS ON INTERNET CONNECTION ENABLE
                Toast.makeText(MainActivity.this, "INTERNET CONNECTION ENABLE", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onInternetConnectionDisable() {
                //TODO PERFORM TASKS ON INTERNET CONNECTION DISABLE
                Toast.makeText(MainActivity.this, "INTERNET CONNECTION DISABLE", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
