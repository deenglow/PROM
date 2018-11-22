package com.example.dm2.ud02_parte4;

public class Pagina {
    private String nombre;
    private String url;
    private int imagen;


    public Pagina() {
        super();
    }

    public Pagina(String nombre, String url, int imagen) {
        this.nombre = nombre;
        this.url = url;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
