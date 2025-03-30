package com.example;

public class Transportepublico {
    protected String tipo;
    protected String ruta;
    protected double tarifa;
    protected double distanciaRecorrida;
    protected int tiempoRecorrido;

    public Transportepublico(String tipo, String ruta) {
        this.tipo = tipo;
        this.ruta = ruta;
        this.tarifa = 0.0;
        this.distanciaRecorrida = 0.0;
        this.tiempoRecorrido = 0;
    }

    public void calcularTarifa() {
        System.out.println("La tarifa base es: " + tarifa);
    }

    public void calcularDistanciaRecorrida(double distancia) {
        this.distanciaRecorrida = distancia;
        System.out.println("Distancia recorrida: " + distancia + " km");
    }

    public void calcularTiempoRecorrido(int tiempo) {
        this.tiempoRecorrido = tiempo;
        System.out.println("Tiempo de recorrido: " + tiempo + " minutos");
    }
}
