package es.babel.taller.piezas;

public class Neumatico extends Pieza {
    private String tipoNeumatico;

    public Neumatico(String nombre, double precio, String tipoNeumatico) {
        super(nombre, precio);
        this.tipoNeumatico = tipoNeumatico;
    }

    public String getTipoNeumatico() {
        return this.tipoNeumatico;
    }
}
