package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce una palabra:");
        String palabra = in.next();

        String[] letras = palabra.split("");

        Map<String, Integer> mapaLetras = new HashMap<>();

        for (String letra : letras){

            mapaLetras.put(letra, mapaLetras.getOrDefault(letra, 0)+1);

        }

        for (Map.Entry<String, Integer> letra : mapaLetras.entrySet()){
            System.out.println(letra.getKey() + ": " + letra.getValue());
        }

    }

}
