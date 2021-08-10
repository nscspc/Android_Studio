package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText un;
        EditText ps;
        EditText text;
        CheckBox checkBox;
        Button log;

        un=findViewById(R.id.un);
        ps=findViewById(R.id.pswd);
        text=findViewById(R.id.text);
        checkBox=findViewById(R.id.checkBox);
        log=findViewById(R.id.button);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked())
                {
                    Toast.makeText(MainActivity.this,"your info is successfully submitted",Toast.LENGTH_SHORT).show();
                    //Toast.makeText(Context:MainActivity.this,text:"your info is successfully submitted", Toast.LENGTH_SHORT).show());
                }
                else
                    {
                    Toast.makeText(MainActivity.this,"please accept terms and conditions", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}