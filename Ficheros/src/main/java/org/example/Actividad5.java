package org.example;

import java.io.File;
import java.util.Scanner;

public class Actividad5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Selecciona una carpeta:");
        String rutaCarpeta = input.next();

        System.out.println("¿Quieres filtrar?(S/N)");
        char eleccion = input.next().toUpperCase().charAt(0);

        switch (eleccion){
            case 'S':
                System.out.println("Elige la extensión (.txt, .pdf, .jpg ...)");
                String extension = input.next();
                listarArchivos(rutaCarpeta, extension);
                break;
            case 'N':
                listarArchivos(rutaCarpeta);
                break;
            default:
                System.out.println("La opción elegida no existe, cerrando el programa...");
                break;
        }

    }

    public static void listarArchivos(String rutaCarpeta) {
        File carpeta = new File(rutaCarpeta);
        if (carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();
            if (archivos != null && archivos.length > 0) {
                for (File f : archivos) {
                    if (f.isFile()) {
                        System.out.println(f.getName() + " - " + f.length() + "bytes");
                    }
                }
            }else{
                System.out.println("No se ha encontrado ningún archivo.");
            }
        } else System.err.println("La ruta proporcionada no es una carpeta");
    }

    public static void listarArchivos(String rutaCarpeta, String extension){

        File carpeta = new File(rutaCarpeta);
        boolean hayarchivo = false;
        if (carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();
            if (archivos != null && archivos.length > 0) {
                for (File f : archivos) {
                    if (f.isFile() && f.getName().contains(extension)) {
                        System.out.println(f.getName() + " - " + f.length() + "bytes");
                        hayarchivo = true;
                    }
                }
            }

            if (!hayarchivo){
                System.out.println("No se ha encontrado ningún archivo.");
            }

        } else System.err.println("La ruta proporcionada no es una carpeta");

    }

}
