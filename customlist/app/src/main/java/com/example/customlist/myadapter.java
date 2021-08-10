package com.example.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class myadapter extends ArrayAdapter<String> {//making the custom ListView adapter by extending it with ArrayAdapter and for String datatype.
    String[] data;//now declaring the variable of String datatype for this java class.
    Context context;// also creating the Context variable for the adapter java class.
    public myadapter(@NonNull Context context, int resource, @NonNull String[] objects) {//now creating the constructor(myadapter) for myadapter(class) in which we have taken the parameters as Context , resource and data(String array).
        super(context, resource, objects);
        this.context=context;
        this.data=data;
    }
    public View getView(int position, View convertView, ViewGroup parent){// now creating a function (getView) of View type in which we have taken the parameters as position , and convertView of View type and parent of ViewGroup.
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.listdesign,parent,false);
        }
        TextView t= convertView.findViewById(R.id.txt);//now giving the id to the text at the particular position for convertView View.
        t.setText(getItem(position));//now setting the text of the item present at the position.
        return convertView;//and now returning the convertView (View).
    }
}
