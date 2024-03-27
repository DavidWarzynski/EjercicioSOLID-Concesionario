package es.babel.taller.piezas;

public class Freno extends Pieza {
    private String tipoFreno;
    public Freno(String nombre, double precio, String tipoFreno) {
        super(nombre, precio);
        this.tipoFreno = tipoFreno;
    }
    public String getTipoFreno() {
        return tipoFreno;
    }
}
