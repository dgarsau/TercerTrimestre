package org.example;

import java.io.File;
import java.io.IOException;

public class Actividad1 {
    public static void main(String[] args) {

        File archivo = new File("src/main/resources/prueba.txt"); //Cambio la ruta

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo " + archivo.getName() + " ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ha habido algún problema.");
            e.printStackTrace();
        }

    }
}