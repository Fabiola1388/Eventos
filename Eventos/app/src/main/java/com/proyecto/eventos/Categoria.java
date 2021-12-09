package com.proyecto.eventos;

public class Categoria {
    Integer id;
    String nombre;
    int imagen;

    public Categoria(Integer id, String nombre, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Categoria() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
