package org.example.EjerciciosSer.Ejercicios4;

import org.example.EjerciciosSer.Ejercicios123.Usuario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SerializarHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "uno");
        mapa.put(3, "tres");
        mapa.put(4, "cuatro");
        mapa.put(5, "cinco");
        mapa.put(2, "dos");

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/mapa.ser"));
            out.writeObject(mapa);

            out.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        System.out.println("Objeto serializado en mapa.ser");

    }

}
