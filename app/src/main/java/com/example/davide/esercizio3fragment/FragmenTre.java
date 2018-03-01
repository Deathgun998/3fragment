package com.example.davide.esercizio3fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by davide on 01/03/2018.
 */

public class FragmenTre extends Fragment {

    Button b,b1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.layout_fragment_tre,container,false);
        b=(Button)root.findViewById(R.id.indietro3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentDue fragment = new FragmentDue();
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                fragmentManager.popBackStack();
            }
        });
        b1=(Button)root.findViewById(R.id.pag1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentDue fragment = new FragmentDue();
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                fragmentManager.popBackStack("1",0);
            }
        });

        return root;
    }

}
