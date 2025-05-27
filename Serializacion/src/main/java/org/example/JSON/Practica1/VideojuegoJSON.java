package org.example.JSON.Practica1;

import java.util.ArrayList;

public class VideojuegoJSON {

    private String nombre;
    private String plataforma;
    private double precio;
    private boolean disponible;
    private ArrayList<String> generos;

    public VideojuegoJSON(String nombre, String plataforma, double precio, boolean disponible, ArrayList<String> generos) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.precio = precio;
        this.disponible = disponible;
        this.generos = generos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    @Override
    public String toString() {
        return "VideojuegoJSON{" +
                "nombre='" + nombre + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", precio=" + precio +
                ", disponible=" + disponible +
                ", generos=" + generos +
                '}';
    }

}
