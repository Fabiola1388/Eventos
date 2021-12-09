package com.proyecto.eventos;

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

import java.util.ArrayList;


public class SuscripcionesFragment extends Fragment {
    ArrayList<Evento> misEventos;
    RecyclerView recyclerView;
    public SuscripcionesFragment(ArrayList<Evento> eventos) {
        // Required empty public constructor
        this.misEventos = eventos;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_suscripciones, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclereventos);
        recyclerView.setLayoutManager( new GridLayoutManager( getContext(), 1 ));

        ArrayList<Evento> lista = new ArrayList<>();
        for (Evento e:
                PrincipalActivity.getEventos()) {
            if( e.getSuscripto() ){
                lista.add(e);
            }
        }

        EventosAdapter adapter = new EventosAdapter( lista, getContext() );
        recyclerView.setAdapter( adapter );
    }
}