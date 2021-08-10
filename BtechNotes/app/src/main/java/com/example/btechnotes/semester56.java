package com.example.btechnotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class semester56 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragmentAdapter56 fragmentAdapter56;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester56);

        Intent intentCS=getIntent();

        tabLayout=findViewById(R.id.tab_s56);
        viewPager2=findViewById(R.id.viewpager2_s56);

        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentAdapter56=new FragmentAdapter56(fragmentManager,getLifecycle());
        viewPager2.setAdapter(fragmentAdapter56);

        tabLayout.addTab(tabLayout.newTab().setText("5th Semester"));
        tabLayout.addTab(tabLayout.newTab().setText("6th Semester"));

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