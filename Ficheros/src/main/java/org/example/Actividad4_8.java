package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad4_8 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        crearArchivos();

    }

    public static void crearArchivos(){

        System.out.println("¿En qué carpeta los quieres guardar?");
        String carpeta = input.next();

        File directorio = new File(carpeta);

        if(directorio.exists()) System.out.println("Carpeta " + directorio.getName() + " seleccionada.");
        else {
            System.out.println("La carpeta " + directorio.getName() + " no existe");
            if(directorio.mkdir()){
                System.out.println("Carpeta " + directorio.getName() + " creada en la ruta " + directorio.getAbsolutePath());
            }
        }

        System.out.println("¿Cuántos archivos quieres crear?");
        int numero = input.nextInt();

        System.out.println("¿Qué nombre le quieres poner al archivo?");
        String nombre = input.next();

        System.out.println("Creando archivos...");
        File archivo;

        for (int i = 1; i <= numero; i++) {

            archivo = new File(carpeta+"/"+nombre+i+".txt");

            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado: " + archivo.getName());
                    escribirArchivo(archivo);
                }
            } catch (IOException e) {
                System.out.println("Ha habido algún problema.");
                e.printStackTrace();
            }

        }

    }

    //Actividad 8
    public static void escribirArchivo(File archivo){

        try {

            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));
            escritor.write("Este es el fichero " + archivo.getName());
            escritor.close();

        } catch (IOException e) {
            System.out.println("Ha habido algún problema.");
            e.printStackTrace();
        }

    }

}
