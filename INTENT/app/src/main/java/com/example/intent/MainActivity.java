package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    //@SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new
                Intent intent=new Intent(MainActivity.this,second_screen.class);//to create a intent.
                startActivity(intent);//to start some activity .
            }
        });
        //Intent intent=new Intent(MainActivity.this,second_screen.class);//to create a intent.
        //startActivity(intent);//to start some activity .
    }
}