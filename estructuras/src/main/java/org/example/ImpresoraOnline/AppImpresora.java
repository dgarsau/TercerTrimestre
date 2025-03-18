package org.example.ImpresoraOnline;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class AppImpresora {

    static final String ID_PC = "PC3493";
    static LinkedHashSet<Peticion> listaPeticiones = new LinkedHashSet<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        anayadirDocumento("prueba.pdf");
        anayadirDocumento("prueba.txt");
        anayadirDocumento("prueba1.pdf");
        anayadirDocumento("prueba2.pdf");
        anayadirDocumento("prueba2.pdf");
        imprimirDocumento();
        System.out.println("Quedan "+ getNumeroPeticiones() + " peticiones en la cola.");
        System.out.println(listaPeticiones);
        verTodo();
        imprimirTodo();

    }

    public static void anayadirDocumento(String nombre_fichero){

        if (nombre_fichero.endsWith(".pdf")){
            if(listaPeticiones.add(new Peticion(ID_PC, nombre_fichero))){
                System.out.println("Fichero " + nombre_fichero + " añadido a la cola de impresión.");
            } else {
                System.out.println("El archivo " + nombre_fichero + " ya existe en la cola.");
            }
        }else {
            System.out.println("El archivo " + nombre_fichero + " no es un pdf no tiene formato requerido (.pdf)");
        }

    }

    public static void imprimirDocumento(){

        System.out.println("Imprimiendo... " + listaPeticiones.getFirst().getNombre());
        listaPeticiones.removeFirst();

    }

    public static int getNumeroPeticiones(){
        return listaPeticiones.size();
    }

    public static void verTodo(){
        System.out.println("Cola de impresión: " + listaPeticiones);
    }

    public static void imprimirTodo(){
        while(!listaPeticiones.isEmpty()){
            imprimirDocumento();
        }
        System.out.println("La cola de impresión ha finalizado.");
    }

}
