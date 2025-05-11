package org.example;

import java.io.*;
import java.util.Scanner;

public class Actividad10 {

    public static void main(String[] args) {

        File archivo1 = new File("src/main/resources/archivo1.txt");
        File archivo2 = new File("src/main/resources/archivo2.txt");
        File combinado = new File("src/main/resources/combinado.txt");

        try {

            Scanner lector1 = new Scanner(archivo1);
            Scanner lector2 = new Scanner(archivo2);
            BufferedWriter writer = new BufferedWriter(new FileWriter(combinado));

            while (lector1.hasNext() || lector2.hasNext()) {

                if (lector1.hasNext()){
                    writer.write(lector1.next() + " ");
                }

                if (lector2.hasNext()){
                    writer.write(lector2.next() + " ");
                }

            }

            lector1.close();
            lector2.close();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();

        }  catch (IOException e) {
            System.out.println("Ha habido algún problema.");
            e.printStackTrace();
        }

    }

}
