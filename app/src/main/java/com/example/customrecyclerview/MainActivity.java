package com.example.customrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;//we have made an instance for the RecyclerView.
    List<RecyclerViewModel> modelList=new ArrayList<>();//we have made an instance for a List of RecyclerViewModel type in the form of ArrayList().**here dynamic dispatch method is used**.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //serLayoutManager:-
        /*
        => Set the RecyclerView.LayoutManager that this RecyclerView will use.
        => Params :- layout –> LayoutManager to use.
        */

        //LinearLayoutManager:-
        /*
        => Creates a vertical LinearLayoutManager.
        => Params:
            -> context :– Current context, will be used to access resources.
        */
        modelList.add(new RecyclerViewModel("hii 1",R.drawable.wood));
        //add():-
        /*
        => Appends the specified element to the end of this list.
        => Params :- e – element to be appended to this list.
        */
        modelList.add(new RecyclerViewModel("hii 2",R.drawable.wood));
        modelList.add(new RecyclerViewModel("hii 3",R.drawable.wood));
        modelList.add(new RecyclerViewModel("hii 4",R.drawable.wood));
        modelList.add(new RecyclerViewModel("hii 5",R.drawable.wood));
        modelList.add(new RecyclerViewModel("hii 6",R.drawable.wood));
        modelList.add(new RecyclerViewModel("hii 7",R.drawable.wood));
        rvAdapter adapter=new rvAdapter(modelList);
        recyclerView.setAdapter(adapter);//for setting the adapter to adapt the data in the list to the recycler view.
    }
}