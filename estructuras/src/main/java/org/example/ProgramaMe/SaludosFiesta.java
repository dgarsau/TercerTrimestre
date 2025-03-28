package org.example.ProgramaMe;

public class SaludosFiesta {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        int grupos = in.nextInt();
        int personas = grupos*3;
        int saludos = 0;

        for (int i=personas-1 ; i>0 ; i--){
            saludos+=i;
        }

        System.out.println(saludos);

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}


