package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String[] state={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    // Creating instance of Spinner and TextView :-
    Spinner spinner;
    TextView textView;
    //private Object AdapterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, state);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //setDropDownViewResource() :-
        /*
        Sets the layout resource to create the drop down views.
        */
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(this);
        //setOnItemSelectedListener() :-
        /*
        Register a callback to be invoked when an item in this AdapterView has been selected
        */
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        spinner.setSelection(position);
        //setSelection() :-
        /*
        => android.widget.AdapterView Sets the currently selected item using setSelection() mehtod.
           To support accessibility subclasses that override this method must invoke the overridden
           super method first.
        => Params:
            -> position – Index (starting at 0) of the data item to be selected.
        */
        String state2=(String) spinner.getSelectedItem();
        //getSelectedItem() :-
        /*
        Returns :- The data corresponding to the currently selected item, or null if there is nothing selected.
        */
        textView.setText("Selected Android OS : "+state2);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        textView.setText("** not any item selected till now **");
    }
}