package com.example.goldm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    Button login1;
    Button forgotpw1;
    Button createaccount1;
    Button guestlogin1;

    EditText username1;
    EditText password1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username1 = (EditText) findViewById(R.id.etUsername);
        password1 = (EditText) findViewById(R.id.etpasswordinput);

        login1 = (Button)findViewById(R.id.btn_login);
        forgotpw1 = (Button) findViewById(R.id.btn_forgotPW);
        createaccount1 = (Button) findViewById(R.id.btn_createAcc);
        guestlogin1 = (Button) findViewById(R.id.btn_guest);


        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                accountpage();
            }
        });

        forgotpw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            forgotpwpage();
            }
        });

        createaccount1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            createaccountpage();
            }
        });

        guestlogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            guestaccountpage();
            }
        });

    }
    public void accountpage()
    {
        Intent intent = new Intent(this, Account.class);
        startActivity(intent);
    }

    public void guestaccountpage()
    {
        Intent intent = new Intent(this, GuestAccount.class);
        startActivity(intent);
    }

    public void forgotpwpage()
    {
        Intent intent = new Intent(this, forgotpassword.class);
        startActivity(intent);
    }

    public void createaccountpage()
    {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }


}
