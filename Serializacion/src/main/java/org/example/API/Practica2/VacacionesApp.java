package org.example.API.Practica2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* Me conecto a una de las apis del repositorio de github para obtener los festivos de españa
 * de este año: https://date.nager.at/ */
public class VacacionesApp {

    /* Declaro la lista de vacaciones y el día actual para imprimir solo las vacaciones a partir de hoy */
    static ArrayList<Festivo> listaVacaciones = new ArrayList<>();
    static LocalDate hoy = LocalDate.now();

    public static void main(String[] args) {

        try {

            String apiUrl = "https://date.nager.at/api/v3/publicholidays/2025/ES";

            URL url = new URL(apiUrl);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                json.append(line);
            }
            in.close();

            Gson gson = new Gson();

            /* Me creo un tipo específico como en el ejercicio anterior para obtener una lista */
            Type tipoListaVacaciones = new TypeToken<List<Festivo>>(){}.getType();
            listaVacaciones = gson.fromJson(json.toString(), tipoListaVacaciones);

            System.out.println("==========================================");
            System.out.println("Días festivos a partir de hoy (" + hoy + ")");
            System.out.println("==========================================");

            /* Con este for compruebo si la fecha es mayor a hoy e imprimo */
            for (Festivo festivo: listaVacaciones){

                LocalDate fechaFestivo = LocalDate.parse(festivo.date);

                if (fechaFestivo.isAfter(hoy)){
                    System.out.println(festivo.date);
                    System.out.println(festivo.localName);
                    System.out.println("------------------------------------------");
                }
            }

        } catch (Exception e) {
            System.out.println("Algo ha ido mal.");
            e.printStackTrace();
        }

    }

}
