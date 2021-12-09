package com.proyecto.eventos;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.Arrays;

public class BuscadorFragment extends Fragment {

    ArrayList<Evento> eventos;
    RecyclerView recyclerView;

    public BuscadorFragment(ArrayList<Evento> eventos) {
        // Required empty public constructor
        this.eventos = eventos;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buscador, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclereventos);

        String[] nombres = new String[eventos.size()];
        for ( int i = 0; i < nombres.length; i++){
            nombres[i] = eventos.get(i).getNombre();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                nombres);
        AutoCompleteTextView actv =  (AutoCompleteTextView)view.findViewById(R.id.inputbuscar);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.RED);

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ArrayList<Evento> lista = new ArrayList<>();
                for (Evento e :
                        eventos) {
                    if ( e.getNombre().equals(actv.getText().toString()) ){
                        lista.add(e);
                    }
                }
                recyclerView.setLayoutManager( new GridLayoutManager( getContext(), 1 ));
                EventosAdapter adapter = new EventosAdapter( lista, getContext() );
                recyclerView.setAdapter( adapter );
            }
        });
    }

}