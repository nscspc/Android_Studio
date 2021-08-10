package com.example.btechnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class semester12 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragmentAdapter12 fragmentAdapter12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester12);
        /*Button button;
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(semester12.this,"hello world",Toast.LENGTH_SHORT).show();
            }
        });*/
        Intent intent1=getIntent(); 

        tabLayout=findViewById(R.id.tab_s12);
        viewPager2=findViewById(R.id.viewpager2_s12);

        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentAdapter12=new FragmentAdapter12(fragmentManager,getLifecycle());
        viewPager2.setAdapter(fragmentAdapter12);

        tabLayout.addTab(tabLayout.newTab().setText("1st Semester"));
        tabLayout.addTab(tabLayout.newTab().setText("2nd Semester"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

    }
}