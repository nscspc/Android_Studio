package com.example.btechnotes;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.btechnotes.fragments.sem1;

public class year1 extends AppCompatActivity {

    AppCompatButton sem1;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years1);

        sem1=findViewById(R.id.butsem1);
        linearLayout=findViewById(R.id.SemReplace1year);
        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.btechnotes.fragments.sem1 sem1=new sem1();
                FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.SemReplace1year,sem1);
                ft.commit();

            }
        });

    }

    public void fl(String s) {
        FragmentManager manager1=getSupportFragmentManager();
        FragmentTransaction t1=manager1.beginTransaction();
        chapter1pps m22=new chapter1pps();
        Bundle b2=new Bundle();
        b2.putString("s",s);
        m22.setArguments(b2);
        t1.replace(R.id.SemReplace1year,m22);
        t1.commit();
    }
}