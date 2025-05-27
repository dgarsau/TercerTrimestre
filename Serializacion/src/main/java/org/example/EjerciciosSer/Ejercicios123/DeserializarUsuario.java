package org.example.EjerciciosSer.Ejercicios123;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DeserializarUsuario {

    public static void main(String[] args) throws IOException {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/clase_prueba.ser"));
            ArrayList<Usuario> lista = (ArrayList<Usuario>) in.readObject();
            in.close();
            System.out.println("Usuarios:");
            System.out.println("----------------------------------");
            for (Usuario usuario : lista){
                System.out.println("Username: " + usuario.getUsername());
                System.out.println("Password: " + usuario.getPassword());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("-----------------------------------");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            System.out.println("Crando archivo con datos de prueba...");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/clase_prueba.ser"));
            ArrayList<Usuario> lista_prueba = new ArrayList<>(Arrays.asList(new Usuario("prueba", "prueba", "ejemplo@ejemplo.com")));
            out.writeObject(lista_prueba);
            out.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

    }

}
