package com.example.broadcastreceiverexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    ComponentName componentName;//ComponentName class is an identifier for a specific application component(activiy,class ,service,etc) that is available by using it we can call those components.
    PackageManager packageManager;//Package manager(to get the broadcast service) is the class that retrieves various information about the packages that are currently installed on the device.
    CustomBroadcastReceiver receiver=new CustomBroadcastReceiver();//now here we have called the constructor of CustomBroadcastReceiver.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_noti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shownotification();//now here we have declared a function to show the notifications after clicking on the button.
            }
        });
        //Local Broadcast Use by using local broadcast manager
        /*
        Helper to register for and send broadcasts of Intents to local objects within
        your process. This has a number of advantages over sending global broadcasts with
        Context.sendBroadcast:
        -> You know that the data you are broadcasting won't leave your app,
            so don't need to worry about leaking private data.
        -> It is not possible for other applications to send these broadcasts to
        your app, so you don't need to worry about having security holes they can exploit.
        -> It is more efficient than sending a global broadcast through the system.
         */
        //getInstance() method returns a Signature object that implements the specified signature algorithm
        //registerReceiver() method is used to register the receiver of the CustomBroadcastReceiver class to receive the broadcast.
        LocalBroadcastManager.getInstance(this)
                .registerReceiver(receiver,
                        new IntentFilter(CustomBroadcastReceiver.show_notification));
    }

    private void shownotification() {
        String message=((EditText) findViewById(R.id.edt_message)).getText().toString();// now we are taking th text from edittext that we have to send to the broadcast wali class in string datatype using getText() function.

        Intent i=new Intent(CustomBroadcastReceiver.show_notification);//now we are sending the message using intent.
        i.putExtra("message",message);

        LocalBroadcastManager.getInstance(this).sendBroadcast(i);//to send the broadcast message using local broadcast manager.
    }

    @Override
    protected void onStart() {
        super.onStart();
        componentName=new ComponentName(this,CustomBroadcastReceiver.class);// to attach componentName with custom broadcast receiver class.
        packageManager.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_ENABLED,PackageManager.DONT_KILL_APP);//now we have to attach it to packagemanager,and initially we want the notification enabled so that it can show up , and we want to run app after showing notification also so for that we have used "Dont kill app".
    }

    @Override
    protected void onStop() {
        super.onStop();
        componentName=new ComponentName(this,CustomBroadcastReceiver.class);
        packageManager.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED,PackageManager.DONT_KILL_APP);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(receiver);
    }
}