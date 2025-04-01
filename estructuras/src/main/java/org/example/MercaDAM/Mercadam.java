package org.example.MercaDAM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mercadam {

    static Random random = new Random();

    static List<Cliente> clientes = new ArrayList<>();
    static String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public void generarClientes(){
        String usuario = "";
        for (int i = 0; i<8 ; i++){
            int index = random.nextInt(caracteres.length());
            usuario = usuario.concat(String.valueOf(caracteres.charAt(index)));
        }

        String contrasenya = "";
        for (int i = 0; i<8 ; i++){
            int index = random.nextInt(caracteres.length());
            contrasenya = contrasenya.concat(String.valueOf(caracteres.charAt(index)));
        }

        System.out.println(usuario + " " + contrasenya);
        clientes.add(new Cliente(usuario, contrasenya));
    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

}
