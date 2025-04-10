package org.example.lambda.ejecutor;

@FunctionalInterface
public interface VerificarVoto {

    boolean puedeVotar(String nombre, int edad);

}
