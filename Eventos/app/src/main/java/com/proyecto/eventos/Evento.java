package com.proyecto.eventos;

import java.util.Date;

public class Evento {

    Categoria categoria;
    String nombre;
    String descripcion;
    String ubicacion;
    Date fecha;
    Boolean suscripto = false;

    public Evento() {
    }

    public Evento(Categoria categoria, String nombre, String descripcion, String ubicacion, Date fecha) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getSuscripto() {
        return suscripto;
    }

    public void setSuscripto(Boolean suscripto) {
        this.suscripto = suscripto;
    }
}

