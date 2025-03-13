package org.example.Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Stack<Integer> numeros = new Stack<>();
        System.out.println("Introduce el primer número:");
        numeros.push(entrada.nextInt());
        System.out.println("Introduce el segundo número:");
        numeros.push(entrada.nextInt());
        System.out.println("Introduce el tercer número:");
        numeros.push(entrada.nextInt());

        System.out.println("Números en orden inverso:");
        while(!numeros.isEmpty()){
            System.out.println(numeros.pop());
        }
    }
}
