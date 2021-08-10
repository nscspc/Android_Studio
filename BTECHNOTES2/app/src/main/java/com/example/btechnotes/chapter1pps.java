package com.example.btechnotes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class chapter1pps extends Fragment {

    ListView lvc;
    ArrayList<String> ch;
    ArrayAdapter<String> ch2;

    public chapter1pps() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chapter1pps, container, false);
        lvc=(ListView) view.findViewById(R.id.list);
        ch=new ArrayList<String>();
        ch2=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,ch);
        lvc.setAdapter(ch2);
        ch.add("a");
        ch.add("a");
        ch.add("a");
        ch.add("a");
        ch.add("a");
        Bundle b=getArguments();
        return view;
    }
}