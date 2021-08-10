package com.example.btechnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class chapters1bee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters1bee);

        Intent intentbee=getIntent();

        ListView lvc;
        lvc=findViewById(R.id.chapterslist1);
        String[] chapters1bee= {"DC Circuits","AC Circuits","Transformers","Power Converters","Electrical Installation"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,chapters1bee);
        lvc.setAdapter(arrayAdapter);//now setting the adapter to work on the listview and the array.


        // Now setting setOnItemClickListener to get a response(through toast) by clicking the particular item of the listview.
        lvc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {//position gives the position of the item from the array that is clicked by the user.
                Toast.makeText(chapters1bee.this, "you clicked on " + chapters1bee[position], Toast.LENGTH_SHORT).show();

                Intent intent4=new Intent(chapters1bee.this,notes.class);
                startActivity(intent4);
            }
        });

    }
}