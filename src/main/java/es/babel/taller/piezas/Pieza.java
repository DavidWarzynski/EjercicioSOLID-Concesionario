package es.babel.taller.piezas;

public class Pieza {
    private String nombre;
    private double precio;

    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

}
