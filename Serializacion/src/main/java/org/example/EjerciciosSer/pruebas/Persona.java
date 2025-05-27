package org.example.EjerciciosSer.pruebas;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " tiene " + edad + " años.";
    }

}
