package com.proyecto.eventos;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EventosAdapter extends RecyclerView.Adapter<EventosAdapter.viewHolder> {

    ArrayList<Evento> lista;
    Context context;

    public EventosAdapter(ArrayList<Evento> lista, Context context){
        this.lista = lista;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_evento, null, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = dateFormat.format( lista.get(position).getFecha() );
        holder.fecha.setText(strDate);
        holder.categoria.setText( lista.get(position).getCategoria().getNombre() );
        holder.nombre.setText(lista.get(position).getNombre());
        holder.descripcion.setText(lista.get(position).getDescripcion());
        holder.ubicacion.setText(lista.get(position).getUbicacion());
        holder.entrar.setChecked( lista.get(position).getSuscripto() );
        holder.entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lista.get(position).setSuscripto( holder.entrar.isChecked() );
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView fecha, categoria, nombre, descripcion, ubicacion;
        ToggleButton entrar;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            fecha = itemView.findViewById(R.id.txtfechaevento);
            categoria = itemView.findViewById(R.id.txtcategoriaevento);
            nombre = itemView.findViewById(R.id.txtnombreevento);
            descripcion = itemView.findViewById(R.id.txtdescripcionevento);
            ubicacion = itemView.findViewById(R.id.txtubicacionevento);
            entrar = itemView.findViewById(R.id.botonentrarevento);
        }
    }
}
