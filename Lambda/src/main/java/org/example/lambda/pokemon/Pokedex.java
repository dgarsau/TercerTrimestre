package org.example.lambda.pokemon;

public class Pokedex {

    private String pokemon;
    private Integer entrenadores;

    public Pokedex(String pokemon, Integer entrenadores){
        this.pokemon=pokemon;
        this.entrenadores=entrenadores;
    }

    public String getPokemon() {
        return pokemon;
    }

    public Integer getEntrenadores() {
        return entrenadores;
    }

}
