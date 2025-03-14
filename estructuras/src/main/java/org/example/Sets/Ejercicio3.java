package org.example.Sets;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedHashSet<String> historial = new LinkedHashSet<>();
        String url;

        do {
            System.out.print("Escribe una URL visitada (o 'salir' para terminar):");
            url = in.next();
            if(!url.equals("salir")){
                historial.add(url);
            }
        } while (!url.equals("salir"));

        System.out.println("Historial de navegación:");

        int contador = 0;
        for (String elemento : historial){
            contador++;
            System.out.println(contador + ". " + elemento);
        }

    }
}
