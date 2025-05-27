package org.example.EjerciciosSer.Ejercicio5;

import org.example.EjerciciosSer.Ejercicios123.Usuario;

import java.io.*;
import java.util.ArrayList;

public class DeserializarEmpleados {

    public static void main(String[] args) throws IOException {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/empleados.ser"));
            ArrayList<Empleado> lista = (ArrayList<Empleado>) in.readObject();
            in.close();
            System.out.println("Empleados:");
            System.out.println("----------------------------------");
            for (Empleado empleado : lista){

                if(empleado instanceof Jefe){
                    System.out.println("Jefe -----");
                } else {
                    System.out.println("Empleado -----");
                }

                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Salario: " + empleado.getSalario());

                if(empleado instanceof Jefe){
                    System.out.println("Departamento: " + ((Jefe) empleado).getDepartamento());
                }

                System.out.println("-----------------------------------");
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

    }

}
