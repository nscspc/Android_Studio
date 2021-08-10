package com.example.btechnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Branch3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch3);

        Intent intent3=getIntent();

        Button CS;
        CS=findViewById(R.id.CS);
        CS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCS=new Intent(Branch3.this,semester56.class);
                startActivity(intentCS);
            }
        });

    }
}