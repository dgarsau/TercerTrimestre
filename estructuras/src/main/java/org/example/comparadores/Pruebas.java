package org.example.comparadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pruebas {

    public static void main(String[] args) {

        ArrayList<Integer> numeritos = new ArrayList<>(Arrays.asList(3,2,45,23,5));

        Collections.sort(numeritos);
        System.out.println(numeritos);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Patri", "Pol", "Izan", "Andrew"));
        Collections.sort(nombres);
        System.out.println(nombres);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Sudadera", 6));
        listaProductos.add(new Producto("Pan", 1));
        listaProductos.add(new Producto("Arroz", 4));
        listaProductos.add(new Producto("Arroz", 6));


        Collections.sort(listaProductos, new CompararPorPrecio());
        System.out.println(listaProductos);



    }

}
