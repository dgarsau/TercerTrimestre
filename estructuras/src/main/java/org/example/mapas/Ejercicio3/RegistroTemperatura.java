package org.example.mapas.Ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperatura {

    static Scanner input = new Scanner(System.in);

    private HashMap<String, Integer> mapaTemperaturas;

    public RegistroTemperatura(){
        mapaTemperaturas = new HashMap<>();
    }

    public void insertarTemperatura(String ciudad, Integer temperatura){
        mapaTemperaturas.put(ciudad, temperatura);
    }

    public void actualizarTemperatura(String ciudad){
        System.out.println("Inserta la nueva temperatura de " + ciudad + ":");
        mapaTemperaturas.put(ciudad, input.nextInt());
        System.out.println("Temperatura actualizada.");
    }

    public void consultar(){
        System.out.println("Introduce la ciudad a consultar: ");
        String ciudad = input.next();
        if(mapaTemperaturas.containsKey(ciudad)){
            System.out.println("La temperatura en " + ciudad + "es de " + mapaTemperaturas.get(ciudad));
        } else {
            System.out.println("La ciudad de " + ciudad + "no tiene temperaturas registradas.");
        }

    }

    public void verTodas(){
        for (Map.Entry<String, Integer> temperatura : mapaTemperaturas.entrySet()){
            System.out.println(temperatura.getKey() + ": " + temperatura.getValue() + "º");
        }
    }

    @Override
    public String toString() {
        return "RegistroTemperatura{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }


}
