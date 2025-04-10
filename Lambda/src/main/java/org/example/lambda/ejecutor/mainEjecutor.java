package org.example.lambda.ejecutor;

public class mainEjecutor {

    public static void main(String[] args) {

        // EJERCICIO 1

        Ejecutor ej = new Ejecutor(){
            @Override
            public boolean ejecutar(int param1) {
                System.out.println("Comparando para " + param1 + ":");
                return param1 > 10;
            }
        };

        Ejecutor lambda = (param1) -> {
            System.out.println("Comparando para " + param1 + ":");
            return param1 > 10;
        };

        System.out.println(lambda.ejecutar(15));
        System.out.println(lambda.ejecutar(5));

        System.out.println();

        // EJERCICIO 2

        VerificarVoto verificar_anonima = new VerificarVoto() {
            @Override
            public boolean puedeVotar(String nombre, int edad) {
                System.out.println("Probando " + nombre + " con " + edad + "...");
                return edad > 18;
            }
        };

        VerificarVoto verificar_lambda = (nombre, edad) -> {
            System.out.println("Probando " + nombre + " con " + edad + "...");
            return edad > 18;
        };

        System.out.println(verificar_anonima.puedeVotar("Demetrio", 12));
        System.out.println(verificar_lambda.puedeVotar("Izán", 20));

    }

}
