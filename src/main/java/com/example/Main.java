package com.example;

public class Main {
public static void main(String[] args) {
    Bus bus1 = new Bus ("Ruta 1", 50);
    bus1.calculartarifaBus();
    bus1.mostrarinformacion();

    Metro metro1 = new Metro ("Ruta A", 10);
    metro1.calculartarifaMetro();
    metro1.mostrarmapa();

    Transmilenio transmilenio1 = new Transmilenio ("Ruta B", 20);
    transmilenio1.calculartarifatransmilenio();
    transmilenio1.mostrarRuta();
 

        
    }
}