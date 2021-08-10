package com.example.broadcastreceiverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadcastReceiver extends BroadcastReceiver {

    public static final String show_notification="broadcastreceiverexample.show_notification";//we have declared a string(show_notification) which cannot be used outside this activity or class.
    public static final String hide_notification="broadcastreceiverexample.hide_notification";

    //now creating a empty constructor to create a new instance via reflection by our persistence framework.
    public CustomBroadcastReceiver(){//now we have call the non-parameterized and empty constructor.

    }

    //method to receive
    /*
    to be able to receive a broadcast , application have to extends the BroadcastReceiver abstract class
    and Override its onReceive() method . if the event for which the broadcast receiver
    has registered happens,then onReceive() method of the receiver is called by the Android System.
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();//to perform action with intent using getAction() method(getAction() method returns a pointer id and an event informmation).

        switch (action){
            case Intent.ACTION_BATTERY_LOW://when battery will get low this toast will get showed.
                show("Battery Low",context);
                break;

            case Intent.ACTION_POWER_DISCONNECTED:
                show("Action Power Disconnected",context);
                break;
            case Intent.ACTION_POWER_CONNECTED:
                show("Action Power Connected",context);
                break;

            case show_notification:
                String message=intent.getStringExtra("message");//this intent will receive a string from MainActivity with message name.
                show("Broadcast : "+message,context);
                break;
            //now we have to hide the notification as well
            case hide_notification:
                show("Hide Notification",context);
                break;

            default:
                show("Not Detected",context);//if it doesn't get anything then default case will be executed which will show => "Not Detected".
                break;
        }
    }

    private void show(String message,Context context) {//context is the details about what we are talking about  and  where we are currently present.
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
