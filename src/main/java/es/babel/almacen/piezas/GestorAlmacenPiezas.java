package es.babel.almacen.piezas;

import es.babel.almacen.IGestorAlmacen;
import es.babel.taller.piezas.Pieza;

public class GestorAlmacenPiezas implements IGestorAlmacen<Pieza> {
    private AlmacenPiezas almacenPiezas;

    public GestorAlmacenPiezas(AlmacenPiezas almacenPiezas) {
        this.almacenPiezas = almacenPiezas;
    }

    @Override
    public void agregar(Pieza pieza, int cantidad) {
        almacenPiezas.actualizarStock(pieza, cantidad);
    }

    @Override
    public void eliminar(Pieza pieza) {
        almacenPiezas.eliminarPieza(pieza);
    }

    @Override
    public boolean verificarDisponibilidad(Pieza pieza, int cantidad) {
        return almacenPiezas.verificarDisponibilidad(pieza, cantidad);
    }

    @Override
    public int obtenerCantidad(Pieza pieza) {
        return almacenPiezas.obtenerCantidad(pieza);
    }

    @Override
    public String mostrarStock() {
        return almacenPiezas.mostrarStock();
    }

    @Override
    public Pieza obtener(int indice) {
        return almacenPiezas.obtenerPieza(indice);
    }

    @Override
    public Pieza obtener(Pieza pieza) {
        return almacenPiezas.obtener(pieza);
    }

    @Override
    public void decrementarCantidad(Pieza coche,int cantidad) {
        almacenPiezas.decrementarCantidad(coche,cantidad);
    }
}
