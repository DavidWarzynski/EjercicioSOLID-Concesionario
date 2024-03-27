package es.babel.taller.piezas;

public class Motor extends Pieza {

    private int cilindros;

    public Motor(String nombre, double precio, int cilindros) {
        super(nombre, precio);
        this.cilindros = cilindros;
    }

    public int getCilindros() {
        return this.cilindros;
    }
}
