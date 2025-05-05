package org.example.crud;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.time.LocalDate;

public class Mantenimiento {

    public static ObservableList<Estudiante> consulta (Connection conexion){

        ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList();

        String query = "SELECT * FROM estudiantes";

        Statement stmt;
        ResultSet respuesta;

        try {
            stmt = conexion.createStatement();
            respuesta = stmt.executeQuery(query);

            while (respuesta.next()){ //recorremos todas las filas existentes en la tabla
                listaEstudiantes.add(new Estudiante(respuesta.getInt("nia"),
                        respuesta.getString("nombre"),
                        respuesta.getDate("fecha_nacimiento").toLocalDate()));
            }

            System.out.println(listaEstudiantes);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return listaEstudiantes;

    }

    public static void insertar(Connection conexion, int nia, String nombre, LocalDate fecha){

        System.out.println("Insertando...");

        String query = "INSERT INTO estudiantes (nia, nombre, fecha_nacimiento) VALUES ("
                + nia + ", '" + nombre + "', '" + fecha + "');";

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static void modificar(Connection conexion, Estudiante estudiante, int nia, String nombre, LocalDate fecha){

        String query = "UPDATE estudiantes SET nia = " + nia +
                ", nombre = '" + nombre + "'" +
                ", fecha_nacimiento = '" + fecha +
                "' WHERE nia = " + estudiante.getNia();

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }

    public static void borrar(Connection conexion, Estudiante estudiante){

        String query = "DELETE FROM estudiantes WHERE nombre = '"+ estudiante.getNombre() +"'";

        Statement stmt;

        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }


}