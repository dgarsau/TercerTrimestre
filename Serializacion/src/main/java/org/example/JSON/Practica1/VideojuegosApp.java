package org.example.JSON.Practica1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VideojuegosApp {

    /* Las declaro como variables globales para acceder desde distintos métodos.
    * El Gson para escribir y leer.
    * La listaVideojuegos para añadir videojuego y leer. */
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static ArrayList<VideojuegoJSON> listaVideojuegos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){

        System.out.println("----------------------------------------------");
        System.out.println("Elige una opcion:");
        System.out.println("1. Añadir videojuego.");
        System.out.println("2. Generar JSON.");
        System.out.println("3. Leer JSON.");
        System.out.println("4. Mostrar juegos con precios menores a 30€.");
        System.out.println("0. Salir.");
        System.out.println("----------------------------------------------");

        char respuesta = input.next().charAt(0);
        input.nextLine();

        switch (respuesta){
            case '1':
                introducirVideojuego();
                menu();
                break;
            case '2':
                generarJSON();
                menu();
                break;
            case '3':
                leerJSON();
                menu();
                break;
            case '4':
                imprimirMenorQue30();
                menu();
                break;
            default:
                break;
        }
    }

    public static void introducirVideojuego(){
        boolean disponible = false;

        System.out.println("Introduce un videojuego:");

        System.out.println("Nombre:");
        String nombre = input.nextLine();

        System.out.println("Plataforma:");
        String plataforma = input.nextLine();

        System.out.println("Precio:");
        double precio = input.nextDouble();
        input.nextLine();

        System.out.println("Disponible(S/N):");
        char eleccion = input.next().toUpperCase().charAt(0);

        if (eleccion == 'S'){
            disponible = true;
        }

        input.nextLine();

        //Utiliza la entrada para generar una lista de géneros con un split.
        System.out.println("Generos (Separados por comas):");
        String genero = input.nextLine();

        String[] vectorGeneros = genero.split(",");
        ArrayList<String> listaGeneros = new ArrayList<>(Arrays.asList(vectorGeneros));

        listaVideojuegos.add(new VideojuegoJSON(nombre, plataforma, precio, disponible, listaGeneros));

    }

    public static void generarJSON(){

        String json = gson.toJson(listaVideojuegos);
        System.out.println("JSON: " + json);

        try (FileWriter writer = new FileWriter("src/main/resources/json/videojuegos.json")) {
            gson.toJson(listaVideojuegos, writer);
            System.out.println("JSON guardado en videojuegos.json");
        } catch (Exception e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

    }

    public static void leerJSON(){

        try {
            FileReader reader = new FileReader("src/main/resources/json/videojuegos.json");

            /* Al ser una lista he tenido que hacerlo así. No está en los apuntes, lo he sacado de aquí:
            https://adictosaltrabajo.com/2012/09/17/gson-java-json/#035 */

            Type tipoListaVideojuegos = new TypeToken<List<VideojuegoJSON>>(){}.getType();
            listaVideojuegos = gson.fromJson(reader, tipoListaVideojuegos);


            for (VideojuegoJSON videojuego: listaVideojuegos){
                System.out.println(videojuego.getNombre());
                System.out.println("----------------------------------------------");
                System.out.println("Precio: " + videojuego.getPrecio());
                System.out.println("Plataforma: " + videojuego.getPlataforma());
                System.out.println("Disponible: " + videojuego.isDisponible());
                System.out.println("Géneros: " + videojuego.getGeneros());
                System.out.println("----------------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void imprimirMenorQue30(){

        try {
            FileReader reader = new FileReader("src/main/resources/json/videojuegos.json");

            /* Al ser una lista he tenido que hacerlo así. No está en los apuntes, lo he sacado de aquí:
            https://adictosaltrabajo.com/2012/09/17/gson-java-json/#035 */

            Type tipoListaVideojuegos = new TypeToken<List<VideojuegoJSON>>(){}.getType();
            listaVideojuegos = gson.fromJson(reader, tipoListaVideojuegos);


            for (VideojuegoJSON videojuego: listaVideojuegos){
                if (videojuego.getPrecio()<30){
                    System.out.println(videojuego.getNombre());
                    System.out.println("----------------------------------------------");
                    System.out.println("Precio: " + videojuego.getPrecio());
                    System.out.println("Plataforma: " + videojuego.getPlataforma());
                    System.out.println("Disponible: " + videojuego.isDisponible());
                    System.out.println("Géneros: " + videojuego.getGeneros());
                    System.out.println("----------------------------------------------");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }





}
