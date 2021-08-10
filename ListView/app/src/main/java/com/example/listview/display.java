package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class display extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent=getIntent();//now here we are getting the intent from the MainActivity.
        String langinfo=intent.getStringExtra("package com.example.listview;");// here we are getting the string sent from the MainActivity to this intent using the getStringExtra function.

        textView=findViewById(R.id.textView);//now setting the TextView widget to show the content according to the click .
        textView.setText(langinfo);// here we are setting the TextView to finally display the text.
    }
}