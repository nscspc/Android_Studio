package com.example.customgridview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class adapterg extends BaseAdapter
    //BaseAdapter:-
    /*
    Common base class of common implementation for an Adapter that can be used in both ListView (by implementing
    the specialized ListAdapter interface) and Spinner (by implementing the specialized SpinnerAdapter interface).
    */
{
    private final String name[];
    private final int images[];
    Context context;

    public adapterg(String[] name, int[] images, Context context) {
        this.name = name;
        this.images = images;
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;//according to this length view is going to iterate the model for the data.
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)//it will return View to the GridView .
    // This function will create a view of the data with the grid_model for all the number of items in the given list and then this view will be returned.
    {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //LayoutInflater :-
        /*
        LayoutInflater reads the XML file and creates a view of that XML file and returns it.
        */

        //getSystemService():-
        /*
        Return the handle to a system-level service by name. The class of the returned object varies
        by the requested name
        */

        //LAYOUT_INFLATER_SERVICE :-
        /*
        LAYOUT_INFLATER_SERVICE ("layout_inflater")
        A android.view.LayoutInflater for inflating layout resources in this context. Must only be
        obtained from a visual context such as Activity or a Context created with createWindowContext(int, Bundle),
        which are adjusted to the configuration and visual bounds of an area on screen.
         */

        View view=layoutInflater.inflate(R.layout.grid_model,null);
        //inflate:-
        /*
        Inflate a new view hierarchy from the specified xml resource. Throws InflateException if there is an error.
        */

        ImageView img=(ImageView)view.findViewById(R.id.image);
        TextView tv=(TextView)view.findViewById(R.id.txt);

        img.setImageResource(images[position]);
        /*
        img.setLayoutParams(new GridView.LayoutParams(150,150));
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        img.setPadding(5,5,5,5);
        */
        tv.setText(name[position]);

        return view;
    }
}
