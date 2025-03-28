package org.example.comparadores;

import java.util.*;

public class Prueba_mapas {

    public static void main(String[] args) {

        Map<Integer, String> mapita = new HashMap<>();
        mapita.put(12324, "Patricia");
        mapita.put(584993, "Manuel");
        mapita.put(3452, "Raul");

        List<Map.Entry<Integer, String>> listaMapa = new ArrayList<>(mapita.entrySet());
        listaMapa.sort(Map.Entry.comparingByValue());
        //listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


        for (Map.Entry<Integer, String> mapa : listaMapa){

            System.out.println("DNI: " + mapa.getKey() + " con nombre " + mapa.getValue());

        }

    }

}
