package com.proyecto.eventos;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoriasAdapter extends RecyclerView.Adapter<CategoriasAdapter.viewHolder> {
    ArrayList<Categoria> lista;
    Context context;
    FragmentManager fragmentManager;
    ArrayList<Evento> listaEventos;

    public CategoriasAdapter( ArrayList<Categoria> lista, Context context, FragmentManager fragmentManager, ArrayList<Evento> eventos ){
        this.lista = lista;
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.listaEventos = eventos;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.item_categoria, null, false );
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.textView.setText( lista.get(position).getNombre() );
        holder.imageView.setImageResource( lista.get(position).getImagen() );
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ArrayList<Evento> listEventos = new ArrayList<>();
                for (Evento e:
                        listaEventos) {
                    if( e.getCategoria().getId() == lista.get(position).getId() ){
                        listEventos.add( e );
                    }
                }
                EventosFragment eventosFragment = new EventosFragment(listEventos);
                fragmentTransaction.add( R.id.framelayout, eventosFragment );
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        View view;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView.findViewById(R.id.viewcategoria);
            textView = itemView.findViewById( R.id.txtnombrecategoria);
            imageView = itemView.findViewById(R.id.imagencategoria);
        }
    }
}
