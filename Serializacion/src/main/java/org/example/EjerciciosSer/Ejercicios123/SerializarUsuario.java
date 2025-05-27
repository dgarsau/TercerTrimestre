package org.example.EjerciciosSer.Ejercicios123;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializarUsuario {

    public static void main(String[] args) {

        Usuario user1 = new Usuario("dani001", "hola1234", "daniel@ejemplo.com");
        Usuario user2 = new Usuario("juan123", "qwerty1234", "juan@ejemplo.com");
        Usuario user3 = new Usuario("maria777", "contrasenya", "maria@ejemplo.com");

        ArrayList<Usuario> lista = new ArrayList<>(Arrays.asList(user1, user2, user3));

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/clase_prueba.ser"));

            out.writeObject(lista);

            out.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        System.out.println("Objeto serializado en clase_prueba.ser");

    }

}
