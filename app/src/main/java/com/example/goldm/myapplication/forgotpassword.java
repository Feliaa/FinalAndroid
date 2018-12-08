package com.example.goldm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class forgotpassword extends AppCompatActivity {

    Button submit;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);

        submit = (Button) findViewById(R.id.btn_submit);

        email = (EditText) findViewById(R.id.et_email);
    }
}
