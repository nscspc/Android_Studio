package com.example.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageadapter extends BaseAdapter {
    private Context mContext;//Creating a Context variable to store Context of the mainactivity(or other activity).

    //constructor
    public imageadapter(Context c){
        mContext=c;
    }
    /*
    public String[] t{
        "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q"
    };
    public int getCount(){
        return t.length;
    }*/
    public Integer[] mThumbsIds={//making array of images of Integer datatype.
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
    };

    public int getCount(){//getting the length of image array using
        return mThumbsIds.length;
    }

    // As BaseAdapter is an abstract class so we have to define all the methods in the subclass, that's why we have defined getItem() and getItemId() methods here, but there is no use of these methods in this case.
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;
        if(convertView==null){
            imageView=new ImageView(mContext);//now giving the id of the imageview for the mainactivity where the image will be viewed.
            imageView.setLayoutParams(new GridView.LayoutParams(150,150));
            // setLayoutParams :-
            /*
            => Set the layout parameters associated with this view. These supply parameters
               to the parent of this view specifying how it should be arranged. There are many
               subclasses of ViewGroup.LayoutParams, and these correspond to the different
               subclasses of ViewGroup that are responsible for arranging their children.
            => Params:
                -> params – The layout parameters for this view, cannot be null
             */
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //setScaleType :-
            /*
            Controls how the image should be resized or moved to match the size of this ImageView
            */

            //ScaleType:-
            /*
            Options for scaling the bounds of an image to the bounds of this view.
            */

            //CENTER_CROP :-
            /*
            Scale the image uniformly (maintain the image's aspect ratio) so that both dimensions
            (width and height) of the image will be equal to or larger than the corresponding
            dimension of the view (minus padding). The image is then centered in the view.
            */

            imageView.setPadding(5,5,5,5);
        }
        else {
            imageView=(ImageView) convertView;
            //convertView :-
            /*
            convertView – The old view to reuse, if possible. Note: You should check that this view
            is non-null and of an appropriate type before using. If it is not possible to convert
            this view to display the correct data, this method can create a new view. Heterogeneous
            lists can specify their number of view types, so that this View is always of the right
            type .
            */
        }
        imageView.setImageResource(mThumbsIds[position]);
        return imageView;

    }
}
