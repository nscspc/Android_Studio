package com.example.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    List<designLayout_java_class> customdesignlist=new ArrayList<designLayout_java_class>();
    private SpinnerCustomAdapter spinnerCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.customspinner);
        //customdesignlist = addData();

        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"apple"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"mango"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"lemon"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"watermelon"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"banana"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"grapes"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"cherry"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"green apple"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"desi mango"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"potato"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"tomato"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"gauvava"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"milk"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"kinderjoy"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"ladyfinger"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"almonds"));
        customdesignlist.add(new designLayout_java_class(R.drawable.ic_launcher_background,"pistachio"));
        customdesignlist.add(new designLayout_java_class(R.mipmap.ic_launcher,"walnuts"));

        spinnerCustomAdapter=new SpinnerCustomAdapter(MainActivity.this,R.layout.spinner_custom_design,customdesignlist);
        spinnerCustomAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerCustomAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"You selected "+customdesignlist.get(position).getName(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}