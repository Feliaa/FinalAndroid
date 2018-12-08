package com.example.goldm.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //making the splash screen
        Thread xyz = new Thread() {
            public void run() {
                try {
                    sleep(3000);  // last 3 seconds
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // moves to home screen after three seconds
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                }
            }

        };
        //starts the thread
        xyz.start();
    }

    @Override
    protected void onPause() {

        super.onPause();
        finish();

    }
}