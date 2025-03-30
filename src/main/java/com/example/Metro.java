package com.example;

public class Metro extends Transportepublico {
    private int numerodeestaciones;

    public Metro (String ruta, int numerodeestaciones) {
        super("Metro", ruta);
        this.numerodeestaciones = numerodeestaciones;
    }
    
    public void calculartarifaMetro (){
        tarifa = 5000;
        System.out.println("La tarifa del metro es: " + tarifa);
    }

    public void mostrarmapa () {
        System.out.println("Rutas del Metro: " + ruta + ", Número de estaciones: " + numerodeestaciones);

    }

}
