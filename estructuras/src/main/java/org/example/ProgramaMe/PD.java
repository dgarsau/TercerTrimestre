package org.example.ProgramaMe;

import java.util.Arrays;

public class PD {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        String entrada = in.nextLine();
        String[] fc = entrada.split(" ");

        int[][] matriz = new int[Integer.parseInt(fc[0])][Integer.parseInt(fc[1])];

        for (int i = 0; i < matriz.length; i++) {
            String[] fila=in.next().split("");

            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=Integer.parseInt(fila[j]);
            }
        }

        boolean error = false;

        String[] persona1=in.next().split("");
        String[] persona2=in.next().split("");
        String[] persona3=in.next().split("");

        String[] puerta=in.next().split("");

        while (!error){
            int filap = Integer.parseInt(persona1[0])-1;
            int colup = Integer.parseInt(persona1[1])-1;
            int filapu = Integer.parseInt(puerta[0])-1;
            int colupu = Integer.parseInt(puerta[1])-1;
        }

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    }
}
