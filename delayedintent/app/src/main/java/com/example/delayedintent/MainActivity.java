package com.example.delayedintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    //ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.tv);
        //img=findViewById(R.id.img);

        Intent intent=new Intent(MainActivity.this,second.class);
        SystemClock.sleep(2000);
        startActivity(intent);
        finish();
    }
}