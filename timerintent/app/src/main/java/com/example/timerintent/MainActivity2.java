package com.example.timerintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();

        String a="hello";
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent();
                intent1.setAction(Intent.ACTION_ALL_APPS);
                intent1.setAction(Intent.ACTION_SEND_MULTIPLE);//here action is set for the intent the action is the sharing the string.
                intent1.setType("Text/plain");//here we have specified that the thing that we are sharing is a plain text.
                intent1.putExtra(Intent.EXTRA_TEXT,a);//now here we have specified the variable that contains the text that we want to send. using putExtra function.
                startActivity(intent1);//and now we have started the activity.
            }
        });

    }
}