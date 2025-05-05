package org.example.crud;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class HelloController {

    // TABLA
    @FXML
    private TableView<Estudiante> tablaEstudiantes;
    @FXML
    private TableColumn<Estudiante, Integer> niaTableColumn;
    @FXML
    private TableColumn<Estudiante, String> nombreTableColumn;
    @FXML
    private TableColumn<Estudiante, LocalDate> fechaTableColumn;

    //ENTRADA
    @FXML
    private TextField niaTextField;
    @FXML
    private TextField nombreTextField;
    @FXML
    private DatePicker datePicker;

    @FXML
    private Button insertarEstudiante;
    @FXML
    private Button guardarEstudiante;

    private ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList();

    private Connection bd = conexion();

    @FXML
    public void initialize(){

        niaTableColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleIntegerProperty(data.getValue().getNia()).asObject());
        nombreTableColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));

        fechaTableColumn.setCellValueFactory(data ->
                new ReadOnlyObjectWrapper<>(data.getValue().getFecha_nacimiento())
        );

        actualizarTabla();

        guardarEstudiante.setDisable(true);

    }

    private static Connection conexion() {

        Connection conexion;
        String host = "jdbc:mariadb://localhost:3306/";
        String user = "root";
        String psw = "";
        String bd = "prueba";
        System.out.println("Conectando...");

        try {
            conexion = DriverManager.getConnection(host + bd, user, psw);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;

    }

    public void insertarEstudiante() {

        Integer nia;
        String nombre = nombreTextField.getText();
        LocalDate fecha = datePicker.getValue();
        try {
            nia = Integer.parseInt(niaTextField.getText());
        } catch (Exception e){
            System.out.println("NIA inválido");
            return;
        }

        Mantenimiento.insertar(bd, nia, nombre, fecha);

        actualizarTabla();

        niaTextField.clear();
        nombreTextField.clear();

    }

    public void eliminarEstudiante() {

        Estudiante seleccionado = tablaEstudiantes.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            Mantenimiento.borrar(bd,seleccionado);
            actualizarTabla();
        }else{
            System.out.println("No hay ninguna fila seleccionada.");
        }

    }

    public void modificarEstudiante() {

        Estudiante seleccionado = tablaEstudiantes.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            niaTextField.setText(String.valueOf(seleccionado.getNia()));
            nombreTextField.setText(seleccionado.getNombre());
            datePicker.setValue(seleccionado.getFecha_nacimiento());

            insertarEstudiante.setDisable(true);
            guardarEstudiante.setDisable(false);

        }else{
            System.out.println("No hay ninguna fila seleccionada.");
        }

    }

    public void guardarEstudiante() {


        Estudiante seleccionado = tablaEstudiantes.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            Integer nia;
            String nombre = nombreTextField.getText();
            LocalDate fecha = datePicker.getValue();
            try {
                nia = Integer.parseInt(niaTextField.getText());
                Mantenimiento.modificar(bd, seleccionado, nia, nombre, fecha);
            } catch (Exception e){
                System.out.println("NIA inválido");
                return;
            }
        }else{
            System.out.println("No hay ninguna fila seleccionada.");
        }

        actualizarTabla();

        insertarEstudiante.setDisable(false);
        guardarEstudiante.setDisable(true);

        niaTextField.clear();
        nombreTextField.clear();

    }

    public void actualizarTabla(){
        listaEstudiantes = Mantenimiento.consulta(bd);
        tablaEstudiantes.setItems(listaEstudiantes);
    }

}