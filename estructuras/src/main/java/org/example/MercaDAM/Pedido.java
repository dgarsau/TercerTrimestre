package org.example.MercaDAM;

import java.util.HashMap;
import java.util.Map;

public class Pedido{

    private Map<Producto, Integer> pedido;
    private double importe_total;

    public Pedido(){
        pedido = new HashMap<>();
        importe_total = 0;
    }

    public void anyadirProducto(Producto producto){
        pedido.put(producto, pedido.getOrDefault(producto,0)+1);
        importe_total += producto.getPrecio();
    }

    public void eliminarProducto(Producto producto){
        pedido.put(producto, pedido.get(producto)-1);
        if(pedido.get(producto)==0){
            pedido.remove(producto);
        }
        importe_total -= producto.getPrecio();
        /* ESTO CONTROLA QUE AL ELIMINAR TODOS LOS PRODUCTOS DESPUÉS DE APLICAR UN DESCUENTO
         * NO TOQUE PAGAR AL CLIENTE.*/
        if (importe_total<0){
            importe_total=0;
        }
    }

    public void aplicarPromo3x2(){

        for (Map.Entry<Producto, Integer> producto : pedido.entrySet()){
            if (producto.getValue()>=3){
                int veces = producto.getValue()/3; //ESTO CONTEMPLA QUE SE APLIQUE DOS VECES EN CASO DE HABER POR EJEMPLO 6 PRODUCTOS.
                importe_total -= veces*producto.getKey().getPrecio();
            }
        }
    }

    public void aplicarPromo10(){
        importe_total*=0.9;
    }

    public Map<Producto, Integer> getPedido() {
        return pedido;
    }

    public double getImporte_total() {
        return importe_total;
    }

}
