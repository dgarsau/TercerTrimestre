package org.example.RecaudacionCine;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class AppCine {

    static Random random = new Random();
    static Queue<Persona> lista_personas = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("*** CINE AL POBLE ***");
        generarCola();
        System.out.println(lista_personas);
        System.out.println("Gente que ha venido hoy: " + calcularGente());
        System.out.println("La recaudación ha sido de " + calcularRecaudacion());

    }

    public static void generarCola(){

        int personas = random.nextInt( 0,250);

        for (int i = 0 ; i < personas ; i++){
            lista_personas.add(new Persona(random.nextInt(3,100)));
        }
    }

    public static int calcularGente(){
        return lista_personas.size();
    }

    public static double calcularRecaudacion(){
        double total=0;
        while (!lista_personas.isEmpty()){
            if (lista_personas.peek().getEdad()<11){
                total+=1;
            } else if (lista_personas.peek().getEdad()<18){
                total+=2.50;
            } else {
                total+=3.50;
            }
            lista_personas.poll();
        }
        return total;
    }

}
