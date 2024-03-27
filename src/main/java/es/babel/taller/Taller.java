package es.babel.taller;

import es.babel.almacen.IGestorAlmacen;
import es.babel.concesionario.coche.Coche;
import es.babel.factura.Factura;
import es.babel.factura.ItemFactura;
import es.babel.taller.piezas.Pieza;

import java.util.Map;

public class Taller {
    private IGestorAlmacen<Pieza> gestorAlmacenPiezas;

    public Taller(IGestorAlmacen<Pieza> gestorAlmacenPiezas) {
        this.gestorAlmacenPiezas = gestorAlmacenPiezas;
    }

    public Factura repararVehiculo(Coche coche, Map<Pieza, Integer> piezasCantidad) {
        Factura factura = new Factura();
        System.out.println("Reparando vehículo: " + coche);
        System.out.println("Piezas utilizadas:");
        for (Map.Entry<Pieza, Integer> entry : piezasCantidad.entrySet()) {
            gestorAlmacenPiezas.decrementarCantidad(entry.getKey(), entry.getValue());
            System.out.println(entry.getKey().getNombre() + ": " + entry.getValue() + " unidades");
            factura.agregarItem(new ItemFactura(entry.getKey().getNombre(), entry.getKey().getPrecio(), entry.getValue()));
        }
        return factura;
    }

    public void recibirVehiculo(Coche coche) {
        System.out.println("Recibiendo vehículo para reparación: " + coche);
    }

    public String mostrarStockPiezas() {
        return gestorAlmacenPiezas.mostrarStock();
    }
}
