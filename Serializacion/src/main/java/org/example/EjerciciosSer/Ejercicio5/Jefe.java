package org.example.EjerciciosSer.Ejercicio5;

public class Jefe extends Empleado{

    private String departamento;

    public Jefe(String nombre, double salario, String deprtamento) {
        super(nombre, salario);
        this.departamento = deprtamento;
    }

    public String getDepartamento() {
        return departamento;
    }

}

