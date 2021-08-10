package com.example.imagebutton_and_alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();

        imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this)//creating an alert dialog box using AlertDialog class in this activity(MainActivity).
                        .setTitle("my alert")
                        .setMessage("this is mu alert")
                        //now setting the button in the dialog box that is a positive button , when it is clicked then the program written in it is executed.
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //dialog.dismiss();// to dismiss the dialog box
                            }
                        })
                        .create();// to create the dialog box.
                alertDialog.show();// to show the dialog box after creating it.
            }
        });
    }
}