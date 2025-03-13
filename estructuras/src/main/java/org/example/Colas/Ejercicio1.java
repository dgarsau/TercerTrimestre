package org.example.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio1 {

    public static void main(String[] args) {

        Queue<Character> cola = new LinkedList<>();
        cola.offer('a');
        cola.offer('b');
        cola.offer('c');
        cola.offer('d');
        cola.offer('e');

        if (cola.isEmpty()){
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("La cola no está vacía.");
        }

        System.out.println("Tamaño de la cola: " + cola.size());

        System.out.println("Primer elemento: " + cola.peek());

        System.out.println("Vaciando la cola...");

        while(!cola.isEmpty()){
            System.out.println(cola.poll());
        }

    }

}
