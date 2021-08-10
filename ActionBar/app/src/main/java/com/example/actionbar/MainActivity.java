package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //To specify the options menu for an activity , we have to override onCreateOptionsMenu() , in this method we can inflate the menu resource(defined in XML) into the Menu provided in the callback.
    /*
    => if we have developed the application for Android 2.3.x and lower , the system calls
       onCreateOptionsMenu() to create the options menu when the user opens the menu for the
       first time.
    => if we have developed the application for Android 3.0 and higher , then the system calls
       onCreateOptionsMenu() when starting the activity , in order to show items to the app bar.
    */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*
        To use the menu in this activity , we need to inflate(convert the XML resource into a programmable
        object) the menu resource using MenuInflater.inflate().
         */
        getMenuInflater().inflate(R.menu.menu_main,menu);
        //getMenuInflater():-
        /*
        Returns a MenuInflater with this context.
        */

        //MenuInflater :-
        /*
        This class is used to instantiate menu XML files into Menu objects.
        */

        //inflate():;-
        /*
        => Inflate a menu hierarchy from the specified XML resource. Throws InflateException if
           there is an error.
        => Params:
            -> menuRes – Resource ID for an XML layout resource to load (e.g., R.menu.main_activity).
            -> menu – The Menu to inflate into. The items and submenus will be added to this Menu.
        */
        return true;
    }

    // For Handling the Click events :-
    /*
    => When the user selects an item from the options menu (including action items in the app bar) ,
       the system calls the activity's onOptionsItemSelected() method.
    => This method passes the MenuItem selected . We can identify the item by calling getItemId(),
       which returns the unique ID for the menu item , we can match this id against known menu items
       to perform the appropriate action.
    */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.add:
                count=findViewById(R.id.text);
                count.setText("Add is selected");
                return true;

            case R.id.reset:
                count=findViewById(R.id.text);
                count.setText("Nothing is selected");
                return true;

            case R.id.about:
                Toast.makeText(this,"about",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.exit:
                finish();
                return true;
        }
        return (super.onOptionsItemSelected(item));
    }
    /*
    when we successfully handle a menu item then we return true , but if we don't handle the menu
    item then we should call the superclass implementation of onOptionsItemSelected() (the default
    implementation returns false). It is like default condition in switch case.
    */
     
}