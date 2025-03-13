package org.example.Colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<String> documentos = new LinkedList<>();
        System.out.println("Cuántos documentos quieres imprimir?");
        int num = in.nextInt();

        for (int i = 0 ; i < num ; i++){
            documentos.offer("Imprimir documento " + (i+1));
        }

        estadoInicial(documentos);

        while (!documentos.isEmpty()){
            documentos=procesarDocumento(documentos);
        }

        System.out.println("No hay más trabajos en la cola de impresión.");


    }

    public static void estadoInicial(Queue<String> documentos){
        System.out.println("Estado inicial de la cola de impresión: " + documentos);
    }

    public static Queue<String> procesarDocumento(Queue<String> documentos){
        System.out.println("Procesando: " + documentos.poll());
        System.out.println("Estado de la cola después de procesar el trabajo: " + documentos);
        return documentos;
    }

}
