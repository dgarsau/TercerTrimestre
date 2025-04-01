package org.example.MercaDAM;

import java.util.List;
import java.util.Scanner;

public class AppZonaClientes {

    static Scanner input = new Scanner(System.in);
    static Cliente cliente;

    public static void main(String[] args) {

        boolean auth=false;
        int intentos = 3;
        Mercadam mercadam = new Mercadam();

        mercadam.generarClientes();

        System.out.println("*** COMPRA ONLINE DE MERCADAM ***");
        System.out.println(mercadam.getClientes());

        do{
            auth=autentication(mercadam.getClientes());
            intentos--;
            if (!auth && intentos>0){
                System.out.println("Algo no coincide o no existe! Vuelve a intentarlo... Tienes " + intentos + " intentos.");
            }
        } while (intentos>0 && !auth);

        if (auth){
            iniciarCompra();
        }else{
            System.out.println("ERROR DE AUTENTICACIÓN.");
        }
    }

    public static boolean autentication(List<Cliente> clientes){

        System.out.print("Usuario:");
        String username = input.next();
        System.out.print("Contraseña:");
        String contrasenya = input.next();


        boolean autenticacion = false;
        for (Cliente ususario : clientes){
            if (ususario.getUsuario().equals(username) && ususario.getContrasenya().equals(contrasenya)){
                cliente=ususario;
                autenticacion=true;
                break;
            }
        }
        return autenticacion;

    }

    public static void iniciarCompra(){
        Pedido pedido = new Pedido();
    }

    public void imprimirProductos(){

    }

    public void imprimirDespedida(){

    }

}
