package com.example.torch;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //ImageView i1;
    //ImageView i2;
    ImageView img;
    Button b;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //i1=findViewById(R.id.i10);
        //i2=findViewById(R.id.i2);
        b=findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b.getText().toString().equals("TURN ON"))
                {
                    img.setImageResource(R.drawable.i10);
                    b.setText("TURN OFF");

                    if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                        CameraManager camManager=(CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId=null;
                        try {
                            cameraId=camManager.getCameraIdList()[0];
                            camManager.setTorchMode(cameraId,true);
                        }
                        catch (CameraAccessException e){
                           e.printStackTrace();
                        }
                    }
                }
                else{
                    img.setImageResource(R.drawable.i2);
                    b.setText("TURN ON");

                    if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                        CameraManager camManager=(CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId=null;
                        try {
                            cameraId=camManager.getCameraIdList()[0];
                            camManager.setTorchMode(cameraId,false);
                        }
                        catch(CameraAccessException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

    }
}