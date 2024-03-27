package es.babel.concesionario.coche;

public class Coche {
    private String marca;
    private String modelo;
    private double precio;

    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getPrecio() {
        return this.precio;
    }
}
