package com.example.toptabbed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    //TabLayout:-
    /*
    => TabLayout provides a horizontal layout to display tabs.
    => Population of the tabs to display is done through TabLayout.Tab instances. You create tabs via newTab().
       From there you can change the tab's label or icon via TabLayout.Tab.setText(int) and TabLayout.Tab.setIcon(int) respectively.
       To display the tab, you need to add it to the layout via one of the addTab(TabLayout.Tab) methods.
       -> For example:
            TabLayout tabLayout = ...;
            tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
            tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
            tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
    */
    ViewPager2 pager2;
    //ViewPager2:-
    /*
    => ViewPager objects have built-in swipe gestures to transition through pages, and they display screen slide
       animations by default, so you don't need to create your own animation. ViewPager uses PagerAdapter objects
       as a supply for new pages to display, so the PagerAdapter will use the fragment class that you created
    => ViewPager2 is an improved version of the ViewPager library that offers enhanced functionality
       and addresses common difficulties when using ViewPager .
       -> ViewPager2 has several advantages such as vertical orientation support, RTL and access to DiffUtil .
    */
    FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null)//savedInstanceState – If the activity is being re-initialized after previously being shut down then this Bundle contains the data it most recently supplied in onSaveInstanceState.
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new firstfragment()).commit();
        }

        tabLayout=findViewById(R.id.tab_layout);
        pager2=findViewById(R.id.view_pager2);

        FragmentManager fm=getSupportFragmentManager();//getSupportFragmentManager :- Return the FragmentManager for interacting with fragments associated with this activity.
        //Now calling the constructor of FragmentAdapter class using its object(adapter).
        adapter=new FragmentAdapter(fm,getLifecycle());//getLifecycle :- Returns the Lifecycle of the provider.
        pager2.setAdapter(adapter);//now attacher the viewpager(pager2) to the fragment adapter.

        tabLayout.addTab(tabLayout.newTab().setText("First"));
        //addTab:-
        /*
        Add a tab to this layout. The tab will be added at the end of the list. If this is the first tab to be added it will become the selected tab.
        */

        //newTab():-
        /*
        => Create and return a new TabLayout.Tab. You need to manually add this using addTab(TabLayout.Tab) or a related method.
        => Returns :- A new Tab
        */

        //setText():-
        /*
        Set the text displayed on this tab. Text may be truncated(shorten by or as if by cutting off) if there is not room to display the entire string.
        */
        tabLayout.addTab(tabLayout.newTab().setText("Second"));
        tabLayout.addTab(tabLayout.newTab().setText("Third"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
                //setCurrentItem:-
                /*
                Set the currently selected page. If the ViewPager has already been through its first layout with its
                current adapter there will be a smooth animated transition between the current item and the specified item.
                Silently ignored if the adapter is not set or empty. Clamps item to the bounds of the adapter.
                */

                //tab.getPosition():-
                /*
                => Return the current position of this tab in the action bar.
                => Returns :- Current position, or INVALID_POSITION if this tab is not currently in the action bar.
                */
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            //registerOnPageChangeCallback:-
            /*
            Add a callback that will be invoked whenever the page changes or is incrementally scrolled.
            See ViewPager2.OnPageChangeCallback. Components that add a callback should take care to remove it when finished.
            */
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
                //selectTab:-
                /*
                Selects the given tab.
                */

                //getTabAt(int index):-
                /*
                Returns the tab at the specified index.
                */
            }
        });
    }
}