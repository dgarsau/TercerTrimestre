package org.example.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {

    static Scanner in = new Scanner(System.in);
    static Deque<String> lista = new LinkedList<>();

    public static void main(String[] args) {

        eleccionMenu();


    }

    public static void imprimirMenu(){

        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("""
                        1. Añadir producto al final
                        2. Eliminar primer producto
                        3. Eliminar producto por nombre
                        4. Ver primer producto
                        5. Buscar producto
                        6. Mostrar lista actual
                        X. Salir
                        """
        );
    }

    public static void eleccionMenu(){

        System.out.println("Seleccione una opción: ");

        switch (in.next().charAt(0)){

            case '1':
                anyadirProducto();
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            case '5':
                break;
            case '6':
                mostrarLista();
                break;
            default:
                break;

        }
    }

    public static void anyadirProducto(){

    }

    public static void eliminarProducto(){

    }

    public static void eliminarProductoPorNombre(){

    }

    public static void verPrimerProducto(){

    }

    public static void mostrarLista(){
        System.out.println(lista);
    }

}
