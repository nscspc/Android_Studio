package com.example.imagebutton_and_alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class starting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        SystemClock.sleep(3000);

        Intent intent=new Intent(starting.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}