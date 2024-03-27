package es.babel.concesionario;

import es.babel.almacen.IGestorAlmacen;
import es.babel.cliente.Cliente;
import es.babel.concesionario.coche.Coche;
import es.babel.concesionario.probador.IProbadorCoche;

public class Concesionario {
    private IGestorAlmacen<Coche> gestorAlmacenCoches;
    private IProbadorCoche probadorCoche;

    public Concesionario(IGestorAlmacen<Coche> gestorAlmacenCoches,
                         IProbadorCoche probadorCoche) {
        this.gestorAlmacenCoches = gestorAlmacenCoches;
        this.probadorCoche = probadorCoche;
    }

    public String mostrarStock() {
       return gestorAlmacenCoches.mostrarStock();
    }

    public void venderCoche(Coche coche, Cliente cliente) {
        Coche cocheAlmacen = gestorAlmacenCoches.obtener(coche);
        if (cocheAlmacen != null) {
            gestorAlmacenCoches.decrementarCantidad(coche,1);
        }
    }

    public void comprarCoche(Coche coche, int cantidad) {
        gestorAlmacenCoches.agregar(coche, cantidad);
    }

    public void probarCoche(Coche coche, Cliente cliente) {
        probadorCoche.probarCoche(coche);
    }
}
