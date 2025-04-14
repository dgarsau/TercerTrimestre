package org.example.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private Label etiqueta_contador;

    @FXML
    private Button contar;

    @FXML
    public void initialize(){

        contar.setOnAction(e -> {
            HelloApplication.contador.contar();
            System.out.println(HelloApplication.contador.getContador());
            etiqueta_contador.setText(Integer.toString(HelloApplication.contador.getContador()));
        });
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void irAPantalla2() throws IOException {
        HelloApplication.setRoot("pantalla2");
    }

}