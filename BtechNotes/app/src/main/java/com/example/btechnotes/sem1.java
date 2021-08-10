package com.example.btechnotes;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class sem1 extends Fragment {

    Button pps;
    Button hv;
    Button ep;
    Button bee;
    Button em1;

    public sem1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sem1, container, false);
        pps=(Button) view.findViewById(R.id.pps);
        pps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpps=new Intent(getActivity(),chapters1pps.class);
                startActivity(intentpps);

            }
        });

        hv=(Button) view.findViewById(R.id.hv);
        hv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenthv=new Intent(getActivity(),chapters1hv.class);
                startActivity(intenthv);

            }
        });

        ep=(Button) view.findViewById(R.id.ep);
        ep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentep=new Intent(getActivity(),chapters1ep.class);
                startActivity(intentep);

            }
        });

        bee=(Button) view.findViewById(R.id.bee);
        bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbee=new Intent(getActivity(),chapters1bee.class);
                startActivity(intentbee);

            }
        });

        em1=(Button) view.findViewById(R.id.em1);
        em1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentem1=new Intent(getActivity(),chapters1em1.class);
                startActivity(intentem1);

            }
        });
        return view;
}}