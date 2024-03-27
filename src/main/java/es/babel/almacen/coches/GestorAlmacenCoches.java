package es.babel.almacen.coches;

import es.babel.almacen.IGestorAlmacen;
import es.babel.concesionario.coche.Coche;

public class GestorAlmacenCoches implements IGestorAlmacen<Coche> {
    private AlmacenCoches almacenCoches;

    public GestorAlmacenCoches(AlmacenCoches almacenCoches) {
        this.almacenCoches = almacenCoches;
    }

    @Override
    public void agregar(Coche coche, int cantidad) {
        almacenCoches.agregarCoche(coche, cantidad);
    }
    @Override
    public void eliminar(Coche coche) {
        almacenCoches.eliminarCoche(coche);
    }

    @Override
    public boolean verificarDisponibilidad(Coche coche, int cantidad) {
        return almacenCoches.verificarDisponibilidad(coche, cantidad);
    }

    @Override
    public int obtenerCantidad(Coche coche) {
        return almacenCoches.obtenerCantidad(coche);
    }

    @Override
    public String mostrarStock() {
        return almacenCoches.mostrarStock();
    }
    @Override
    public Coche obtener(int indice) {
        return almacenCoches.obtenerCoche(indice);
    }

    @Override
    public Coche obtener(Coche coche) {
        return almacenCoches.obtenerCoche(coche);
    }

    @Override
    public void decrementarCantidad(Coche coche,int cantidad) {
        almacenCoches.decrementarCantidad(coche,cantidad);
    }
}
