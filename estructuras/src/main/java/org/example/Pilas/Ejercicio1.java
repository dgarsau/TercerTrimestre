package org.example.Pilas;

import java.util.Stack;

public class Ejercicio1 {

    public static void main(String[] args) {
        Stack<Character> pila = new Stack<>();
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');

        if (pila.isEmpty()){
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("La pila no está vacía.");
        }

        System.out.println("Tamaño de la pila: " + pila.size());

        System.out.println("Peek: " + pila.peek());

        while (!pila.isEmpty()){
            System.out.println("Eliminando: " + pila.pop());
        }
    }
}
