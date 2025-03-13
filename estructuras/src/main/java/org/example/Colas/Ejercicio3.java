package org.example.Colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<String> playlist = new LinkedList<>();
        String cancion;

        System.out.println("Introduce canciones... (X para terminar)");
        
        do {
            cancion = in.nextLine();
            if (!cancion.equalsIgnoreCase("X")){
                playlist.offer(cancion);
            }
        } while (!cancion.equalsIgnoreCase("X"));

        estadoInicial(playlist);

        while (!playlist.isEmpty()){
            playlist=procesarDocumento(playlist);
        }

        System.out.println("La playlist está vacía...");


    }

    public static void estadoInicial(Queue<String> playlist){
        System.out.println("--------------------------------------------");
        System.out.println("Estado inicial de la playlist: " + playlist);
        System.out.println("--------------------------------------------");

    }

    public static Queue<String> procesarDocumento(Queue<String> playlist){
        System.out.println("♫ Reproduciendo: " + playlist.poll() + " ♫");
        System.out.println("Estado de la playlist después de reproducir una canción: " + playlist);
        System.out.println();
        return playlist;
    }

}
