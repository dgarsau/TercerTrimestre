package org.example.mapas;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {

    public static void main(String[] args) {

        HashMap<String, Integer> mapaNotas = new HashMap<>();

        mapaNotas.put("Adrian", 3);
        mapaNotas.put("Raul", 6);
        mapaNotas.put("Manuel", 7);
        mapaNotas.put("Adrian", 4);

        System.out.println("Nota para Adrían: " + mapaNotas.get("Adrian"));

        mapaNotas.remove("Manuel");

        System.out.println(mapaNotas.keySet());
        System.out.println(mapaNotas.values());

        if (mapaNotas.containsKey("Adrian")){
            System.out.println("Adrian existe.");
        }

        if (mapaNotas.containsValue(10)){
            System.out.println("Alguien tiene un 10.");
        }

        for (String claves : mapaNotas.keySet()){
            System.out.println("Clave: " + claves);
        }

        for (Integer notas : mapaNotas.values()){
            System.out.println("Nota: " + notas);
        }

        for (Map.Entry<String, Integer> notas : mapaNotas.entrySet()){
            System.out.println("Nota de " + notas.getKey() + " es de " + notas.getValue());
        }



    }


}
