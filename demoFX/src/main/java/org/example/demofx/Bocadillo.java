package org.example.demofx;

public class Bocadillo {

    private String nombre;
    private double precio;

    public Bocadillo(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

}
