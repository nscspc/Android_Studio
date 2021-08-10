package com.example.btechnotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class chapters1em1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters1em1);

        Intent intentem1=getIntent();

        ListView lvc;
        lvc=findViewById(R.id.chapterslist1);
        String[] chapters1em1={"Calculus","Sequence & Series","Fourier Series","Multivariable Calculus (Differentiation)","Multivariable Calculus (Integration)"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,chapters1em1);
        lvc.setAdapter(arrayAdapter);//now setting the adapter to work on the listview and the array.


        // Now setting setOnItemClickListener to get a response(through toast) by clicking the particular item of the listview.
        lvc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {//position gives the position of the item from the array that is clicked by the user.
                Toast.makeText(chapters1em1.this, "you clicked on " + chapters1em1[position], Toast.LENGTH_SHORT).show();

                Intent intent4=new Intent(chapters1em1.this,notes.class);
                startActivity(intent4);
            }
        });

    }
}