package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad6 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int contador = 0;
        String[] vector;

        System.out.println("¿Qué palabra quieres buscar?");
        String palabra = input.next();

        try {

            BufferedReader lector = new BufferedReader(new FileReader("src/main/resources/datos.txt"));
            String linea;

            while ((linea = lector.readLine()) != null) {

                //Esto "limpia" el texto para que ignorar los símbolos de puntuación.
                linea = linea.replaceAll("[^A-Za-z ]", "");

                //Lo he hecho con un vector porque puede repetirse la palabra en una misma linea.
                vector = linea.split(" ");

                for (String p : vector){
                    if (p.equalsIgnoreCase(palabra)){
                        contador++;
                    }
                }

            }

            lector.close();

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
            throw new RuntimeException(e);
        }

        System.out.println(palabra + " aparece " + contador + " veces.");

    }

}