package org.example.AceptaElReto;

import java.util.HashMap;

public class VaDeModas {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int num = in.nextInt();
        if (num==0) {
            return false;
        } else {
            String string = in.nextLine();
            String[] split = string.split(" ");
            HashMap<String, Integer> mapaNumeros = new HashMap<>();
            for (String numero : mapaNumeros){

            }
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}

