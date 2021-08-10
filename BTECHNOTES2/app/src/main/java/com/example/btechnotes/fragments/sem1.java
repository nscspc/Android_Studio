package com.example.btechnotes.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.btechnotes.R;
import com.example.btechnotes.year1;

import java.util.ArrayList;

public class sem1 extends Fragment {

    ListView lv;
    ArrayList<String> s1;
    ArrayAdapter<String> s2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sem1, container, false);
        lv=(ListView) view.findViewById(R.id.list);
        s1=new ArrayList<String>();
        s2=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,s1);
        lv.setAdapter(s2);
        s1.add("a");
        s1.add("a");
        s1.add("a");
        s1.add("a");
        s1.add("a");
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s=s1.get(position);
                year1 mnl=(year1) getActivity();
                mnl.fl(s);
            }
        });
        return view;
    }
}