package com.example.goldm.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuestAccount extends AppCompatActivity {

    Button open_guest_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_account);

        open_guest_camera = (Button)findViewById(R.id.btn_guestcamera);

      open_guest_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePictureFromCamera();
            }
        });

    }
public void opencamera()

    {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }


    public void takePictureFromCamera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAMERA_REQUEST_CODE);
    }
}
