package org.example.iterator;

import java.rmi.MarshalledObject;
import java.util.*;

public class Pruebas {

    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(10, 23, 45, 1, 3, 5));

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()){

            Integer num = it.next();

            if(num == 23){
                it.remove();
            }

        }

        System.out.println(numeros);

        ArrayList<Casino> listaCasino = new ArrayList<>();
        listaCasino.add(new Casino("poker", 500));
        listaCasino.add(new Casino("ruleta", 25));
        listaCasino.add(new Casino("blackjack", 50));

        Iterator<Casino> casinoIterator = listaCasino.iterator();

        while (casinoIterator.hasNext()){

            Casino casino = casinoIterator.next();
            System.out.println(casino);

            if (casino.getApuesta_minima()>0.20){
                System.out.println("Raul no puede jugar");
            }

            if (casino.getApuesta_minima()<30){
                casinoIterator.remove();
            }

        }

        System.out.println(listaCasino);

        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Hola", "Helou");
        diccionario.put("Casa", "House");
        diccionario.put("Lapiz", "Pencil");

        for (Map.Entry<String, String> mapita : diccionario.entrySet()){

        }

        Iterator<Map.Entry<String, String>> iter = diccionario.entrySet().iterator();

        while (iter.hasNext()){
            Map.Entry<String, String> mapita = iter.next();
            System.out.println("Palabra en español: " + mapita.getKey() + ". Palabra en ingles: " + mapita.getValue());

        }

    }

}
