package es.babel.factura;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<ItemFactura> itemFacturaList;

    public Factura() {
        this.itemFacturaList = new ArrayList<>();
    }

    public void agregarItem(ItemFactura item) {
        this.itemFacturaList.add(item);
    }

    public void eliminarItem(ItemFactura item) {
        this.itemFacturaList.remove(item);
    }

    public void eliminarItemPos(int posicion) {
        if(posicion >= 0 && posicion < this.itemFacturaList.size()) {
            this.itemFacturaList.remove(posicion);
        }
    }

    public double calcularPrecioTotalFactura() {
        double total = 0;
        for(ItemFactura item : this.itemFacturaList) {
            total += item.calcularPrecioTotalItem();
        }
        return total;
    }

    public String mostrarFactura() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura:\n");
        sb.append("Nombre\tCantidad\tPrecioUnitario\tTotal\n");
        for(ItemFactura item : this.itemFacturaList) {
            sb.append(item.mostrarItem());
        }
        return sb.toString();
    }
}
