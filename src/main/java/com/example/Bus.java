package com.example;

public class Bus extends Transportepublico {
    private int capacidad;

    public Bus(String ruta,int capacidad){
        super("Bus", ruta);
        this.capacidad = capacidad;

    }

    public void calculartarifaBus () {
        tarifa = 4000;
        System.out.println("La tarifa del bus es: " + tarifa);
    }

    public void mostrarinformacion () {
        System.out.println("Tipo:"  + tipo + ",Ruta: " + ruta + ",Capacidad: " + capacidad + "pasajero: ");

    }


}
