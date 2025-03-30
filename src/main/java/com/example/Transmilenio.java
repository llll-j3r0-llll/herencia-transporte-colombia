package com.example;

public class Transmilenio extends Transportepublico {
    private int numerodeparadas;

    public Transmilenio (String ruta, int numerodeparadas) {
        super("Transmilenio", ruta);
        this.numerodeparadas = numerodeparadas;

    }

    public void calculartarifatransmilenio () {
        tarifa = 3500;
        System.out.println("La tarifa del transmilenio por persona es:" + tarifa);
    }

    public void mostrarRuta () {
    System.out.println("Rutas del transmilenio" + ruta + "con " + numerodeparadas + "paradas");

    }

}
