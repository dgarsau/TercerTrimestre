package org.example.lambda.pokemon;

import java.util.*;

public class AppPokemon {

    public static void main(String[] args) {

        Pokedex poke1 = new Pokedex("Squirtle", 5);
        Pokedex poke2 = new Pokedex("Charmander", 2);

        Pokemon magikarp = new Pokemon() {
            @Override
            public void atacar(int nivel, Pokedex pokedex) {
                System.out.println("Atacando con nivel: " + nivel + ". SALPICADURAAA");
                System.out.println("Lucha contra " + pokedex.getPokemon());
            }
        };

        magikarp.atacar(12, poke1);
        System.out.println();

        Pokemon pikachu = (nivel, pokedex) -> {
            System.out.println("Atacando con nivel: " + nivel + ". IMPACTRUENOOO");
            System.out.println("pika pika");
            System.out.println("Lucha contra " + pokedex.getPokemon());
        };

        pikachu.atacar(15, poke2);

        List<Pokedex> listaPokes = new ArrayList<>();
        listaPokes.add(poke1);
        listaPokes.add(poke2);
        listaPokes.add(new Pokedex("Bulbasaur", 10));
        Collections.sort(listaPokes, (pokedex, pokedex2) -> pokedex.getEntrenadores().compareTo(pokedex2.getEntrenadores()));
        Collections.sort(listaPokes, Comparator.comparing(Pokedex::getEntrenadores));
        listaPokes.sort((pokedex, pokedex2) -> pokedex.getEntrenadores().compareTo(pokedex2.getEntrenadores()));
        
    }

}
