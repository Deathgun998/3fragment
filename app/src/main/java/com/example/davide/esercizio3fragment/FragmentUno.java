package com.example.davide.esercizio3fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class FragmentUno extends Fragment {
    Button b;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.layout_fragment_uno,container,false);
        b=(Button)root.findViewById(R.id.avanti1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentDue fragment = new FragmentDue();
                FragmentManager fragmentManager = getActivity().getFragmentManager();
                fragmentManager.beginTransaction().add(R.id.fragmentContainer,fragment).addToBackStack(null).commit();
            }
        });

        return root;
         }


}
