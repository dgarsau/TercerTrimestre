package org.example.ProgramaMe;

import java.util.HashMap;
import java.util.Map;

public class MePilloElToro {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int entrada = in.nextInt();
        in.nextLine();

        if (entrada==0) {
            return false;
        }
        else {

            HashMap<String, Integer> notas = new HashMap<>();

            for (int i = 0; i<entrada ; i++){
                String key = in.nextLine();
                String value = in.nextLine();

                if(!notas.containsKey(key)){
                    if (value.equals("CORRECTO")){
                        notas.put(key, 1);
                    } else if (value.equals("INCORRECTO")){
                        notas.put(key, -1);
                    }
                } else {
                    if (value.equals("CORRECTO")){
                        notas.put(key, notas.get(key)+1);
                    } else if (value.equals("INCORRECTO")){
                        notas.put(key, notas.get(key)-1);
                    }
                }
            }

            for (Map.Entry<String, Integer> mapa : notas.entrySet()){
                if (mapa.getValue()!=0){
                    System.out.println(mapa.getKey() + ", " + mapa.getValue());
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}

