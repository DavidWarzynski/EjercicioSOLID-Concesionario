package es.babel.almacen.coches;

import es.babel.concesionario.coche.Coche;
import es.babel.taller.piezas.Pieza;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AlmacenCoches {
    private Map<Coche, Integer> coches;
    public AlmacenCoches() {
        coches = new HashMap<>();
    }

    public void agregarCoche(Coche coche, int cantidad) {
        coches.put(coche, cantidad);
    }

    public void eliminarCoche(Coche coche) {
        coches.remove(coche);
    }

    public String mostrarStock() {
        StringBuilder builder = new StringBuilder();
        builder.append("Stock de coches disponibles:\n");
        for (Map.Entry<Coche, Integer> entry : coches.entrySet()) {
            builder.append(entry.getKey().getMarca() + " " + entry.getKey().getModelo() + " - " + entry.getValue() + " unidades\n");
        }
        return builder.toString();
    }

    public Coche obtenerCoche(int indice) {
        if (indice >= 0 && indice < coches.size()) {
            int i = 0;
            for (Map.Entry<Coche, Integer> entry : coches.entrySet()) {
                if (i == indice) {
                    return entry.getKey();
                }
                i++;
            }
        }
       return null;
    }

    public int obtenerCantidad(Coche coche) {
        return coches.getOrDefault(coche, 0);
    }

    public void decrementarCantidad(Coche coche, int cantidad) {
        if (cantidad > 1) {
            coches.put(coche, cantidad - 1);
        } else {
            eliminarCoche(coche);
        }
    }

    public boolean verificarDisponibilidad(Coche coche, int cantidad) {
        return obtenerCantidad(coche) >= cantidad;
    }

    public Coche obtenerCoche(Coche coche) {
        Set<Coche> cocheSet = this.coches.keySet();
        for (Coche c : cocheSet) {
            if (c.equals(coche)) {
                return c;
            }
        }
        return null;
    }
}
