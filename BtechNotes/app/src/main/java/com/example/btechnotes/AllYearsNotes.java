package com.example.btechnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllYearsNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_years_notes);

        Intent intent=getIntent();

        Button one;
        Button two;
        Button three;
        Button four;

        one=findViewById(R.id.button5);
        two=findViewById(R.id.button6);
        three=findViewById(R.id.button7);
        four=findViewById(R.id.button8);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(AllYearsNotes.this,semester12.class);
                startActivity(intent1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(AllYearsNotes.this, Branch2.class);
                startActivity(intent2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(AllYearsNotes.this,Branch3.class);
                startActivity(intent3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(AllYearsNotes.this,Branch4.class);
                startActivity(intent4);
            }
        });

    }
}