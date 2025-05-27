package org.example.API.Practica2;

import java.util.ArrayList;

public class Festivo {

    public String date;
    public String localName;
    public String name;
    public String countryCode;
    public boolean fixed;
    public boolean global;
    public ArrayList<String> counties;
    public Object launchYear;
    public ArrayList<String> types;

    @Override
    public String toString() {
        return "Festivo{" +
                "date='" + date + '\'' +
                ", localName='" + localName + '\'' +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", fixed=" + fixed +
                ", global=" + global +
                ", counties=" + counties +
                ", launchYear=" + launchYear +
                ", types=" + types +
                '}';
    }
}
