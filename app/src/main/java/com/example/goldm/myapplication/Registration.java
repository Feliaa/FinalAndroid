package com.example.goldm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    EditText fn;
    EditText ln;
    EditText email;
    EditText pw1;
    EditText pw2;

    Button create;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fn = (EditText) findViewById(R.id.edfirst_name);
        ln = (EditText) findViewById(R.id.edlast_name);
        email = (EditText) findViewById(R.id.edEmail);
        pw1 = (EditText) findViewById(R.id.edPW1);
        pw2 = (EditText) findViewById(R.id.edPW2);
        create = (Button) findViewById(R.id.btn_create);


    }
}
