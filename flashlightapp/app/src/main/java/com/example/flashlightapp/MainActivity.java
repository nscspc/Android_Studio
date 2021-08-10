package com.example.flashlightapp;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    String flashon="Flash Off";
    String flashoff="Flash On";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.img);

    }

    public void toggle(View view) {//whenever the button is clicked then toggle method will be called.
        //View:-
        /*
        This class represents the basic building block for user interface components. A View occupies a rectangular
        area on the screen and is responsible for drawing and event handling. View is the base class for widgets,
        which are used to create interactive UI components (buttons, text fields, etc.). The ViewGroup subclass is
        the base class for layouts , which are invisible containers that hold other Views (or other ViewGroups)
        and define their layout properties.
        */

        Button button = (Button) view;//taking view of the button.
        if (button.getText().equals("Flash On")) {//using getText() method we are getting the text written on the button.
            button.setText(flashon);//or (R.string.flashon) if string is initialized in string.xml file.
            imageView.setImageResource(R.drawable.flashon);
            torchToggle("on");
        } else {
            button.setText(flashoff);
            imageView.setImageResource(R.drawable.flashoff);
            torchToggle("off");
        }
    }

    private void torchToggle(String command) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            //Build.VERSION:-
            /*
            Using it we are giving the api version of the application
             */
            //SDK_INT :-
            /*
            The SDK version of the software currently running on this hardware device. This value never
            changes while a device is booted, but it may increase when the hardware manufacturer provides an OTA update.
            => we have taken the the control of hardware by taking control of SDK(Development Kit).
            */
            //Build.VERSION_CODES.M :-
            /*

             */
            //M is for Marshmallow!
            /*
            Applications targeting this or a later release will get these new changes in behavior.
             */
            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
            //CameraManager :-
            /*
            A system service manager for detecting, characterizing, and connecting to CameraDevices.
            as the control of the flashlight is in camera.
            */

            //(CameraManager) :-
            /*
            to initialize that it is a CameraManager.
            */

            //getSystemService :-
            /*
            => Params:- name – The name of the desired service.
            => Returns:- The service or null if the name does not exist.
            */

            //Context :-
            /*
            Interface to global information about an application environment. This is an abstract class whose
            implementation is provided by the Android system. It allows access to application-specific resources
            and classes, as well as up-calls for application-level operations such as launching activities,
            broadcasting and receiving intents, etc.
            */

            //CAMERA_SERVICE:-
            /*
            Use with getSystemService(String) to retrieve a android.hardware.camera2.CameraManager for interacting with camera devices.
            */
            String cameraId = null; // Usually back camera is at 0 position.
            //here we have given the id of the camera to a string variable.
            try {
                if (camManager != null) {//means if the value of camManager is not null means access is provided to manage camera service.
                    cameraId = camManager.getCameraIdList()[0];//now initializing the cameraId using the getCameraIdList() methodo with camManager(CameraManager).
                }
                if (camManager != null) {
                    if (command.equals("on")) {
                        camManager.setTorchMode(cameraId, true);   // Turn ON
                        Toast.makeText(this,"Torch On",Toast.LENGTH_SHORT).show();
                    } else {
                        camManager.setTorchMode(cameraId, false);  // Turn OFF
                        //setTorchMode :-
                        /*
                        => Set the flash unit's torch mode of the camera of the given ID without opening the camera device.
                        => Use getCameraIdList to get the list of available camera devices and use getCameraCharacteristics
                           to check whether the camera device has a flash unit. Note that even if a camera device has a flash
                           unit, turning on the torch mode may fail if the camera device or other camera resources needed
                           to turn on the torch mode are in use.
                          => Params:
                             -> cameraId – The unique identifier of the camera device that the flash unit belongs to.
                             -> enabled – The desired state of the torch mode for the target camera device. Set to
                                         true to turn on the torch mode. Set to false to turn off the torch mode.
                        */
                        Toast.makeText(this,"Torch Off",Toast.LENGTH_SHORT).show();
                    }
                }
            }catch(CameraAccessException e){//CameraAccessException is thrown if a camera device could not be queried or opened by the CameraManager, or if the connection to an opened CameraDevice is no longer valid.
                e.getMessage();//Returns the detail message string of this throwable.
                Toast.makeText(this,"CameraAccessException",Toast.LENGTH_LONG).show();
            }

        }
    }
}