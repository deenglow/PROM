package com.example.dm2.pruebas;

public class Persona {
    private String nombre;
    private String telefono;
    private int imagen;

    public Persona() {
    }

    public Persona(String nombre, String telefono, int imagen) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
