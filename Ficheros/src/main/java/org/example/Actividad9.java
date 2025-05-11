package org.example;

import java.io.*;

public class Actividad9 {

    public static void main(String[] args) {

        File archivo = new File("src/main/resources/archivo.txt");
        File archivoTemp = new File("src/main/resources/archivoTemp.txt");

        try {

            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemp));

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] vector = linea.split(" ");

                for (String p : vector){

                    //Me daba un error por index
                    if (!p.equals("")){
                        char letra = p.toUpperCase().charAt(0);
                        p = letra + p.substring(1);
                        writer.write(p);
                    }

                    writer.write(" ");
                }
                writer.newLine();

            }

            lector.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("Ha habido algún problema.");
            e.printStackTrace();
        }

        if (archivo.delete()) {
            archivoTemp.renameTo(archivo);
            System.out.println("Archivo modificado correctamente.");
        } else {
            System.out.println("No se ha podido reemplazar el archivo original.");
        }

    }

}
