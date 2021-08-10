package com.example.addition;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText a1;
        EditText a2;
        Button add;
        TextView t;

        a1=findViewById(R.id.a1);
        a2=findViewById(R.id.a2);
        t=findViewById(R.id.t);
        add=findViewById(R.id.add);

        add.setOnClickListener(v -> {
            double a=Double.parseDouble(a1.getText().toString());
            double b=Double.parseDouble(a2.getText().toString());

            double c=a+b;
            t.setText(Double.toString(c));
        });
    }
}