package org.example.Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> palabras = new LinkedHashSet<>();

        System.out.print("Introduce una frase:");
        String frase = in.nextLine().toLowerCase();

        for (String palabra : frase.split(" ")) {
           palabras.add(palabra);
        }

        System.out.println("Palabras únicas: " + palabras);



    }

}
