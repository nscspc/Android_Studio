package com.example.toolbar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolBar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void initToolBar(){
        toolBar=findViewById(R.id.toolBar);
        toolBar.setTitle(R.string.toolbarTitle);
        //setSupportActionBar(toolBar);
        toolBar.setNavigationIcon(R.drawable.ic_action_name);
        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"clicking the Toolbar",Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
/*
    @Override
    public void setSupportActionBar(@Nullable androidx.appcompat.widget.Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }
*/
}