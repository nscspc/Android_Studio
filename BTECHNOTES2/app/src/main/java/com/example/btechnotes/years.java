package com.example.btechnotes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class years extends AppCompatActivity {

    ListView listView;
    String [] sub={"1st year","2nd year","3rd year","4th year"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_years);

        listView=findViewById(R.id.list);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,sub);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(years.this,year1.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent=new Intent(years.this,year2.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent=new Intent(years.this,year3.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent=new Intent(years.this,year4.class);
                    startActivity(intent);
                }


            }
        });

    }
}