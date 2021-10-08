package com.example.rednegocioslogistica.ui.almacen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.rednegocioslogistica.Pedidos;
import com.example.rednegocioslogistica.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlmacenFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlmacenFragment extends Fragment implements View.OnClickListener {


    public AlmacenFragment() {
        // Required empty public constructor
    }


    public static AlmacenFragment newInstance(String param1, String param2) {
        AlmacenFragment fragment = new AlmacenFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista= inflater.inflate(R.layout.fragment_almacen, container, false);


        return vista;
    }

    @Override
    public void onClick(View v) {
        //Intent i = new Intent(this,Pedidos.class);
        //startActivity(i);
    }
}