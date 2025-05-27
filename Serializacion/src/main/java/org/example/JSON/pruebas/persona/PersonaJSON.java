package org.example.JSON.pruebas.persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaJSON {
    private String nombre;
    private int edad;
    private List<String> lenguajes;

    public PersonaJSON() {
    }

    public PersonaJSON(String nombre, int edad, List<String> lenguajes) {
        this.nombre = nombre;
        this.edad = edad;
        this.lenguajes = new ArrayList<>(lenguajes);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getLenguajes() {
        return lenguajes;
    }

}


