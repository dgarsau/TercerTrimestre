package org.example.lambda;

public class Prueba {

    public static void main(String[] args) {

        Pruebator pruebator = new Pruebator() {
            @Override
            public String prueba(String texto) {
                System.out.println("Hola desde " + texto);
                return texto.toUpperCase();
            }
        };

        Pruebator lambda = (texto) -> {
            System.out.println("Hola desde " + texto);
            return texto.toUpperCase();
        };

        String resultado_anonima = pruebator.prueba("una clase anónima");
        String resultado_lambda = lambda.prueba("una lambda");
        System.out.println(resultado_anonima);
        System.out.println(resultado_lambda);


    }

}
