package org.example.EjerciciosPilas;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio3 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce la expresión");
        String expresion = entrada.next();
        boolean balanceado = esBalanceado(expresion);
        if (balanceado){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

    public static boolean esBalanceado(String expresion){

        Stack<Character> pila = new Stack<>();

        for (int i = 0 ; i<expresion.length() ; i++){
            if(expresion.charAt(i)=='('){
                pila.push('(');
            } else if (expresion.charAt(i)==')'){
                if (pila.contains('(')){
                    pila.pop();
                } else {
                    pila.push(')');
                }
            }
        }

        if(pila.isEmpty()){
            return true;
        } else {
            return false;
        }

    }
}
