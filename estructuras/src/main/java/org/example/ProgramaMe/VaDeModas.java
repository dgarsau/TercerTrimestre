package org.example.ProgramaMe;

import java.util.HashMap;
import java.util.Map;

public class VaDeModas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int numero = in.nextInt();
        in.nextLine();

        if (numero==0) {
            return false;
        } else {
            String numeros = in.nextLine();
            String[] numeros_vector = numeros.split(" ");

            Map<String,Integer> mapaNumeros = new HashMap<>();

            Integer max = 0;
            String clave_max = "0";

            for (String num : numeros_vector) {

                if (mapaNumeros.containsKey(num)) {
                    mapaNumeros.put(num, mapaNumeros.get(num) + 1);
                } else {
                    mapaNumeros.put(num, 1);
                }

                if (max < mapaNumeros.get(num)) {
                    max = mapaNumeros.get(num);
                    clave_max = num;
                }

            }

            System.out.println(clave_max);

            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}

