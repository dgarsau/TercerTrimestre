package org.example.DiccionarioEI;

import java.util.HashMap;
import java.util.Random;

public class Diccionario {

    static Random random = new Random();

    private HashMap<String,String> diccionario;

    public Diccionario() {
        diccionario = new HashMap<>();
    }

    public void nuevoPar(String espanyol, String ingles){
        diccionario.put(espanyol, ingles);
    }

    public String traduce(String espanyol){
        return diccionario.get(espanyol);
    }

    public String palabraAleatoria(){

        String aleatoria = "";
        int num = random.nextInt(diccionario.size());
        int contador = 0;
        for (String palabra : diccionario.keySet()){
            if (contador==num){
                aleatoria = palabra;
                break;
            }
            contador++;
        }
        return aleatoria;
    }

    public Character primeraLetraTraduccion(String espanyol){
        return diccionario.get(espanyol).charAt(0);
    }

}
