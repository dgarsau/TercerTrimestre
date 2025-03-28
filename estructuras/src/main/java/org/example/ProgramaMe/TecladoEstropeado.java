package org.example.ProgramaMe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class TecladoEstropeado {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {

        if (!in.hasNext())
            return false;
        else {
            String entrada = in.nextLine();

            LinkedList<Character> texto = new LinkedList<>();
            ListIterator<Character> it = texto.listIterator();

            for (char c : entrada.toCharArray()) {

                switch (c) {
                    case '-':
                        while (it.hasPrevious()){
                            it.previous();
                        }
                        break;

                    case '+':
                        while(it.hasNext()){
                            it.next();
                        }
                        break;

                    case '*':
                        if(it.hasNext()){
                            it.next();
                        }
                        break;

                    case '3':
                        if (it.hasNext()){
                            it.next();
                            it.remove();
                        }
                        break;

                    default:
                        it.add(c);
                        break;
                }

            }

            for (char c : texto){
                System.out.print(c);
            }

            System.out.println();

            return true;
        }
    }


    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}


