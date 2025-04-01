package org.example.StringBuilder;

import java.util.Random;
import java.util.Scanner;

public class CarreraBuses {

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    public static final int TAM = 97;
    public static void main(String[] args) throws InterruptedException {

        System.out.print("Introduce el nombre del bus 1:");
        String nombre1 = input.nextLine();
        String bus1 = introducirNombre(nombre1);
        System.out.print("Introduce el nombre del bus 2:");
        String nombre2 = input.nextLine();
        String bus2 = introducirNombre(nombre2);

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0; // SEGUNDO BUS
        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);
        while (a < TAM && b < TAM) {

            int randoma = random.nextInt(2);
            int randomb = random.nextInt(2);

            if (randoma==1){
                a++;
            }
            if (randomb==1){
                b++;
            }

            limpiarPantalla();

            if (a<TAM && b<TAM) {
                System.out.println(dibujarCarrera(a, b, bus1, bus2));
                Thread.sleep(25);
            }
            

        }
        if (a==TAM){
            System.out.println("\033[32m"+ "EL AUTOBUSITO "+ nombre1 +" HA LLEGADO A SU DESTINO!!" +
                    "\033[0m");
        } else {
            System.out.println("\033[32m"+ "EL AUTOBUSITO "+ nombre2 +"  HA LLEGADO A SU DESTINO!!" +
                    "\033[0m");
        }

    }

    public static String dibujarCarrera(int n1, int n2, String bus1, String bus2) {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("_______________ ").append(" ".repeat(101 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   "+ bus1 +"  |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("_______________ ").append(" ".repeat(101 - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|   "+ bus2 +"  |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static String introducirNombre(String nombre){
        StringBuilder bus = new StringBuilder();
        bus.insert(0, nombre);

        if(bus.length()>12){
            bus.delete(12,bus.length());
        }
        while(bus.length()<12){
            bus.append(" ");
        }
        return bus.toString();

    }
}

