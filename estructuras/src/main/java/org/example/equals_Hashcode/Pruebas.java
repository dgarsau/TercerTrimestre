package org.example.equals_Hashcode;

import java.util.LinkedHashSet;

public class Pruebas {

    public static void main(String[] args) {

        Paciente raul = new Paciente("123456", "Raul", "García Delgado");
        Paciente xavi = new Paciente("456321", "Javier", "Cervera Lillo");
        Paciente javi = new Paciente("456323", "Javier", "Cervera Lillo");

        LinkedHashSet<Paciente> listaPacientes = new LinkedHashSet<>();
        listaPacientes.add(raul);
        listaPacientes.add(xavi);
        listaPacientes.add(javi);

        System.out.println(xavi.hashCode());
        System.out.println(javi.hashCode());

        System.out.println(listaPacientes);


    }

}
