package org.example.MercaDAM;

import java.util.*;

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
            resumenCarrito();
            menuFinal();
        }else{
            System.out.println("ERROR DE AUTENTICACIÓN.");
        }


    }

    /* METODO DE AUTENTICACIÓN, DEVUELVE UN BOOLEANO SI USUARIO Y CONTRASEÑA ESTÁN EN LA LISTA.
     * LE PASO LA LISTA DE MERCADAM. */

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
        cliente.setPedido(pedido);
        System.out.println("Bienvenid@ " + cliente.getUsuario());
        char seguir = ' ';

        do {
            System.out.println("Añade productos a tu lista de la compra...");
            imprimirProductos();
            Producto producto = null;

            System.out.print("Elige un producto: ");
            String eleccion = input.next().toUpperCase();

            try {
                producto = Producto.valueOf(eleccion);
                pedido.anyadirProducto(producto);
                System.out.println(pedido.getPedido());

                System.out.println("Has añadido " + producto + " con un precio de " + producto.getPrecio() + "€ \n" +
                        "Importe total del carrito: " + pedido.getImporte_total() + "€");
                System.out.print("¿Quieres añadir más productos a tu carrito de la compra? (S/N): ");
                seguir=input.next().toUpperCase().charAt(0);

            } catch (IllegalArgumentException e) {
                System.out.println("El producto no existe! Elige otro.");
            }

            System.out.println("============================================\n");

        }while (seguir!='N');

    }

    /* ESTO LO HE HECHO ASÍ PARA EMBUCLARLO LLAMÁNDOSE A SÍ MISMO*/
    public static void menuFinal(){
        System.out.println("¿QUÉ DESEA HACER?\n");
        System.out.println("[1]. Aplicar promo.");
        System.out.println("[2]. Mostrar resumen ordenado por uds.");
        System.out.println("[3]. Eliminar productos.\n");
        System.out.println("[X]. Terminar pedido.\n");

        System.out.println("\n============================================\n");
        System.out.print("Introduce tu elección: ");
        char eleccion_menu = input.next().toUpperCase().charAt(0);
        System.out.println("\n============================================\n");


        switch (eleccion_menu){
            case '1':
                if (cliente.isPromociones()){
                    System.out.println("YA HAS APLICADO TUS PROMOS.");
                } else {
                    cliente.getPedido().aplicarPromo3x2();
                    cliente.getPedido().aplicarPromo10();
                    cliente.setPromociones(true);
                    resumenCarrito();
                }
                System.out.println("\n============================================\n");
                menuFinal();
                break;
            case '2':
                List<Map.Entry<Producto, Integer>> lista = new ArrayList<>(cliente.getPedido().getPedido().entrySet());
                lista.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
                System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:\n");
                System.out.println("Productos ordenados por uds:\n");
                for (Map.Entry<Producto, Integer> producto : lista) {
                    System.out.println(producto.getValue() + " " + producto.getKey() + " " + producto.getKey().getPrecio() + "€");
                }
                System.out.println("\n============================================\n");

                menuFinal();
                break;
            case '3':
                System.out.println("¿QUÉ PRODUCTO QUIERES ELIMINAR?");
                System.out.println(cliente.getPedido().getPedido().entrySet());
                System.out.print("Elige un producto: ");
                String eleccion = input.next().toUpperCase();
                try {
                    Producto producto = Producto.valueOf(eleccion);
                    cliente.getPedido().eliminarProducto(producto);
                    System.out.println("Has eliminado una unidad de " + producto);
                    System.out.println("Nuevo importe total " + cliente.getPedido().getImporte_total());

                } catch (IllegalArgumentException e) {
                    System.out.println("El producto a eliminar no está en la lista.");
                }
                System.out.println("\n============================================\n");

                menuFinal();
                break;
            case 'X':
                imprimirDespedida();
                break;
            default:
                System.out.println("Elección no válida.");
                menuFinal();
                break;
        }

    }

    /* LOS MÉTODOS DE ABAJO SOLAMENTE IMPRIMEN (DESPEDIDA Y PRODUCTOS). */

    public static void imprimirProductos(){

        for (Producto producto: Producto.values()){
            System.out.println("\t" + producto + " " + producto.getPrecio());
        }

        System.out.println("============================================\n");
    }

    public static void resumenCarrito(){
        System.out.println("RESUMEN DE TU CARRITO DE LA COMPRA:\n");
        System.out.println("Productos:\n");

        for (Map.Entry<Producto, Integer> producto : cliente.getPedido().getPedido().entrySet()){
            System.out.println(producto.getValue() + " " + producto.getKey() + " " + producto.getKey().getPrecio());
        }

        System.out.println("IMPORTE TOTAL: " + cliente.getPedido().getImporte_total());

        System.out.println("============================================\n");

    }

    public static void imprimirDespedida(){
        System.out.println("GRACIAS POR SU PEDIDO. Se lo mandaremos a la dirección " + cliente.getDireccion() + ".");
    }


}
