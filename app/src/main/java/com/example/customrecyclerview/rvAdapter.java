package com.example.customrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.Holder> {
    // RecyclerView.Adapter:-
    /*
    => Base class for an Adapter
    => Adapters provide a binding from an app-specific data set to views that are displayed within a RecyclerView
    */
    List<RecyclerViewModel> recyclerViewModelList;//here we have made a List(recyclerViewModelList) of RecyclerViewModel type.
    //List :-
    /*
    => An ordered collection (also known as a sequence). The user of this interface has precise control over where
       in the list each element is inserted. The user can access elements by their integer index (position in the list),
       and search for elements in the list.
    => <E> –> the type of elements in this list.
    */

    public rvAdapter(List<RecyclerViewModel> recyclerViewModelList) {//now here we have made the constructor
        this.recyclerViewModelList=recyclerViewModelList;
    }

    @NonNull
    
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Now we are going to inflate the xml custom design file(recycle_view_custom_design) using LayoutInflater , so that we can perform some operations on that layout file using java code.
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_custom_design,parent,false);
        //View:-
        /*
        This class represents the basic building block for user interface components. A View occupies a rectangular area
        on the screen and is responsible for drawing and event handling. View is the base class for widgets, which are used to create
        interactive UI components (buttons, text fields, etc.). The ViewGroup subclass is the base class for layouts,
        which are invisible containers that hold other Views (or other ViewGroups) and define their layout properties
        */

        //LayoutInflater:-
        /*
        Instantiates a layout XML file into its corresponding View objects.
        */

        //.from:-
        /*
        Obtains the LayoutInflater from the given context.
        */

        //parent:-
        /*
        parent –> The ViewGroup into which the new View will be added after it is bound to an adapter position.
        */

        //getContext():-
        /*
        Returns the context the view is running in, through which it can access the current theme, resources, etc.
        */

        //inflate():-
        /*
        => Inflate a new view hierarchy from the specified xml resource. Throws InflateException if there is an error.
        => Params:
            -> resource – ID for an XML layout resource to load (e.g., R.layout.main_page).
            -> root – Optional view to be the parent of the generated hierarchy (if attachToRoot is true).
        => Returns:
            -> The root View of the inflated hierarchy. If root was supplied and attachToRoot is true, this is root;
               otherwise it is the root of the inflated XML file.
        */

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        //onBindViewHolder():-
        /*
        This method updates the RecyclerView.ViewHolder contents with the item at the given position and also sets up some private fields to be used by RecyclerView.
        */

        //Binding:-
        /*
        Binding is the process of preparing a child view to display data corresponding to a position within the adapter.
        */

        RecyclerViewModel rvm=recyclerViewModelList.get(position);
        //get(position):-
        /*
        Returns the element at the specified position in this list
        */

        holder.imageView.setImageResource(rvm.getImg());
        holder.textView.setText(rvm.getTxt());
        
    }

    @Override
    public int getItemCount() {//this function returns the totla no. of items in the data set held by the adapter.
        return recyclerViewModelList.size();
        //size():-
        /*
        Returns :- the number of elements in this list.
        */
    }

    public static class Holder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;

        public Holder(View view) {
            super(view);
            imageView = view.findViewById(R.id.img);
            textView = view.findViewById(R.id.txt);
        }
    }
}
