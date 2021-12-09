package com.proyecto.eventos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class EventosFragment extends Fragment {

    ArrayList<Evento> eventos;
    RecyclerView recyclerView;

    public EventosFragment(ArrayList<Evento> eventos) {
        // Required empty public constructor
        this.eventos = eventos;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eventos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclereventos);
        recyclerView.setLayoutManager( new GridLayoutManager( getContext(), 1 ));
        EventosAdapter adapter = new EventosAdapter( eventos, getContext() );
        recyclerView.setAdapter( adapter );
    }
}