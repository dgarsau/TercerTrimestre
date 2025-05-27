package org.example.EjerciciosSer.Ejercicio5;

import org.example.EjerciciosSer.Ejercicios123.Usuario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializarEmpleados {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Pepe", 1650.90);
        Empleado emp2 = new Empleado("Paco", 1726.15);
        Empleado jefe = new Jefe("Jose", 2564.35, "RRHH");

        ArrayList<Empleado> lista = new ArrayList<>(Arrays.asList(emp1, emp2, jefe));

        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/resources/empleados.ser"));

            out.writeObject(lista);

            out.close();

        } catch (IOException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

        System.out.println("Objeto serializado en empleados.ser");

    }

}
