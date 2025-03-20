package org.example.mapas.Ejercicio3;

import java.util.Scanner;

public class AppTemperaturas {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String opcion;
        String datos;

        RegistroTemperatura registro = new RegistroTemperatura();

        registro.insertarTemperatura("Alicante", 32);
        System.out.println(registro);
        registro.actualizarTemperatura("Alicante");
        System.out.println(registro);
        registro.insertarTemperatura("Torrellano", 30);
        registro.insertarTemperatura("Mutxamel", 36);
        registro.verTodas();



        System.out.println("*** REGISTRO DE TEMPERATURAS ***");
        do {
            opcion = elegirOpcion();
            switch (opcion){
                case "insertar":
                    System.out.println("Introduce los nuevos datos (ciudad-temperatura)");
                    datos = input.next();
                    //registro.insertarTemperatura();
            }
        } while (!opcion.equals("salir"));

    }

    public static String elegirOpcion(){
        System.out.println("Elige una opción (insertar, actualizar, consultar, ver todas, salir): ");
        return input.nextLine();
    }



}
