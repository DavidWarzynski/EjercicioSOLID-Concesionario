package es.babel.almacen.piezas;

import es.babel.taller.piezas.Pieza;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AlmacenPiezas {
    private Map<Pieza, Integer> piezas;

    public AlmacenPiezas() {
        piezas = new HashMap<>();
    }

    public int obtenerCantidad(Pieza pieza) {
        return piezas.getOrDefault(pieza, 0);
    }

    public String mostrarStock() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stock completo del inventario:\n");
        for (Map.Entry<Pieza, Integer> entry : piezas.entrySet()) {
            sb.append(entry.getKey().getNombre()).append(": ").append(entry.getValue()).append(" unidades\n");
        }
        return sb.toString();
    }

    protected void actualizarStock(Pieza pieza, int cantidad) {
        piezas.put(pieza, obtenerCantidad(pieza) + cantidad);
    }

    protected boolean verificarDisponibilidad(Pieza pieza, int cantidad) {
        return obtenerCantidad(pieza) >= cantidad;
    }

    public Pieza obtenerPieza(int indice) {
        if (indice >= 0 && indice < piezas.size()) {
            int i = 0;
            for (Pieza pieza : piezas.keySet()) {
                if (i == indice) {
                    return pieza;
                }
                i++;
            }
        }
        return null;
    }

    public void decrementarCantidad(Pieza pieza,int cantidad) {
        if (piezas.containsKey(pieza)) {
            if (cantidad > 1) {
                piezas.put(pieza, - 1);
            } else {
                eliminarPieza(pieza);
            }
        }
    }

    public void eliminarPieza(Pieza pieza) {
        piezas.remove(pieza);
    }

    public Pieza obtener(Pieza pieza) {
        Set<Pieza> piezas = this.piezas.keySet();
        for (Pieza p : piezas) {
            if (p.equals(pieza)) {
                return p;
            }
        }
        return null;
    }
}
