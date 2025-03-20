package org.example.TareasFuncionario;

import java.util.HashSet;
import java.util.Stack;

public class AppFuncionario {

    static Stack<Informe> listaInformes = new Stack<>();
    static HashSet<Informe> setInformes = new HashSet<>();

    public static void main(String[] args) {

        anyadirInforme(1, Tipo.ADMINISTRATIVO);
        anyadirInforme(1, Tipo.ADMINISTRATIVO);
        anyadirInforme(2, Tipo.ADMINISTRATIVO);
        anyadirInforme(1, Tipo.PERSONAL);
        anyadirInforme(2, Tipo.PERSONAL);
        anyadirInforme(1, Tipo.EMPRESARIAL);

        diferenciarInformes();

        mostrarInformes();
        despacharInformes();

        anyadirInforme(1, Tipo.PERSONAL);
        anyadirInforme(2, Tipo.PERSONAL);
        anyadirInforme(1, Tipo.EMPRESARIAL);

        mostrarInformes();

    }

    public static void anyadirInforme(int codigo, Tipo tipo){
        Informe informe = new Informe(codigo, tipo);
        listaInformes.push(informe);
        setInformes.add(informe);

    }

    public static void mostrarInformes(){
        for (int i = listaInformes.size()-1 ; i > 0 ; i--){
            System.out.println(listaInformes.get(i));
        }
    }

    public static void despacharInformes(){

        while (!listaInformes.isEmpty()){
            Informe hash = listaInformes.peek();
            System.out.println("Despachando: " + listaInformes.pop());
            if(!listaInformes.contains(hash)){
                setInformes.remove(listaInformes.peek());
            }
        }

    }

    public static void diferenciarInformes(){
        System.out.println("Informes diferentes: " + setInformes.size());
    }

}
