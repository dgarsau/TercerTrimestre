package org.example.ProgramaMe;

import java.util.Stack;

public class ParentesisBalanceados {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            String cadena = in.nextLine();
            boolean balanceados = esBalanceado(cadena);

            if(balanceados){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean esBalanceado(String cadena){

        Stack<Character> pila = new Stack<>();

        for (int i = 0 ; i<cadena.length() ; i++){

            char caracter = cadena.charAt(i);

            switch (caracter){
                case '(':
                    pila.push('(');
                    break;
                case ')':
                    if(pila.peek().equals('(')){
                        pila.pop();
                    }
                    break;
                case '[':
                    pila.push('[');
                    break;
                case ']':
                    if(pila.peek().equals('[')){
                        pila.pop();
                    }
                    break;
                case '{':
                    pila.push('{');
                    break;
                case '}':
                    if(pila.peek().equals('{')){
                        pila.pop();
                    }
                    break;
            }

        }

        if(pila.isEmpty()){
            return true;
        } else {
            return false;
        }

    }

}



