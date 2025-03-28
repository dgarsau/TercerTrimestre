package org.example.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Pruebas_listIterator {

    public static void main(String[] args) {

        ArrayList<Character> letritas = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'x', 'z'));
        ListIterator<Character> iterator = letritas.listIterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");

            if (letritas.get(3) == 'x'){
                iterator.set('r');
            }
            iterator.add('z');
        }

        System.out.println();
        ListIterator<Character> iterator_patras = letritas.listIterator(letritas.size());

        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }

        while (iterator_patras.hasPrevious()){

            int indice_actual = iterator_patras.nextIndex();
            System.out.println("Posicion: " + indice_actual);

            Character letrita = iterator_patras.previous();
            System.out.println("Letra: " + letrita + ", indice siguiente: ");
        }

    }


}
