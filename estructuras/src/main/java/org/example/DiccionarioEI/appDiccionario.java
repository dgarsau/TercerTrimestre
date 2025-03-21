package org.example.DiccionarioEI;

import java.util.Scanner;

public class appDiccionario {

    static Scanner input = new Scanner(System.in);

    static Diccionario diccionario = new Diccionario();

    public static void main(String[] args) {

        diccionario.nuevoPar("Perro", "Dog");
        diccionario.nuevoPar("Mesa", "Table");
        diccionario.nuevoPar("Coche", "Car");

        juegoDiccionario();

    }

    public static void juegoDiccionario(){

        String respuesta = "";
        int preguntas = 0;
        int aciertos = 0;
        int errores = 0;

        do {
            String palabra_es = diccionario.palabraAleatoria();
            System.out.println(palabra_es + ": " + diccionario.primeraLetraTraduccion(palabra_es) + "...");
            System.out.print("Indique la respuesta: ");

            respuesta = input.next();

            if (!respuesta.equals("fin")) {
                preguntas++;
                if (respuesta.equalsIgnoreCase(diccionario.traduce(palabra_es))) {
                    System.out.println("¡CORRECTO!");
                    aciertos++;
                } else {
                    System.out.println("¡NO! La respuesta correcta es " + diccionario.traduce(palabra_es));
                    errores++;
                }
            }
        } while (!respuesta.equals("fin"));

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + preguntas);
        System.out.println("Total aciertos: " + aciertos);
        System.out.println("Total errores: " + errores);
        System.out.println("Aciertos: " + aciertos*100/preguntas + "%");
    }

}
