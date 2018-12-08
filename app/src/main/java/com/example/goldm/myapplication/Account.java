package com.example.goldm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Account extends AppCompatActivity {

        Button camera;
        Button favorites;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        camera = (Button)findViewById(R.id.btn_open_camera);
        favorites = (Button) findViewById(R.id.btn_account_fav);


    }
}
