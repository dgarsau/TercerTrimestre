package org.example.lambda.empleado;

import java.util.Date;

public class Empleado {

    private String nombre;
    private double salario;
    private Date fecha;

    public Empleado(String nombre, double salario, Date fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
