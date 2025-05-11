package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Actividad7 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int contador = 0;

        System.out.println("¿Qué palabra quieres buscar?");
        String palabra = input.next();

        try {
            File archivo = new File("src/main/resources/datos_personas.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                linea = linea.replaceAll("[^A-Za-z ]", "");

                String[] vector = linea.split(" ");

                for (String p : vector){
                    if (p.equalsIgnoreCase(palabra)){
                        contador++;
                    }
                }
            }

            System.out.println("La palabra " + palabra + " aparece " + contador + " veces.");

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }
    }
}
