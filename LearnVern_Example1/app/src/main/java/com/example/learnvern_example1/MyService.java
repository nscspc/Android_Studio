package com.example.learnvern_example1;
//whenever we are going to click on start this activity is going to start.
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {//Service must return , so for that onBind() method( it binds the activity ) is used.

    MediaPlayer mediaPlayer;

    @Nullable
    @Override
    //IBinder is used to create an interface between the service and client.
    public IBinder onBind(Intent intent) {//onBind function is used to bind to the service , send request , receive responses and perform interprocess communication(IPC).
        return null;
    }

    @Override
    public void onCreate() {//onCreate() is a callback method which is called when activity is first created to create or recreate activity and load all data from savedInstanceState whenever orientation is changed.,Bundle class is used to store the data of activity whenever orientation condition occur in app.
        Toast.makeText(this,"Service Created",Toast.LENGTH_SHORT).show();//as whenever onCreate method is run then service gets create
        mediaPlayer=MediaPlayer.create(this,R.raw.despacito);
        //setting looping to play only one time , means it will not play media again and again from starting on clicking .
        mediaPlayer.setLooping(false);
    }

    @Override
    public void onStart(Intent intent,int startId) {//onStart method is a callback method which is called when activity becomes visible to user.
        Toast.makeText(this,"Service started",Toast.LENGTH_SHORT).show();
        mediaPlayer.start();//mediaplayer will get start when service(activity) is going to start.
    }

    @Override
    public void onDestroy() {//onDestroy method is called before the activity is destroyed by the system.
        Toast.makeText(this,"Service Destroyed",Toast.LENGTH_SHORT).show();
        mediaPlayer.stop();//to stop mediaplayer when appliction will get destroyed by system.
    }
}
