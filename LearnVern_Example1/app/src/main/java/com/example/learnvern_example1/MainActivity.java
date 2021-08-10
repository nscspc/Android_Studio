package com.example.learnvern_example1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button start,stop,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//onCreate() is a callback method which is called when activity is first created to create or recreate activity and load all data from savedInstanceState whenever orientation is changed.,Bundle class is used to store the data of activity whenever orientation condition occur in app.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        next=findViewById(R.id.next);

        start.setOnClickListener(this);//this keyword for thid activity(MainActivity).
        stop.setOnClickListener(this);
        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){//using getId() method we are getting the id of the button on which user has clicked.
            case R.id.start:
                startService(new Intent(this,MyService.class));//startService() method calls the onStart() or onStartCommand() method from the given Service.(if Service is not running already , then the system first calls onCreate() method and then it calls onStart() or onStartCommand() mehtod.
                break;
            case R.id.stop:
                stopService(new Intent(this,MyService.class));//stopService() method calls the onDestroy() method from the given service , and stopService() method stops the service no matter how frequently we call the startService(intent) method.
                break;
            case R.id.next:
                Intent intent=new Intent(this,NextActivity.class);
                startActivity(intent);
                break;
        }
    }

    // onStop() , onPause() , onRestart() , onResume() methods can only be used in an activiy not Service.
    // and all the callback methods cannot be used inside each other.

    @Override
    protected void onStop() {//onStop() method is called when activity is no longer visible.
        super.onStop();
        Toast.makeText(this,"Service Stopped",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {//onPause() method called when activity gets paused.
        super.onPause();
        Toast.makeText(this,"Service Paused",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {//onRestart() method is called when the activity restarts after stopping it.
        super.onRestart();
        Toast.makeText(this,"Service Restarted",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {//onResume() method is called when user starts interacting with application.
        super.onResume();
        Toast.makeText(this,"Service Resumed",Toast.LENGTH_SHORT).show();
    }
}