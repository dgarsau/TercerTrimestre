package org.example.EjerciciosSer.Ejercicios4;

import org.example.EjerciciosSer.Ejercicios123.Usuario;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class DeserializarHashMap {

    public static void main(String[] args) throws IOException {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/mapa.ser"));
            HashMap<Integer, String> mapa = (HashMap<Integer, String>) in.readObject();
            in.close();

            System.out.println("Números ordenados:");
            System.out.println("----------------------------------");

            TreeMap<Integer, String> mapaOrdenado = new TreeMap<>(mapa);

            for (Map.Entry<Integer, String> numero : mapaOrdenado.entrySet()){
                System.out.println(numero.getKey() + ": " + numero.getValue());
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }
    }
}
