package com.example.timerintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;//we have used the time class to produce delay by creating its object "timer" and using it with schedule method.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },5000);//using the Timer function we have made a object of it which is timer and using the object with schedulemethod we have created a delay in the task that is to be executed after the delay by mentioning it in the schedule method.

    }
}