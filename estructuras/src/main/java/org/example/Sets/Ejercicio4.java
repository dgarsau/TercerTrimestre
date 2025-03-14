package org.example.Sets;

import java.util.TreeSet;

public class Ejercicio4 {

    public static void main(String[] args) {

        TreeSet<Integer> numeros1 = new TreeSet<>();
        TreeSet<Integer> numeros2 = new TreeSet<>();

        numeros1.add(9);
        numeros1.add(1);
        numeros1.add(3);
        numeros1.add(5);
        numeros1.add(7);

        numeros2.add(6);
        numeros2.add(2);
        numeros2.add(10);
        numeros2.add(4);
        numeros2.add(8);
        numeros2.add(11);

        System.out.println(numeros1);
        System.out.println(numeros2);

        TreeSet<Integer> numeros3 = new TreeSet<>();

        while(!numeros1.isEmpty() || !numeros2.isEmpty()){
            if(!numeros1.isEmpty()){
                numeros3.add(numeros1.pollFirst());
            } else {
                numeros3.add(numeros2.pollFirst());
            }
        }

        System.out.println(numeros3);

    }
}
