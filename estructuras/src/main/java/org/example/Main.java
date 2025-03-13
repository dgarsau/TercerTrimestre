package org.example;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(18);
        pila.push(2);

        System.out.println("-----------");

        for (Integer num : pila){
            System.out.println(num);
        }

        while(!pila.isEmpty()){
            pila.pop();
        }

        for (Integer num : pila){
            System.out.println(num);
        }

    }
}
