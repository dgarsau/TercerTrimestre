package org.example.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce la palbra:");
        String palabra = in.next();
        Deque<Character> lista = new LinkedList<>();

        for (int i = 0 ; i < palabra.length() ; i++){
            lista.offer(palabra.charAt(i));
        }

        boolean palindromo=esPalindromo(lista);

        if (palindromo){
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }


    }

    public static boolean esPalindromo(Deque<Character> lista){

        while (lista.size()>1){
            if (lista.peekFirst()==lista.peekLast()){
                lista.pollFirst();
                lista.pollLast();
            } else {
                return false;
            }
        }
        return true;
    }

}
