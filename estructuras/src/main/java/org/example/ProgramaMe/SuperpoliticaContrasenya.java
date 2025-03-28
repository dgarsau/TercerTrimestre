package org.example.ProgramaMe;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperpoliticaContrasenya {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        ArrayList<Character> especiales = new ArrayList<>(Arrays.asList('+','_',')','(','*','&','^','%','$','#','@','!','.','/',',',',',';','{','}'));
        String contrasenya = in.next();

        int tamanyo = contrasenya.length();

        boolean numero = false;
        boolean minus = false;
        boolean mayus = false;
        boolean especial = false;

        for (Character caracter : contrasenya.toCharArray()){
            if (Character.isDigit(caracter)){
                numero=true;
            }
            if (Character.isLowerCase(caracter)){
                minus=true;
            }
            if (Character.isUpperCase(caracter)){
                mayus=true;
            }
            if (especiales.contains(caracter)){
                especial=true;
            }

        }

        if (numero && minus && mayus && especial && tamanyo>=12){
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }


    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}

