package org.example.ProgramaMe;

public class RepartiendoElMaterial {

    static java.util.Scanner in;

    public static void casoDePrueba() {

        String entrada = in.nextLine();
        String[] vector = entrada.split(" ");

        int total = 0;

        int a = Integer.parseInt(vector[0]);
        int b = Integer.parseInt(vector[1]);
        int c = Integer.parseInt(vector[2]);

        int maximo = 1;

        for (int i = 1; i <= a && i <= b && i<=c; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                maximo = i;
            }
        }

        System.out.println(maximo);


    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        in.nextLine();

        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }

}
