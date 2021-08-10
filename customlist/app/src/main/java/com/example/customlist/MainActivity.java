package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String [] data={"A","b","C","d"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);
        myadapter arrayAdapter=new myadapter(this, R.layout.listdesign,data);//now using our custom adapter(myadapter) and custom design(listdesign).
        listView.setAdapter(arrayAdapter);

    }
}