package com.proyecto.eventos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CategoriasFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Categoria> categorias = new ArrayList<>();
    ArrayList<Evento> eventos = new ArrayList<>();
    FragmentManager fragmentManager;

    public CategoriasFragment(ArrayList<Categoria> categorias, ArrayList<Evento> eventos, FragmentManager fragmentManager) {
        // Required empty public constructor
        this.categorias = categorias;
        this.eventos = eventos;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categorias, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recylcercategorias);

        recyclerView.setLayoutManager( new GridLayoutManager( getContext(), 2 ));
        CategoriasAdapter adapter = new CategoriasAdapter( categorias, getContext(), fragmentManager, eventos );
        recyclerView.setAdapter( adapter );
    }
}